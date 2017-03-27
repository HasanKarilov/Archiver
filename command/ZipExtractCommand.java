package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;
import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;

import java.nio.file.Paths;

/**
 * Created by hanaria on 3/27/17.
 */
public class ZipExtractCommand extends ZipCommand {

    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Распаковка архива.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Введите путь для распаковки:");
            zipFileManager.extractAll(Paths.get(ConsoleHelper.readString()));

            ConsoleHelper.writeMessage("Архив был распакован.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("Неверный путь для распаковки.");
        }
    }
}
