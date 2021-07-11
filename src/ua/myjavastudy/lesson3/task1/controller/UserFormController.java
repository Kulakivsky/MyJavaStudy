package ua.myjavastudy.lesson3.task1.controller;

import ua.myjavastudy.lesson3.task1.View;
import java.util.Scanner;

import static ua.myjavastudy.lesson3.task1.controller.RegexContainer.*;
import static ua.myjavastudy.lesson3.task1.TextConstant.*;


public class UserFormController {
    private View view;
    private Scanner scanner;

    private String surnameName;
    private String name;
    private String nick;


    public UserFormController (Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void userCreation() {
        String regexSurnameAndName;

        UtilityController utilityController = new UtilityController(scanner, view);


        if(String.valueOf(View.bundle.getLocale()).equals("ua")){
           regexSurnameAndName = REGEX_NAME_AND_SURNAME_UKR;
        } else {
           regexSurnameAndName = REGEX_NAME_AND_SURNAME_LAT;
        }

        this.surnameName =
                utilityController.checkValueWithRegex(SURNAME, regexSurnameAndName);

        this.name =
                utilityController.checkValueWithRegex(NAME, regexSurnameAndName);

        this.nick =
                utilityController.checkValueWithRegex(LOGIN_DATA, REGEX_NICK);
    }




}
