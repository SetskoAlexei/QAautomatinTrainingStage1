package fundamentals.optionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class JavaFunOptionTask1_5 {
// Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
    public static void main(String[] args) {
        int e = 0;
        System.out.println ("Введите число - как много переменных вы хотите добавить в массив и нажмите <Enter>:");
        Scanner scan = new Scanner (System.in);
        int numDigits = scan.nextInt ();

        int [] ourDigi = new int[numDigits];
        System.out.println ("Введите ваши числа до 999");
        int i;
        for (i = 0; i < numDigits; i++) {
            ourDigi[i] = scan.nextInt ();
        }
    // осортировываем чётные
            for (int n = 0; n < i; n++) {
                if (ourDigi[n] % 2 == 0) {
                    System.out.println (ourDigi[n] + " чётное");

                }
      // отсортировываем остальные с равным количеством чётных и нечётных цифр в их числе
                else {
                    int c = ourDigi[n];
                    List<Integer> nums = new ArrayList<> ();
                    while (c != 0) {
                        nums.add(c % 10);
                        c /= 10;

                    }
                    for ( i = 0; i < nums.size (); i++){
                        if (nums.get (i) % 2 == 0){
                            e++;
                        }
                        else {
                            e--;
                        }
                    }
                    if (e==0){
                        System.out.println ("нечётное число " + ourDigi[n] + " имеет равное количество чётных и нечётных цифр");
                 }
                    else {
                        e = 0;
                    }
             }
         }
    }
}

