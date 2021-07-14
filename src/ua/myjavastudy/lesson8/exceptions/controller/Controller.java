package ua.myjavastudy.lesson8.exceptions.controller;

import ua.myjavastudy.lesson8.exceptions.Model;
import ua.myjavastudy.lesson8.exceptions.View;

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


