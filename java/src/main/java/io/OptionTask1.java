package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
class OptionTask1 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("data\\OptionTask1.txt");
        int[] randomNumbers = new int[9];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random () * 9);
        }
        try {
            PrintStream stream = new PrintStream (new FileOutputStream (file));
            for ( int randomNum : randomNumbers){
                stream.println (randomNum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }

        ArrayList<String> sortlist = new ArrayList<> ();
        Scanner scanner = new Scanner (file);
        while (scanner.hasNext ()){
            sortlist.add (scanner.nextLine ());
        }
        Collections.sort (sortlist);
        PrintStream finalStream = new PrintStream (new FileOutputStream (file));
        finalStream .println (sortlist);
    }
}