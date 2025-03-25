package com.epam.mjc.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Path pathFile = Paths.get(file.getAbsolutePath());
        try{
            List<String> lines = Files.readAllLines(pathFile);
            String[] name = lines.get(0).split(": ");
            String[] age = lines.get(1).split(": ");
            String[] email = lines.get(2).split(": ");
            String[] phone = lines.get(3).split(": ");
            return new Profile(name[1], Integer.valueOf(age[1]), email[1], Long.valueOf(phone[1]));

        } catch (IOException e) { // Updated by changing this RuntimeException to IOException
            throw new RuntimeException(e);
        }

    }
}
