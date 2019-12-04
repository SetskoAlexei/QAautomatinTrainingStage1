package fundamentals.mainTask;

import java.util.Scanner;

class JavaFunMainTask1 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Input name:");
        String name = In.nextLine();
        System.out.println("Hello " + name );
    }
}