package ua.myjavastudy.lesson9.lambda_expressions;
import static java.lang.System.out;

public class Program {

    public static void fire (Object sender) {
        out.println("Пожар!!!");
    }

    public static void main (String[] args) {

        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //even subscribe
        sw.addElectricityListeners(lamp);
        sw.addElectricityListeners(radio);

        final String message = "Пожар";

        sw.addElectricityListeners(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn(Object obj) {
                        out.print(message);
                        out.println("!!!");
                    }
                }
        );

        // sw.addElectricityListeners( sender -> out.println("Пожар!!!" );
        // sw.addElectricityListeners( s -> Program.fire(s) );
        sw.addElectricityListeners( Program::fire );


        sw.switchOn();

    }
}
