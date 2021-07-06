package ua.myjavastudy.lesson2.task1;

import java.util.Scanner;

public class Controller {

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }


    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setMinBarrier(0);
        model.setMaxBarrier(100);
        model.createRandomNumber();

        inputChecker(sc);
    }

    public void inputChecker(Scanner sc) {
        view.printMessage(View.PLEASE_WRITE_NUMBER);

        int solution = 0;

        while (!model.isRandomNumberFound()) {
            if (sc.hasNextInt()) {

                solution = sc.nextInt();

                if (solution > model.getMaxBarrier())
                {
                    view.printMessage(View.INPUT_NUMBER_BIGGER_THAN_MAX_BORDER);
                    view.printMessageUsersBoarders(model.getMinBarrier(), model.getMaxBarrier());
                }
                else if (solution < model.getMinBarrier())
                {
                    view.printMessage(View.INPUT_NUMBER_LOWER_THAN_MIN_BORDER);
                    view.printMessageUsersBoarders(model.getMinBarrier(), model.getMaxBarrier());
                }
                else
                {
                    model.isItSolution(solution);

                    if (!model.isRandomNumberFound())
                    {
                        view.printMessageAboutPreviousNumbers(model.usersTries);
                        view.printMessageUsersBoarders(model.getMinBarrier(), model.getMaxBarrier());
                    }
                }

            }
            else
            {
                view.printMessage(View.WRONG_DATA);
                sc.next();
            }
        }
        view.printMessage(View.RIGHT_SOLUTION);
        view.printMessageUsersBoarders(model.getMinBarrier(), model.getMaxBarrier());
        view.printNumberOfTries(model.usersTries);
    }

}
