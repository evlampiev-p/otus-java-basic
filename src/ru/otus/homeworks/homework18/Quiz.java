package ru.otus.homeworks.homework18;

public class Quiz {
    public static void main(String[] args) {
        Player player = new Player();
        Question questions = new Question();
        Option options = new Option();
        player.createNewUser();
        for (int i = 0; i < questions.numberOfQuestions(); i++) {
            questions.printQuestion(i);
            options.printOptions(i);
            int chosenOption = player.getPlayerChoice();
            player.setPlayerResult(options.checkIfOptionCorrect(i,chosenOption));
        }
        player.printPlayerResults();
    }
}
