package com.pickles.practice_13.task_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserBuilder {
    public static void main(String[] args) {
        UserBuilderInterface userBuilder = User::new;
        Scanner userInput = new Scanner(System.in);
        String user = userInput.nextLine();
        User user1 = userBuilder.build(user);

        System.out.println(user1);
    }
}

interface UserBuilderInterface {
    User build(String name);
}
