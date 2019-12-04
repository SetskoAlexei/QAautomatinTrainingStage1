import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.

public class collectionOptionTask6 {
    static Scanner fileSorting;
    static ArrayList<String> list = new ArrayList<> ();
    public static void main(String[] args){
        openFile();
        readAndSortFile();

    }
    private static void openFile()  {
        try {
            fileSorting = new Scanner (new File ("res/Sorting.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }

    }
    private static void readAndSortFile(){
        while (fileSorting.hasNext ()){
                list.add (fileSorting.nextLine ());
        }
           Collections.sort (list);
        System.out.println (list);
    }
}
