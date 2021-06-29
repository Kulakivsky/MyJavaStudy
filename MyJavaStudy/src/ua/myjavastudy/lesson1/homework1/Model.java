package ua.myjavastudy.lesson1.homework1;

public class Model {
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
}
