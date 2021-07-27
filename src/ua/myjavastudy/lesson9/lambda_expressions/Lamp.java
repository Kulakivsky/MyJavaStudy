package ua.myjavastudy.lesson9.lambda_expressions;

public class Lamp implements ElectricityConsumer {

    public void lightOn(){
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object obj) {
        lightOn();
    }
}

