package com.streamchampion.domain;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Loggable {

    public void createLogs(String error) throws IOException {



        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        String nameFile = ("NewLogs"+date+".txt");
        try{
            File directory = new File("Logs");
            directory.mkdir();
            File newFile = new File(directory.getAbsolutePath()+File.separator+nameFile);
            newFile.createNewFile();
        }
        catch(IOException e){}
    }}


//        FileUtils.writeStringToFile(file, error, "utf-8");


