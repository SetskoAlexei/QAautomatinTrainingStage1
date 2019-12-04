package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OptionTask3 {
   // Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
    public static void main(String[] args) throws IOException {
        File inputFileOptionTask3 = new File ("D:\\java\\src\\main\\java\\io\\OptionTask3subject.java");
        File outputFileOptionTask3 = new File ("data\\OutputFileOptionTask3.java");
        PrintStream stream = new PrintStream (new FileOutputStream (outputFileOptionTask3));
            Scanner scanner = new Scanner (inputFileOptionTask3);
            ArrayList<String> textOptionTask3subject = new ArrayList<> ();
            while (scanner.hasNext ()){
                textOptionTask3subject.add(scanner.nextLine ());
            }

        for (String reverse : textOptionTask3subject) {
            StringBuilder reverseWrite = new StringBuilder (reverse);
            reverseWrite.reverse ();
            stream.println (reverseWrite);
        }
    }
}
