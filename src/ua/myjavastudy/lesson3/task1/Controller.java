package ua.myjavastudy.lesson3.task1;

import java.util.Scanner;

public class Controller {
    // Constructor
    private Model model;
    private View view;
    Scanner sc = new Scanner(System.in);


    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }


    // The Work method
    public void processUser() {

        scanForSurname();
        scanForName();
        scanForNickname();
    }

    public void scanForSurname() {
        boolean result;

        view.printMessage(View.PLEASE_WRITE + View.SURNAME);

        do {
            String input = sc.next();
            result = input.matches("[a-zA-Z]+");

            if(result){
                view.printMessage(View.THANKS_FOR_WRITING + View.SURNAME);
            }
            else{
                view.printMessage(View.IT_IS_NOT_A + View.SURNAME);
            }
        } while (!result);
    }

    public void scanForName() {
        boolean result;

        view.printMessage(View.PLEASE_WRITE + View.NAME);

        do {
            String input = sc.next();
            result = input.matches("[a-zA-Z]+");

            if(result){
                view.printMessage(View.THANKS_FOR_WRITING + View.NAME);
            }
            else{
                view.printMessage(View.IT_IS_NOT_A + View.NAME);
            }
        } while (!result);
    }

    public void scanForNickname() {
        boolean result;

        view.printMessage(View.PLEASE_WRITE + View.NICKNAME);

        do {
            String input = sc.next();
            result = input.matches("[a-zA-Z0-9]+");

            if(result){
                view.printMessage(View.THANKS_FOR_WRITING + View.NICKNAME);
            }
            else{
                view.printMessage(View.IT_IS_NOT_A + View.NICKNAME);
            }
        } while (!result);
    }

}


