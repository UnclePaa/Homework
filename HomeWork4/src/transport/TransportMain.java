package transport;

import java.util.Scanner;

public class TransportMain {
    public static void main(String[] args) {
        Transport allTransport = new Transport();
//        allTransport.setWeight(2.50);
//        allTransport.setMaxSpeed(200);
//        allTransport.setHorsePower(300);
//        allTransport.setBrand("Audi");

        Land a = new Land();

        Car car = new Car(250, 300, 2.00,
                "Audi", 4, 20.00, "Универсал", 1 );

        Scanner scrCar = new Scanner(System.in);
        System.out.println("Введите время легкового автомобиля в пути");
        double time = scrCar.nextDouble();
        System.out.println("За " + time + " ч. легковой автомобиль "
                + car.brand + " проедет "
                + car.maxSpeed*time + " километров и сожжет "
                + (car.maxSpeed*time)*0.2 + " л. топлива");
        Scanner scrHp = new Scanner(System.in);
        System.out.println("Укажите мощность автомобиля " + car.brand);
        double kWToHp = scrHp.nextDouble()*0.74;
        System.out.println("Мощность автомобиля " +car.brand + " в киловаттах составляет " + kWToHp + " кВ");


                //        System.out.println(a.toString());
                //Air air = new Air();
    }
}
