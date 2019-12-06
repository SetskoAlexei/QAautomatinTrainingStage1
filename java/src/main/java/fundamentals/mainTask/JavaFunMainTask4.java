package fundamentals.mainTask;

import java.util.Scanner;
// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
class JavaFunMainTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("введите первое число: ");
        int a = scanner.nextInt ();
        Scanner scanner2 = new Scanner (System.in);
        System.out.print ("введите второе число: ");
        int b = scanner2.nextInt ();
        Scanner scanner3 = new Scanner (System.in);
        System.out.print ("введите третье число: ");
        int c = scanner3.nextInt ();
        int add =  a + b + c;
        int mult = a * b * c;
        System.out.println ("сумма " + add);
        System.out.print ("произведение " + mult);
    }
}