package com.streamchampion.domain;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Loggable {

    public void createLogs(String error) throws IOException {

        File file = new File("Logs.txt");

        FileUtils.writeStringToFile(file, error, "utf-8");

    }
}
