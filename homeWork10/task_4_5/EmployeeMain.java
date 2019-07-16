package com.pickles.practice_10.task_4_5;

import java.io.*;

public class EmployeeMain {
    public static final String FILE_PATH = "C:\\Users\\Tsyplik\\IdeaProjects\\Java-core\\src\\com\\pickles\\practice_10\\task_4_5\\objectEmployee.txt";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             ObjectOutputStream os = new ObjectOutputStream(fos)) {
            Employee employee1 = new Employee("Bob", 26, true);
            Work work1 = new Work("TNT", 2);
            os.writeObject(employee1);
            os.writeObject(work1);
            os.flush();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        } catch (IOException ioException) {
            System.out.println("IO Exception");
        } catch (OutOfMemoryError outOfMemoryError) {
            System.out.println("Out of memory");
        }

        try (FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream os = new ObjectInputStream(fis)) {
            Employee e = (Employee)
                    os.readObject();
            System.out.println(e);
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("IO Exception");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Class not found");
        }
    }
}

