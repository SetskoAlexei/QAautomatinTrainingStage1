package fundamentals.mainTask;

class JavaFunMainTask3 {
 //   Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main(String[] arg) {
        int[] a = new int[]{5, 4, 3, 2, 1};
        for (int i : a) {
            System.out.print (i);

        }
    }

    static {
        int[] b = new int[]{5, 4, 3, 2, 1};
        for (int q : b) {
            System.out.println (q);

        }
    }
}