package com.pickles.practice_11.task_4;

public class CarGarage<T> {
    private T[] array;

    public CarGarage(T[] array) {
        this.array = (T[]) new Object[10];
    }

    public static void main(String[] args) {
        Car bMW = new Car("BMW");
        Car lada = new Car("Lada");
        Car toyota = new Car("Toyota");

    }

    public <T> void Add(T t) {
//        T[] newArray = (T[]) new Object[10];
        for (int i = 0; i < array.length; i++) {
            if (t.getClass().getName().equals("BMW") || t.getClass().getName().equals("Lada")) {
                String str = (String) this.array[i];
                array[i] = this.array[i];
                System.out.println(str);

            } else {
            }
        }
    }
}
class Car<T> {
    private T name;

    Car(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }
}

class BMW<T> extends Car<T> {

    BMW(T name) {
        super(name);
    }
}

class Lada<T> extends Car<T> {

    Lada(T name) {
        super(name);
    }
}

class Toyota<T> extends Car<T> {

    Toyota(T name) {
        super(name);
    }
}
