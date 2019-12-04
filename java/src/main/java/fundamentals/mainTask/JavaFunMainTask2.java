package fundamentals.mainTask;

import java.util.Scanner;

class JavaFunMainTask2 {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        System.out.println ("Enter numbers");
        String input = keyboard.nextLine();
        String[] numbersStr = input.split("");
        int[] num = new int[numbersStr.length];
        for( int i = num.length - 1 ; i >= 0 ; i--) {
            num[i] = Integer.parseInt(numbersStr[i]);
            System.out.printf ("Reverse : %s%n", num[i ]);
        }
    }
}