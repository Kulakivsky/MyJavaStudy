package ua.myjavastudy.lesson2.task1;

import javax.xml.catalog.CatalogFeatures;
import java.util.ArrayList;

public class Model {
    private int randomNumber;
    private int minNumberFromUser;
    private int maxNumberFromUser;
    private boolean randomNumberFound = false;

    ArrayList<Integer> usersTries = new ArrayList<Integer>();


    /*
    private String firstValue;
    private String secondValue;

    // The Program logic

    public String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }

    public boolean checkFirstValue (String firstValue) {
        return firstValue.equals(View.FIRST_KEY_WORD);
    }

    public boolean checkSecondValue (String secondValue) {
        return secondValue.equals(View.SECOND_KEY_WORD);
    }

    public String addTwoStringValues() {
        return this.firstValue + " " + this.secondValue;
        }
     */

    public int getRandomNumber() {
        return randomNumber;
    }

    public boolean isRandomNumberFound() {
        return randomNumberFound;
    }

    public void setRandomNumberFound(boolean randomNumberFound) {
        this.randomNumberFound = randomNumberFound;
    }

    public int getMinNumberFromUser() {
        return minNumberFromUser;
    }

    public void setMinNumberFromUser(int minNumberFromUser) {
        this.minNumberFromUser = minNumberFromUser;
    }

    public int getMaxNumberFromUser() {
        return maxNumberFromUser;
    }

    public void setMaxNumberFromUser(int maxNumberFromUser) {
        this.maxNumberFromUser = maxNumberFromUser;
    }

    public void createRandomNumber() {
        this.randomNumber = (int) (Math.random()*getMaxNumberFromUser()) + 1;
    }

    public void isItSolution (int solution) {

        usersTries.add(solution);

        View view = new View();

        if (solution > this.randomNumber) {

            if (solution < getMaxNumberFromUser()) {
                setMaxNumberFromUser(solution);
                view.printMessageUserGetRightNumber(usersTries, getMinNumberFromUser(), getMaxNumberFromUser());
            } else {
                view.printMessage(View.INPUT_NUMBER_BIGGER_THAN_BORDER);
                view.printMessageUserGetRightNumber(usersTries, getMinNumberFromUser(), getMaxNumberFromUser());
            }

        } else if (solution < this.randomNumber) {

            if (solution > getMinNumberFromUser()) {
                setMinNumberFromUser(solution);
                view.printMessageUserGetRightNumber(usersTries, getMinNumberFromUser(), getMaxNumberFromUser());
            } else {
                view.printMessage(View.INPUT_NUMBER_LOWER_THAN_BORDER);
                view.printMessageUserGetRightNumber(usersTries, getMinNumberFromUser(), getMaxNumberFromUser());
                }

        } else {
            this.randomNumberFound = true;
            view.printMessage(View.RIGHT_SOLUTION);
            view.printNumberOfTries(usersTries);
        }
    }


}
