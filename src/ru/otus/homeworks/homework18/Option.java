package ru.otus.homeworks.homework18;

public class Option {

    private String[][] options = new String[][]{
        {"cs", "java", "class", "exe"},
        {"commit", "push", "clone", "copy"},
        {"while", "for", "loop"}
    };

    private int[] correctAnswers = new int[]{
            3,
            3,
            1
    };

    public void printOptions(int questionPosition){
        if (questionPosition <= options.length) {
            for (int i = 0; i < options[questionPosition].length; i++) {
                System.out.println(i+1 + ". " + options[questionPosition][i]);
            }
        }
    }

    public boolean checkIfOptionCorrect(int questionPosition, int option){
        boolean result = (option == correctAnswers[questionPosition]) ? true : false;
        return result;
    }
}
