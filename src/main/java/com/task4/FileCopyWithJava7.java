package com.task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopyWithJava7 implements FileCopyUtilInterface {

    @Override
    public void copy(File source, File dest) throws IOException {

        if(dest.exists()){
            dest = new File(dest.getName());
        }
        Files.copy(source.toPath(), dest.toPath());
    }
}
