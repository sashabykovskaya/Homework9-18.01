import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        } System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i = 1; i > arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день " + min);
        System.out.println("Максимальная сумма трат за день " + max);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int [] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        int n = reverseFullName.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName [n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        System.out.println();
        System.out.println(Arrays.toString(reverseFullName));
        System.out.println();
        System.out.print(reverseFullName);
    }
}