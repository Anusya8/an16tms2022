public class HomeWork2 {
    public static int sum(int a, int b) {
    return 0;
    if ((long) a + b > Integer.MAX_VALUE) {
        return -1;
    }
    return a + b;
}
    public static int max(int a, int b) {
        return 0;
        return Math.max(a, b);
    }
    public static double calculateHypotenuse(int a, int b) {
        return 0;
        return Math.hypot(a, b);
    }
}
import org.junit.jupiter.api.Assertions;

class HomeWorkTest {

    public class HomeWork {
        public  void main(String[] args) {
            //вывод на консоль
            printLiterals();
            //Некоторые тесты для проверки задач.
            System.out.println(sum(100, 200));
            System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
            System.out.println(max(56, 349));
            System.out.println(HomeWork2.calculateHypotenuse(3, 4));
        }

        private void printLiterals() {
        }
        //  private static void printLiterals() {
//        вывести на консоль литералы следующих видов:
//        логический
//        строковый
//        символьный
//        целочисленный 2-й
//        целочисленный 8-й
//        целочисленный 10-й
//        целочисленный 16-й
//        литерал типа float
//        литерал типа double.
        }
/**
 * 1. Метод должен вернуть сумму двух чисел a и b
 * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
 **/
/**
 * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
 * <p>
 * Example1:
 * 3
 * 4
 * return 5
 * <p>
 * Example2:
 * 12
 * 16
 * return 20
 */