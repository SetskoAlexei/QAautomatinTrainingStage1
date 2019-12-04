package collections.optionTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

public class collectionOptionTask1 {
    static Scanner fileNote;
    static List<String> notes = new ArrayList<> ();
    public static void main(String[] args) throws IOException {
        openFile();
        readFileAndCopy();
        outputFile ();
    }
    private static void outputFile() throws IOException {
        Collections.reverse (notes);
        FileWriter writer = new FileWriter("res/OutStringRevers.txt");
        for (int i = 0; i < notes.size (); i++) {
            writer.write (notes.get (i) + "\n");
        }
        writer.close ();

    }
    private static void readFileAndCopy(){
        while (fileNote.hasNext ()){
                notes.add (fileNote.nextLine ());
        }
    }

    private static void openFile() {
        try {
             fileNote = new Scanner (new File ("res/OutStringRevers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
    }
}
