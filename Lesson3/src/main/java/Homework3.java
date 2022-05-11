import java.util.Scanner;

public class Homework3Part1 {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
    }
}
    //1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

public class Homework3Part2 {


    public static void main(String[] args) {

        int num;
        System.out.println("Введите число: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число четное");
            if ("int num" !=
        } else {
            System.out.println("Число нечетное");
            if ("int num" !=
        }

        int)
        System.out.println("Ошибка ввода числа");


    }
}
//Проверка четности числа
//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошике.

public class Homework3Part3 {
    public static void main( String[] args) {
        Scanner i = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.print ("Введите число: ");
        a = i.nextInt();
        System.out.println ("Введите второе число: ");
        b = i.nextInt();
        System.out.println ("Введите третье число: ");
        c = i.nextInt();
        if (a < b && a < c) {
            System.out.println (a);
        } else if (b < a && b <c) {
            System.out.println (b);
        } else {
            System.out.println (c);
        }
    }
}
//Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.






