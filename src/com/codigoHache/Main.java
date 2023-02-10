package com.codigoHache;


import com.codigoHache.Class.SmartDevice;
import com.codigoHache.Herencia.SmartWatch;
import com.codigoHache.Herencia.SmartPhone;
public class Main {


    public  static void main(String[] args) {

        SmartDevice smartApple = new SmartDevice();
        SmartDevice smartBlack = new SmartDevice("apple", "blackPlus", 2023, true);
        SmartDevice smartElegant = new SmartDevice("apple", "elegantGold", 2023, false);
        SmartDevice smartRunner = new SmartDevice("apple", "runner", 2023, true);

        System.out.println(smartBlack.year);
        System.out.println(smartElegant.modelo);
        System.out.println(smartRunner.sport);


        System.out.println();




        SmartPhone smartPhone = new SmartPhone();
        SmartPhone smartPhone12 = new SmartPhone("apple", "iphone12", 2022, false, 14, 5);
        SmartPhone smartPhone14 = new SmartPhone("apple", "iphone14", 2023, true, 16, 6);
        SmartPhone smartPhonePlus = new SmartPhone("samsung", "samsungPlus8", 2023, true, 16, 6);

        System.out.println(smartPhone12.modelo);
        System.out.println(smartPhone14.fabricante);
        System.out.println(smartPhonePlus.modelo);

        System.out.println();


        SmartWatch smartWatch = new SmartWatch();
        SmartWatch appleWatch = new SmartWatch("apple","watch12", 2023, true, true );
        SmartWatch samsungWatch = new SmartWatch("samsung", "watchSan", 2022, true, true);
        SmartWatch appleWatchGold = new SmartWatch("apple", "gold14", 2023, false, true);


        System.out.println(appleWatch.sport);
        System.out.println(samsungWatch.year);
        System.out.println(appleWatchGold.modelo);







    }



}
