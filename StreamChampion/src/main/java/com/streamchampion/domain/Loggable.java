package com.streamchampion.domain;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Loggable {

    public void createLogs(String error, String caminhoPasta, String arquivoLog) {

        String strDateFormat = "yyyy-MM-dd";
        String strHourFormat = "HH.mm.ss";
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        DateFormat hourFormat = new SimpleDateFormat(strHourFormat);
        String dateFinal = dateFormat.format(date) + " " + hourFormat.format(date);

        File arquivo;
        FileReader fileReader;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;

        try {
            new File(caminhoPasta).mkdir();

            FileWriter newFile = new FileWriter(caminhoPasta + arquivoLog + dateFinal + ".txt");

            arquivo = new File(caminhoPasta + arquivoLog + dateFinal + ".txt");
            fileReader = new FileReader(arquivo);
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(newFile);

            bufferedWriter.write("INFO " + error);
            bufferedReader.close();
            bufferedWriter.close();

        } catch (Exception e) {
            new Loggable().createLogs(e.toString(), "Logs/", "Log");
            System.out.println(e);
        }
    }
}



















        //        System.out.println(formatter.format(date));
//        try{
//            File directory = new File("Logs");
//            directory.mkdir();
//            FileWriter nameFile = new FileWriter(error+"RegisterLogs.txt");
//            File newFile = new File(directory.getAbsolutePath()+File.separator+nameFile);
//            newFile.createNewFile();
//        }
//        catch(IOException e){}
//    }}


//            FileUtils.writeStringToFile(file, error, "utf-8");


