package ru.otus.homeworks.homework16;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {
        int correctAnswers = 0, wrongAnswers = 0;
        String[][] squiz = new String[3][];
        squiz[0] = new String[] {"В файл с каким расширением компилируется java-файл?", "cs", "java", "class", "exe", "3"};
        squiz[1] = new String[] {"С помощью какой команды git можно получить полную копию удаленного репозитория?", "commit", "push", "clone", "copy", "3"};
        squiz[2] = new String[] {"Какой применяется цикл, когда не известно количество итераций?", "while", "for", "loop", "1"};

        for (int i = 0; i < squiz.length; i++) {
            int rowLength = squiz[i].length;
            for (int j = 0; j < rowLength-1; j++) {
                if (j == 0) {
                    System.out.println(squiz[i][j]);
                } else {
                    System.out.println(j + ". " + squiz[i][j]);
                }
            }
            System.out.print("Введите вариант ответа: ");
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();
            if (userInput.equals(squiz[i][rowLength-1])) {
                System.out.println("Верно!");
                correctAnswers = correctAnswers + 1;
            } else {
                System.out.println("Неверно! Правильный ответ: " + squiz[i][rowLength-1]);
                wrongAnswers = wrongAnswers + 1;
            }
            System.out.println();
        }
        System.out.println("Общий результат: количество верных ответов = " + correctAnswers + ", количество неверных ответов = " + wrongAnswers + ".");

    }
}
