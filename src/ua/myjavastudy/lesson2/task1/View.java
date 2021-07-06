package ua.myjavastudy.lesson2.task1;

import java.util.ArrayList;

public class View {

    // Text's constants
    public static final String PLEASE_WRITE_NUMBER = "Please write down number from 0 to 100.";
    public static final String RIGHT_SOLUTION = "You have successfully found the random number.";
    public static final String WRONG_DATA = "Wrong input! Repeat please!";
    public static final String INPUT_NUMBER_LOWER_THAN_MIN_BORDER = "Number from input is lower than min border";
    public static final String INPUT_NUMBER_BIGGER_THAN_MAX_BORDER = "Number from input is bigger than max border";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageUsersBoarders(int getMinNumber, int getMaxNumber) {
        System.out.println("Enter number between " + getMinNumber +
                " and " + getMaxNumber);
    }
    public void printNumberOfTries (ArrayList usersTries) {
        System.out.println("Number of tries: " + usersTries.size());
    }

    public void printMessageAboutPreviousNumbers(ArrayList usersTries) {
        System.out.println("The numbers you entered earlier " + usersTries);
    }
}