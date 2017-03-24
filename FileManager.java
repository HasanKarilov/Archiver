package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Created by hanaria on 3/24/17.
 */
public class FileManager {
    //корневой путь директории
    private Path rootPath;
    public FileManager(Path rootPath) throws IOException{
        this.rootPath = rootPath;
    }
}
