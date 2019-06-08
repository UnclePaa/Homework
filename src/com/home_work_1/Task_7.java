package com.home_work_1;

public class Task_7 {

    public static void main(String[] args) {

        //Пришлось знатно погуглить

        int programmers = 64;
        int digit = programmers%10;

        if (digit==1) {
            System.out.print(programmers + " прогрвммист");}

            else if (digit==2||digit==3||digit==4) {
                System.out.print(programmers + " прогрвммиста");}

                else {
                    System.out.print(programmers + " программистов");}

    }
}
