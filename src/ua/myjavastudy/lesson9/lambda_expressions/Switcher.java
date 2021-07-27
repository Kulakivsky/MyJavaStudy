package ua.myjavastudy.lesson9.lambda_expressions;

import java.util.List;
import java.util.ArrayList;

public class Switcher {

    private List <ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListeners(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListeners(ElectricityConsumer listener) {
        listeners.remove(listener);
    }



    public void switchOn(){
        System.out.println("Выключатель включен");

        for(ElectricityConsumer c : listeners)
            c.electricityOn(this);
    }
}
