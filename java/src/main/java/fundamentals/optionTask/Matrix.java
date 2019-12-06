package fundamentals.optionTask;

import java.lang.*;
        import java.util.Scanner;

class Matrix {
  //  Ввести с консоли n - размерность матрицы a [n] [n].
  //  Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
  //  Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
    public static void main(String[] args) {
        // Генерация матрицы
        System.out.println ("введите количество строк ");
        Scanner scan = new Scanner (System.in);
        int srings = scan.nextInt ();
        System.out.println ("введите количество столбцов ");
        Scanner scanR = new Scanner (System.in);
        int row = scanR.nextInt ();
        int[][] matrix = new int[srings][row];
        System.out.println ("ваши числа (в диапазоне от 0 до 999");
        for (int i = 0; i < matrix.length; i++, System.out.println()) {
            for (int n = 0; n < matrix[i].length; n++) {
                matrix[i][n] = (int) (Math.random () * 999);
                System.out.print ( matrix[i][n] + " ");
            }
        }
        bubbleSort(matrix);
    }
    // Сортировка строк
    private static void bubbleSort(int[][] matrix) {
        for (int t = 0; t < matrix.length; t++){
            for (int i = matrix[t].length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (matrix[t][j] > matrix[t][j + 1]) {
                        int a = matrix[t][j];
                        matrix[t][j] = matrix[t][j + 1];
                        matrix[t][j + 1] = a;
                    }
                }
            }
        }
        System.out.println ("отсортированные строки");
        for (int i = 0; i < matrix.length; i++, System.out.println ()) {
            for (int t = 0; t < matrix[i].length; t++)
                System.out.print (matrix[i][t] + " ");
        }
    // Сортировка столбцов
        for (int c = 0; c < matrix.length; c++) {
            for (int i = matrix[c].length; i > 0; i--)
                for (int t = 0; t < matrix.length - 1; t++) {
                    for (int j = 0; j < i; j++) {
                        if (matrix[t][j] > matrix[t + 1][j]) {
                            int a = matrix[t][j];
                            matrix[t][j] = matrix[t + 1][j];
                            matrix[t + 1][j] = a;
                        }
                    }
                }
            }
        System.out.println ("отсортированные столбцы");
        for (int i = 0; i < matrix.length; i++, System.out.println ()) {
            for (int t = 0; t < matrix[i].length; t++)
                System.out.print (matrix[i][t] + " ");
        }
    }
}