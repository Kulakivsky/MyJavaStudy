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

        model.setMinNumberFromUser(0);
        model.setMaxNumberFromUser(100);
        model.createRandomNumber();

        inputChecker(sc);
    }

    public void inputChecker(Scanner sc) {
        view.printMessage(View.PLEASE_WRITE_NUMBER);

        while (!model.isRandomNumberFound()) {
            if (sc.hasNextInt()) {
                model.isItSolution(sc.nextInt());
            } else {
                view.printMessage(View.WRONG_DATA);
                sc.next();
            }
        }

    }

}
