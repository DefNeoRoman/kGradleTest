package com.task4;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileCopyWithApache implements FileCopyUtilInterface {
    @Override
    public void copy(File source, File dest) throws IOException {
        FileUtils.copyFile(source, dest);
    }
}
