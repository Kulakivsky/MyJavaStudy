package ua.myjavastudy.lesson3.task1.controller;

import ua.myjavastudy.lesson3.task1.View;
import static ua.myjavastudy.lesson3.task1.TextConstant.*;
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
