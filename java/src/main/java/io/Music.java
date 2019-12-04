package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

 class Music {
    private static ArrayList<String> list = new ArrayList<> ();
    private static ArrayList<String> dir = new ArrayList<> ();
    private static ArrayList<String> files = new ArrayList<> ();
    private static float lengthFile;

    public static void main(String[] args) throws FileNotFoundException {
            System.out.println (args[0]);
            System.out.println (args[1]);
            File file = new File (args[1]);
            if (file.isFile ()){
                Scanner scanner = new Scanner (new File (String.valueOf (file)));
                while (scanner.hasNext ()){
                    list.add (scanner.nextLine ());
                }
                for (String string :list) {
                    if (string.contains (".mp3")){
                        files.add (string);
                    }
                    else {
                        dir.add (string);
                    }

                }
                for (String lengthFiles :files) {
                     lengthFile += lengthFiles.length ();

                }
                System.out.println ("количество папок: " + dir.size ());
                System.out.println ("количество файлов: " + files.size ());
                System.out.println ("среднее количество файлов в папке = " + files.size ()/dir.size ());
                System.out.println ("средняя длина названия файла: " + (lengthFile/files.size ()));
            }

    }
}
