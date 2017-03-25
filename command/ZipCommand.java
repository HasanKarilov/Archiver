package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.io.File;

/**
 * Created by hanaria on 3/24/17.
 */
public abstract class ZipCommand implements Command{
    public ZipFileManager getZipFileManager() throws Exception{
        ConsoleHelper.writeMessage("Введите полный путь к файлу");
        String fileName = ConsoleHelper.readString();
        File file = new File(fileName);
        return new ZipFileManager(file.toPath());

    }
}
