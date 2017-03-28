package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hanaria on 3/27/17.
 */
public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Введите полный путь файла в архиве:");
        Path sourcePath = Paths.get(ConsoleHelper.readString());
        zipFileManager.removeFile(sourcePath);

        ConsoleHelper.writeMessage("Удаление из архива завершено.");
    }
}
