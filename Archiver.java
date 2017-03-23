package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hanaria on 3/23/17.
 */
public class Archiver {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите полный путь к файлу архива (куда будем сжимать): ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String archivePath = bufferedReader.readLine();
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(archivePath));

        System.out.println("Введите путь к файлу, который будем архивировать (что будем сжимать): ");

        String archivedFile = bufferedReader.readLine();
        zipFileManager.createZip(Paths.get(archivedFile));
    }
}