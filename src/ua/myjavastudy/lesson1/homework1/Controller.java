package ua.myjavastudy.lesson1.homework1;

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

        model.setFirstValue(inputFirstStringValueWithScanner(sc));

        model.setSecondValue(inputSecondStringValueWithScanner(sc));

        view.printMessage(model.addTwoStringValues());
    }

    // The Utility methods
    public String inputFirstStringValueWithScanner(Scanner sc) {
        String firstMessage;

        view.printMessage(View.INPUT_STRING_DATA);

        firstMessage = sc.nextLine();

        while (! (model.checkFirstValue(firstMessage))) {
            view.printMessage(View.WRONG_STRING_DATA);
            firstMessage = sc.nextLine();
        }

        view.printMessage(View.CORRECT_FIRST_STRING_DATA);

        return firstMessage;
    }



    public String inputSecondStringValueWithScanner(Scanner sc) {
        String secondMessage = sc.nextLine();

        while (! (model.checkSecondValue(secondMessage))) {
            view.printMessage(View.WRONG_STRING_DATA);
            secondMessage = sc.nextLine();
        }

        return secondMessage;
    }
}
