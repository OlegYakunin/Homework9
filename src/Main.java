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
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int max = 0;
        for (final int current : arr) {
            if (current > max) {
                max = current;
            }
        }
        int min = 200_000;
        for (final int current : arr) {
            if (current < min) {
                min = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        double sum = 0;
        for (int element : arr) {
            sum += element;
        }

        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName [i];
            reverseFullName [i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        System.out.println();
        System.out.println(Arrays.toString(reverseFullName));
    }
}