package com.task4;

import java.io.File;
import java.io.IOException;
//4. Утилита для копирования файлов. На вход программе подается имя копируемого
//        файла и имя для конечного файла. Дополнительные условия:
//        •на консоль должно выводиться время, потраченное на копирование файла;
//        •алгоритм копирования должен быть наиболее оптимальным.

public interface FileCopyUtilInterface {
    void copy(File source, File dest) throws IOException;
}
