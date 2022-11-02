package ru.otus.homeworks.homework18;

import java.util.Scanner;

public class Player {
    private String userName = "";
    private int correctAnswers = 0, wrongAnswers = 0;

    public void createNewUser() {
        System.out.print("Пожалуйста, представьтесь. Ваше имя: ");
        Scanner scan = new Scanner(System.in);
        userName = scan.nextLine();
        System.out.println();
    }

    public int getPlayerChoice(){
        System.out.print("Введите вариант ответа: ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println();
        return userInput;
    }

    public void setPlayerResult(boolean res){
        if (res) {
            this.correctAnswers = correctAnswers + 1;
        } else {
            this.wrongAnswers = wrongAnswers + 1;
        };
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public void printPlayerResults(){
        System.out.println(this.userName + ", Ваш итоговый результат: количество верных ответов = " + correctAnswers + ", количество неверных ответов = " + wrongAnswers + ".");
    }
}
