package ru.otus.homeworks.homework18;

public class Question {

    private String[] questions = new String[]{
            "В файл с каким расширением компилируется java-файл?",
            "С помощью какой команды git можно получить полную копию удаленного репозитория?",
            "Какой применяется цикл, когда не известно количество итераций?"};

    public int numberOfQuestions() {
        return this.questions.length;
    }

    public void printQuestion(int position) {
        if (position <= questions.length) {
            System.out.println(questions[position]);
        };
    }
}
