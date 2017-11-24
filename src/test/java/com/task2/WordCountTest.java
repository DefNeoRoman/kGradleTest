package com.task2;

import org.junit.Test;
import sun.misc.Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.*;

public class WordCountTest {
    private static final String SEARCH_WORD = "Temporibus";
    URL url = this.getClass().getResource("/some_text.txt");
    File file = new File(url.toURI());
    private WordCount wordCount = new WordCount(file);

    public WordCountTest() throws URISyntaxException {

    }

    @Test
    public void count() throws Exception {

        assertEquals(wordCount.count(SEARCH_WORD), 2);


    }

}