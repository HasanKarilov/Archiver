package com.javarush.task.task31.task3110;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by hanaria on 3/23/17.
 *  ZipFileManager менеджер архива. Он будет совершать операции над файлом архива
 *  (файлом, который будет храниться на диске и иметь расширение zip).
 */
public class ZipFileManager {
    // В ней мы будем хранить полный путь к архиву, с которым будем работать.
    private Path zipFile;

    public ZipFileManager(Path zipFile){
        this.zipFile = zipFile;
    }
    //Path source – это путь к чему-то, что мы будем архивировать.
    public void createZip(Path source) throws Exception {

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile)))
        {
            ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
            zipOutputStream.putNextEntry(zipEntry);
            try (InputStream inputStream = Files.newInputStream(source)) {
                byte[] buffer = new byte[1024];
                while (inputStream.available() > 0) {
                    int data = inputStream.read(buffer);
                    zipOutputStream.write(buffer, 0, data);
                    zipOutputStream.flush();
                }
            }
            zipOutputStream.closeEntry();
        }
    }
}