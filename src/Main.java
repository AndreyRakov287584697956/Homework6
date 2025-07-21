public class Main {
    public static void main(String[] args) {
        int[]array = {6, 96, 78, 43, 55, 12};
        System.out.println("Исходный массив:");
        for (int i: array){ //Вывод через for-each
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Изменённый массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
            System.out.println(array[i]);
        }
    }
}