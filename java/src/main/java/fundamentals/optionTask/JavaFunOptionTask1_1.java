package fundamentals.optionTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class JavaFunOptionTask1_1 {
    public static void main(String[] args) throws Exception {

//   Нужно ввести n чисел с консоли, найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        System.out.println ("сколько будет чисел?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ArrayNumbers [] = new String[n];
        System.out.println ("введите ваши числа");
        for (int i = 0; i <n ; i++) {
            ArrayNumbers[i] =String.valueOf(Integer.parseInt(br.readLine()));

        }
        max(ArrayNumbers);
        min(ArrayNumbers);
    }
    public static void max(String[] n) {
        String maxNumber = n[0];
        int maxLength = n[0].length();
        for (int i = 0; i <n.length ; i++) {
            if (n[i].length()>maxLength) {
                maxLength=n[i].length();
                maxNumber=n[i];
            }
        }
        System.out.println("Максимальное число: "+ maxNumber +" Его длинна: "+maxLength);

    }
    public static void min(String[] n)  {
        String minNumber = n[0];
        int minLength = n[0].length();
        for (int i = 0; i <n.length ; i++) {
            if (n[i].length()<minLength){
                minLength=n[i].length();
                minNumber=n[i];
            }
        }
        System.out.println("Минимальное число: "+minNumber+" Его длинна: "+minLength);

    }
}
