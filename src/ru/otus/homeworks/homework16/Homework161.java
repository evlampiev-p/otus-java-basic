package ru.otus.homeworks.homework16;

import java.util.Arrays;
import java.util.Scanner;

public class Homework161 {
    public static void main(String[] args) {
        int correctAnswers = 0, wrongAnswers = 0;
        Object[][][] squizArray = new Object[3][3][];
        squizArray[0][0] = new String[]{"В файл с каким расширением компилируется java-файл?", "С помощью какой команды git можно получить полную копию удаленного репозитория?", "Какой применяется цикл, когда не известно количество итераций?"};
        squizArray[1][0] = new String[]{"cs", "java", "class", "exe"};
        squizArray[1][1] = new String[]{"commit", "push", "clone", "copy"};
        squizArray[1][2] = new String[]{"while", "for", "loop"};
        squizArray[2][0] = new Integer[]{3};
        squizArray[2][1] = new Integer[]{3};
        squizArray[2][2] = new Integer[]{1};

        for (int i = 0; i < squizArray[0][0].length; i++) {
            System.out.println(squizArray[0][0][i]);
            for (int j = 0; j < squizArray[1][i].length; j++) {
                System.out.println(j+1 + ". " + squizArray[1][i][j]);
            }
            System.out.print("Введите вариант ответа: ");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            if (squizArray[2][i][0].equals(userInput)) {
                System.out.println("Верно!");
                correctAnswers = correctAnswers + 1;
            } else {
                System.out.println("Неверно! Правильный ответ: " + squizArray[2][i][0]);
                wrongAnswers = wrongAnswers + 1;
            }
            System.out.println();
        }
        System.out.println("Общий результат: количество верных ответов = " + correctAnswers + ", количество неверных ответов = " + wrongAnswers + ".");

        System.out.println("------------How to expand array--------------------");
        String[] array = {"test"};
        array = Arrays.copyOf(array, 2);
        array[1] = "done";
        System.out.println(Arrays.toString(array));

    }
}
