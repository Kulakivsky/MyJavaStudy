package ua.myjavastudy.lesson3.task1.controller;

import ua.myjavastudy.lesson3.task1.Model;
import ua.myjavastudy.lesson3.task1.View;

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

        UserFormController userFormController = new UserFormController(sc, view);
        userFormController.userCreation();

    }

}


