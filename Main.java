public class Main {
    public static void main(String[] args) {
        printHello();
        System.out.println(hello("Elena"));

        System.out.printf("%s * %s = %s%s", 2, 3, multiply(2, 3), System.lineSeparator());

        int factorial = factorial(3);
        System.out.println(factorial);

        // 1.
        System.out.println(sumRange(3, 6));

        // 2.
        System.out.println(add(5, 7));
        System.out.println(add("жызнь ", "боль"));


        // 3.
        int[] array = {3, 5, 7, 2, 8, -1, 4};
        System.out.println("Максимальный элемент в массиве: " + findMax(array));

        // 4.
        System.out.println("Факториал числа:" + " " + factorialN(4));

        // 5.
        System.out.println("Площадь круга: " + getArea(5));
        System.out.println("Площадь прямоугольника: " + getArea(4, 3));

        // 6.
        System.out.println("Cреднее арифметическое: " + getAverage(6, 4, 7));

        // 7.
        System.out.println("Длина гипотенузы: " + calculateHypotenuse(5, 4));

    }

    /**
     * (модификатор доступа)
     * (static - вызов метода возможен без создания обьекта)
     * (возвращаемый типа или void)
     * (имя метода)
     * (входящие параметры)
     */
    public static void printHello() {
        System.out.println("Hello");
    }

    public static String hello(String name) {
        return "Hello " + name;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Одниковые названия методов, но разные типы данных (входящие) или количество параметров
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Рекурсия
     * Факториал 3! = 1 * 2 * 3 = 6
     */
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * factorial(3)
     *     3 * factorial(2)
     *          2 * factorial(1)
     *               1 (базовый случай)
     *          -> 2 * 1 = 2
     *     -> 3 * 2
     * -> 6
     */

    /*
    1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона)
     и возвращает сумму всех чисел между ними (включительно).
    */
    public static int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    public static int add(int a, int b) {
        return a + b;
    }
    public static String add(String a, String b) {
        return a + b;
    }

    // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    public static long factorialN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    public static double getArea(int r) {
        return Math.round(Math.PI * r * r) * 100 / 100.0;
    }
    public static int getArea(int a, int b) {
        return a * b;
    }

    // 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
    public static double getAverage(int a, int b, int c) {
        return Math.round((a + b + c) * 100.0 / 3) / 100.0;
    }

    // 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
    public static double calculateHypotenuse(int a, int b) {
        return Math.round(Math.sqrt((a * a) + (b * b)) * 100) / 100.0;
    }
}