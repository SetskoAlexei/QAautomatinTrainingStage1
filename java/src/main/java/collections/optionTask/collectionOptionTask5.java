import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.

class collectionOptionTask5 {
    private static ArrayList<Integer> numbers = new ArrayList<> ();

    public static void main(String[] args){
        generateRandomList();
        sortNumbers();
    }

     private static void sortNumbers() {
         List<Integer> swapNumbers = numbers.stream ().sorted ((o1, o2) -> o2).collect (Collectors.toList ());
         System.out.println (swapNumbers);
     }
     private static void generateRandomList() {
        numbers.add ((int) (-50 + (Math.random ()*99)));
        numbers.add ((int) (-50 + (Math.random ()*99)));
        numbers.add ((int) (-50 + (Math.random ()*99)));
        numbers.add ((int) (-50 + (Math.random ()*99)));
        numbers.add ((int) (-50 + (Math.random ()*99)));
        numbers.add ((int) (-50 + (Math.random ()*99)));
     }
}
