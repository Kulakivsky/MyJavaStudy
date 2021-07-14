package ua.myjavastudy.lesson8.exceptions.controller;

import ua.myjavastudy.lesson8.exceptions.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;


    public UtilityController (Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }


    public String checkValueWithRegex (String seekingVariantOfData, String regex) {
        String result;
        view.printMessage(seekingVariantOfData, regex);
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.printWrongMessage(seekingVariantOfData, regex);
        }

        return result;
    }
}
