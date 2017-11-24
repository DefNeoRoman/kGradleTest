package com.task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    public static final String DELIMITER = " ";
    private File file;

    public WordCount(String file) {
        this(new File(file));
    }

    public WordCount(File file) {
        this.file = file;
    }

    int count(String word) throws IOException {
        if (word.isEmpty()) return 0;
        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        int num = 0;
        try {
            reader = new BufferedReader(new FileReader(file));
            while (reader.ready()) {
                sb.append(reader.readLine());

            }
            String[] lines = sb.toString().split(DELIMITER);

            for (int i = 0; i < lines.length; i++) {
                Matcher m = pattern.matcher(lines[i]);
                while (m.find()) {
                    ++num;
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        InputStream stream = WordCount.class.getResourceAsStream("/some_text.txt");
        System.out.println(stream != null);
        stream = WordCount.class.getClassLoader().getResourceAsStream("some_text.txt");
        System.out.println(stream != null);

    }
}
