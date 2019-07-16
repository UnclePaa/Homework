package com.pickles.homeWorkString.task_5;

public class Task_5 {
    public static void main(String[] args) {
        String colors = "Green. red. blue. yellow";
        
        // у строки есть метод replaceAll. Используй его
        char[] toArray = colors.toCharArray();
        for (int i = 0; i < toArray.length; i++) {
            if(toArray[i] == '.')
            {
                toArray[i] = ',';
            }
        }

        System.out.println(toArray);
    }
// не оставляй такие пробелы между фигурными скобками


}
