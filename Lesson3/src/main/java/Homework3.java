import java.util.*;


class HomeWork3 {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
    }
//1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

    int num;

    {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
        input.hasNextInt();
        System.out.println("Ошибка ввода числа. Число не целое");
    }


//Проверка четности числа
//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошике.


    Scanner i = new Scanner(System.in);
    int a = 0;
    int b = 0;
    int c = 0;

    {
        System.out.print("Введите число: ");
        a = i.nextInt();
        System.out.println("Введите второе число: ");
        b = i.nextInt();
        System.out.println("Введите третье число: ");
        c = i.nextInt();
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
//Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.

    int n1 = 28_800;
    int n2 = 8;

        for(n1=28_800;n1>=0;n1--)

    {
        System.out.println("до концарабочего дня осталось" + n1);
    }
        for(n2 =9;n2 <=17;n2++)

    {
        System.out.println("до конца рабочего дня осталось" + n2);

    }


    //4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
// оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
// когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
// (т.е. рабочий день закончился).
//Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
// Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
// сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
// далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
// выводиться фраза о количестве полных часов, содержащихся в n секундах.
    public class dataType {


                    System.out.println("Введите слово, число, число с плавающей точкой и boolean значение");

        Scanner dataScanner = new Scanner(System.in);
        int[] ints = new int[dataScanner.nextInt()];

        Random random = new Random();

                    for(
        int i = 0;
        i<ints.length;i++)

        {
            ints[i] = random.nextInt(11);
        }
                    System.out.println(Arrays.toString(ints));

//        String s = myScanner.nextLine();
//        int i = myScanner.nextInt();
//        double d = myScanner.nextDouble();
//        boolean b = myScanner.nextBoolean();

//        System.out.println(s + ", " + i + ", " + d + ", " + b);
    }


    String dataType[][] = new String[9][9];
    dataType[1][0]="byte";
    dataType[0][1]="byte";
    dataType[2][0]="short";
    dataType[0][2]="short";
    dataType[3][0]="char";
    dataType[0][3]="char";
    dataType[4][0]="int";
    dataType[0][4]="int";
    dataType[5][0]="long";
    dataType[0][5]="iong";
    dataType[6][0]="float";
    dataType[0][6]="float";
    dataType[7][0]="double";
    dataType[0][7]="double";
    dataType[0][8]="boolean";
    dataType[8][0]="boolean";

        System.out.println(dataType[0][1]);
        System.out.println(dataType[1][0]);
        System.out.println(dataType[0][2]);
        System.out.println(dataType[2][0]);
        System.out.println(dataType[0][3]);
        System.out.println(dataType[3][0]);
        System.out.println(dataType[0][4]);
        System.out.println(dataType[4][0]);
    System.out.println(dataType[0][5]);
    System.out.println(dataType[5][0]);
    System.out.println(dataType[0][6]);
    System.out.println(dataType[6][0]);
    System.out.println(dataType[0][7]);
    System.out.println(dataType[7][0]);
    System.out.println(dataType[0][8]);
    System.out.println(dataType[8][0]);

//5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn


    /**
     * 6) Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     * <p>
     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     * <p>
     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     * <p>
     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **//*

public static double average(int[] array) {
        return 0;
        }

*/
/**
 * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
 **/
//public static int max(int[] array) {
    // return 0;
    // }
    // }


}
}
