package ua.myjavastudy.lesson2.task1;

import java.util.ArrayList;

public class Model {
    private int randomNumber;
    private int minBarrier;
    private int maxBarrier;
    private boolean randomNumberFound = false;

    ArrayList<Integer> usersTries = new ArrayList<Integer>();

    public boolean isRandomNumberFound() {
        return randomNumberFound;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public int getRandomNumber() {
        return this.randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void createRandomNumber() {
        this.randomNumber = (int)Math.ceil(Math.random()*
                (maxBarrier - minBarrier - 1) + minBarrier);
    }

    public void isItSolution (int solution) {

        usersTries.add(solution);

        if (solution > this.randomNumber)
        {
                setMaxBarrier(solution);
        }
        else if (solution < this.randomNumber)
        {
                setMinBarrier(solution);
        }
        else
        {
            this.randomNumberFound = true;
        }
    }


}
