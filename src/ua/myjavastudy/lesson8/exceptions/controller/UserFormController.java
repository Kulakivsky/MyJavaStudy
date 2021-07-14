package ua.myjavastudy.lesson8.exceptions.controller;

import ua.myjavastudy.lesson8.exceptions.NotUniqueUser;
import ua.myjavastudy.lesson8.exceptions.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static ua.myjavastudy.lesson3.task1.TextConstant.*;
import static ua.myjavastudy.lesson3.task1.controller.RegexContainer.*;


public class UserFormController {
    private View view;
    private Scanner scanner;

    ArrayList<String> surNames = new ArrayList<String>();
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> nicks = new ArrayList<String>();

    private String surnameName;
    private String name;
    private String nick;


    public UserFormController (Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void userCreation() {
        nicks.add("ruslan1234");

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

        boolean userIsUnique = true;

        while (userIsUnique) {
            try {
                checkIfUserIsUnique(utilityController, nicks);
                userIsUnique = false;
            } catch (NotUniqueUser e) {
                System.out.println(e);
            }
        }
    }

    public void checkIfUserIsUnique (UtilityController cont, ArrayList valuesArray) throws NotUniqueUser   {

        String value = cont.checkValueWithRegex(LOGIN_DATA, REGEX_NICK);

        if (valuesArray.contains(value)){
              throw new NotUniqueUser ("This nickname already exist! Please choose another one");
        } else {
            valuesArray.add(value);
        }
    }

}



