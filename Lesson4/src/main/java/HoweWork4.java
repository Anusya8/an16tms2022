import java.util.Random;
import java.util.Scanner;

class HoweWork4 {
    public static void main(String[] args) {
        Random rand = new Random(7);
        int i;
        for (int day = 1; day <= 7; day++) {
            i = rand.nextInt(7);


            switch (i) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;
                default:
                    System.out.println("Error");
            }
        }

//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
        int t; // time
        int a; // amoeba

        for (t = 3; t <= 24; t +=3) {
            a = 2 * (t+=3);
            System.out.print(a + "amoeba");


        }
        //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int count = 0;
        int num =  scan.nextInt();
        for (;num != 0; num/=10; count++) {
            System.out.println("Количество цифр" + count);
        }
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()){
            num =scan.nextInt();
            if (num % 2 == 0){
                System.out.println("четное");
               else {
                    System.out.println(" нечетное");
                }
            }




//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

                //Некоторые тесты для проверки задач. Можно также написать свои тесты.
                printArray();
                System.out.println(operation(1));
                System.out.println(operation(0));
                System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
                countDevs(103);
                countDevs(11);
                foobar(6);
                foobar(10);
                foobar(15);
                printPrimeNumbers();
        }

        /**
         * Необходимо прочитать с консоли значение числа типа int,
         * сделать проверку что если пользователь ввел не положительное число,
         * то вывести ошибку и отправить пользователя вводить заново новое число!
         * далее создать одномерный массив типа int размера прочитанного с консоли
         * далее заполнить массив случайными значениями
         * далее вывести массив на консоль
         */
        private static void printArray () {
            // тут пишем логику
        }

        /**
         * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
         * - if number положительное число, то необходимо number увеличить на 1
         * - if number отрицательное - уменьшить на 2
         * - if number равно 0 , то замените значение number на 10
         * вернуть number после выполнения операций
         */
        public static int operation ( int number){
            // тут пишем логику
            return 0;
        }

        /**
         * На вход приходит массив целых чисел типа int
         * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
         * в котором это значение распечатается на консоль.
         */
        public static int calculateCountOfOddElementsInMatrix ( int[] ints){
            // тут пишем логику
            return 0;
        }

        /**
         * На вход приходит число.
         * Вывести в консоль фразу из разряда "_COUNT_ программистов",
         * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
         * уместное с точки зрения русского языка.
         * Пример: 1 программист, 42 программиста, 50 программистов
         *
         * @param count - количество программистов
         */
        public static void countDevs ( int count){
            // тут пишем логику
        }

        /**
         * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
         * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
         * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
         * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
         */
        public static void foobar ( int number){
            // тут пишем логику
        }

        /**
         * Задача со звездочкой!
         * Метод должен печатать все простые числа <1000
         * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
         */
        public static void printPrimeNumbers () {
            // тут пишем логику
        }
    }

