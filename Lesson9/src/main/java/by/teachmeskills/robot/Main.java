package by.teachmeskills.robot;
import by.teachmeskills.robot.IRobot;
import by.teachmeskills.robot.ILeg;
import by.teachmeskills.robot.IHand;
import  by.teachmeskills.robot.IHead;

public class Main extends Robot  {


        public static void main(String[] args) {



        Robot samsung =  new Robot (new SamsungHead(50), new SamsungHand(50), new SamsungLegs(50));

                samsung.action();
        System.out.println(samsung.countPrice());

        Robot sony = new Robot( new SonyHead (40),new SonyHand(40), new SonyLegs(40));
                sony.action();
                System.out.println(sony.countPrice());
        Robot toshiba = new Robot(new ToshibaHead(60), new ToshibaHand(60),new ToshibaLegs(60));
                toshiba.action();
                System.out.println(toshiba.countPrice());
        Robot quick = new Robot( new ToshibaHead(60), new SonyHand(40), new SamsungLegs(50));
                quick.action();
                System.out.println(quick.countPrice());
        Robot smart = new Robot( new SonyHead(40), new ToshibaHand(60), new SonyLegs(40));
                smart.action();
                System.out.println(smart.countPrice());
        }
}

