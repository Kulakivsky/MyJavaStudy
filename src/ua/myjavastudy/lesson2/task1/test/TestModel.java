package ua.myjavastudy.lesson2.task1.test;

import org.junit.Assert;
import org.junit.Test;
import ua.myjavastudy.lesson2.task1.Model;

public class TestModel {
    Model model = new Model();

    @Test
    public void testCreateRandomNumber() {
        model.setMinBarrier(0);
        model.setMaxBarrier(100);

        for (int i = 0; i < 100000; i++) {
            model.createRandomNumber();
            if (model.getRandomNumber() >= 100 || model.getRandomNumber() <= 0) {
                Assert.fail();
            }
        }
    }

    @Test
    public void testIsItSolution() {
        model.createRandomNumber();
        model.isItSolution(model.getRandomNumber());
        Assert.assertTrue(model.isRandomNumberFound());
    }

    @Test
    public void testIsItSolutionSetMaxBarrier() {
        model.setRandomNumber(50);
        model.isItSolution(model.getRandomNumber()+1);
        Assert.assertTrue(model.getRandomNumber()+1 == model.getMaxBarrier());
    }

    @Test
    public void testIsItSolutionSetMinBarrier() {
        model.setRandomNumber(50);
        model.isItSolution(model.getRandomNumber()-1);
        Assert.assertTrue(model.getRandomNumber()-1 == model.getMinBarrier());
    }

}
