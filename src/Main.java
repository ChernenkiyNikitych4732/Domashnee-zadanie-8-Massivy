import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        System.out.println("Решение задача №1");
        //Целочисленный массив, заполненный тремя цифрами
        // — 1, 2 и 3 — с помощью ключевого слова new.
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        //Массив, в котором можно хранить три дробных числа
        // — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        double[] twentyOne = {1.57, 7.654, 9.986};
        //или такой способ
        double[] two = new double[3];
        two[0] = 1.57;
        two[1] = 7.654;
        two[2] = 9.986;
        //Произвольный массив. Тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами.
        int[] three = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        // Задача №2
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.
        System.out.println("Задача №2");
        System.out.println("Решение задача №2");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != one.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        // Задача №3
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо. Если в задаче № 2 в консоль у вас вывелся результат:
        // 1, 2, 3
        // 1.57, 7.654, 9.986
        // произвольные элементы третьего массива то в этой задаче результат должен быть таким:
        // 3, 2, 1
        // 9.986, 7.654, 1.57
        // произвольные элементы третьего массива в обратном порядке
        System.out.println("Задача №3");
        System.out.println("Решение задача №3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Задача №4
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        // ВАЖНО! код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы. Распечатайте результат преобразования в консоль.
        // Если формат вывода элементов массива в консоль не важен, то распечатайте элементы массива с помощью метода Arrays.toString ().
        // Для этого после объявления и инициализации массива напишите команду System.out.println, внутри нее — Arrays.toString, в круглых скобках которого укажите имя массива:
        // int [] arr = {1, 2, 3}; System.out.println(Arrays.toString(arr));
        // Метод выводит элементы массива одной строчкой через запятую в квадратных скобках: [1, 2, 3]

        System.out.println("Задача №4");
        System.out.println("Решение задача №4");
        for (int i = 0; i < three.length; i++) {
            if (three[i] % 2 != 0) {
                three[i] += 1;
            }
        }
        System.out.println(Arrays.toString(three));
    }
}