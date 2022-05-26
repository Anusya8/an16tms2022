package by.tms.service;

public class Computer {


    private  int processor;
    private int randomAccessMemory;
    private int hardDiskDrive;
    private int roundTripCycle;



    public static void main(String[] args){
        Computer comp = new Computer();
        comp.processor =  14 ;
        comp.randomAccessMemory = 16;
        comp.hardDiskDrive = 0;
        comp.roundTripCycle = 2000;

        public Computer(int processor, int randomAccessMemory, int hardDiskDrive, int roundTripCycle);
        {
    this.processor = processor;
    this.randomAccessMmemory = randomAccessMemory;
    this.hardDiskDrive = hardDiskDrive;
    this.roundTripCycle = roundTripCycle;


    }

        void displayInfo (processor, randomAccessMemory, hardDiskDrive, roundTripCycle) {
            System.out.println( processor " " + randomAccessMemory " " + hardDiskDrive " " +roundTripCycle);
        }

    void powerOn () {
            System.out.println("Внимание! Введите 0 или 1");
        }
            class Random {
            Random int i = new Random();
            int i;
            for (i=0; i<=1; i++);
            if i = Random;





            }
        }


}
/**
 * в папке src/main/java создать пакет by.tms.model
 * в пакете создать класс Computer
 * 1) класс Computer будет содержать следующие поля:
 * - процессор
 * - оперативка
 * - жесткий диск
 * - ресурс полных циклов работы (включился выключился это один цикл)
 *
 * 2) класс Computer будет содержать следующие методы:
 * - метод описание(вывод всех полей)
 * - метод включить (on())
 *     - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
 *     на консоль вывести сообщение (Внимание! Введите 0 или 1)
 *     создать экземпляр класса Random, который будет генерировать число 0 или 1.
 *     если введенное вами число совпадет с рандомным, то компьютер выключается.
 *     если введенное вами число не совпадет с рандомным, то компьютер сгорает.
 *     - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
 * - выключить (off()) Проверяем если компьютер не сгорел то пишем "Выключение компьютера" и уменьшаем счетчик
 *    ресурса полных циклов работы
 * - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"


