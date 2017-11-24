package com.task4;

import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public abstract class AbstractFileCopyTest {
    private FileCopyUtilInterface fileCopyUtil;
    URL url = this.getClass().getResource("/some_text.txt");
    File src;
    private File dest = new File("newSomeText");
    public AbstractFileCopyTest(FileCopyUtilInterface fileCopyUtil) {
        try {
            src  = new File(url.toURI());
            this.fileCopyUtil = fileCopyUtil;
        }catch(URISyntaxException e){

        }

    }
    @Test
    public void copyTest() throws IOException {
        long start = System.nanoTime();
        fileCopyUtil.copy(src, dest);
        System.out.println("Время копирования файла с помощью класса"+fileCopyUtil.getClass()+" = "+(System.nanoTime()-start));

    }

    @After
    public void cleanDest(){
        dest.delete();
    }

}
