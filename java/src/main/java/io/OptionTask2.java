package io;

import java.io.*;
import java.util.Scanner;

public class OptionTask2 {

//  Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.

    public static void main(String[] args) throws FileNotFoundException {
        StringBuffer stringBuffer = new StringBuffer ();
        File file = new File ("D:\\java\\src\\main\\java\\io\\OptionTask2subject.java");
        Scanner scanner = new Scanner (file);
        while (scanner.hasNext ()){
            String stringRead = scanner.nextLine ();
            stringBuffer.append (stringRead.replaceAll ("public", "private"));
            stringBuffer.append ('\n');
        }
        PrintStream stream = new PrintStream (new FileOutputStream (file));
        stream.println (stringBuffer);
    }
}
