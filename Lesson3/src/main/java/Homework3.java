///*
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class HomeWork3 {
//}
//import java.util.Scanner;
//
//class Homework3Part1 {
//    public static void main(String[] args) {
//
//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.println(i);
//        }
//    }
//}
////1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита
//
//public class Homework3Part2 {
//
//
//    public static void main(String[] args) {
//
//        int num;
//        System.out.println("Введите число: ");
//
//        Scanner input = new Scanner(System.in);
//        num = input.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("Число четное");
//        } else {
//            System.out.println("Число нечетное");
//                }
//        if (num = float || double) {
//
//            System.out.println("Ошибка ввода числа");
//        }
//
//    }
//}
////Проверка четности числа
////Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
//// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
//// Если пользователь введёт не целое число, то сообщать ему об ошике.
//
//public class Homework3Part3 {
//    public static void main( String[] args) {
//        Scanner i = new Scanner(System.in);
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        System.out.print ("Введите число: ");
//        a = i.nextInt();
//        System.out.println ("Введите второе число: ");
//        b = i.nextInt();
//        System.out.println ("Введите третье число: ");
//        c = i.nextInt();
//        if (a < b && a < c) {
//            System.out.println (a);
//        } else if (b < a && b <c) {
//            System.out.println (b);
//        } else {
//            System.out.println (c);
//        }
//    }
//}
////Меньшее по модулю число
////Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
//// пользователем вещественных чисел с консоли.
//
////4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
//// оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
//// когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
//// (т.е. рабочий день закончился).
////Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
//// Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
//// сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
////Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
//// далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
//// выводиться фраза о количестве полных часов, содержащихся в n секундах.
//
//        import java.util.Arrays;
//
//public class HomeWork3Part5 {
//
//    public static void main(String[] args) {
//        Object dataType;
//        dataType = new dataType [8][8];
//        dataType[0][0] = "byte";
//        dataType[1][1] = "short";
//        dataType[2][2] = "char";
//        dataType[3][3] = "int";
//        dataType[4][4] = "long";
//        dataType[5][5] = "float";
//        dataType[6][6] = "double";
//        dataType[7][7] = "boolean";
//
//
//        System.out.println(dataType[0][0]);
//        System.out.println(dataType[1][1]);
//        System.out.println(dataType[2][2]);
//        System.out.println(dataType[3][3]);
//        System.out.println(dataType[4][4]);
//        System.out.println(dataType[5][5]);
//        System.out.println(dataType[6][6]);
//        System.out.println(dataType[7][7]);
//        System.out.println(dataType[8][8]);
//
//    }
//
////5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
////              byte	short	char	int 	long	float	double	boolean
////    byte
////    short
////    char
////    int
////    long
////    float
////    double
////    boolean
////
////    На пересечении напишите следующие фразы:
////    ня (неявное) – если преобразование происходит автоматически,
////    я (явное) – если нужно использовать явное преобразование,
////    х – если преобразование невозможно,
////    т  - если преобразование тождественно.
////    Внимание! используйте System.out.printLn
//
//*/
///**
// * 6) Метод должен вернуть среднее значение из массива чисел
// * (необходимо сумму всех элеменов массива разделить на длину массива)
// * <p>
// * Example:
// * array = {1,2,3,4,5}
// * Метод должен return 3.0
// *//*
//
//public static double average(int[] array) {
//        return 0;
//        }
//
//*/
///**
// * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
// **//*
//
//public static int max(int[] array) {
//        return 0;
//        }
//        }
//
//
//*/
