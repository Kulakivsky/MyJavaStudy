package ua.myjavastudy.lesson9.lambda_expressions;

public class Radio implements ElectricityConsumer  {

    public void playMusic(){
        System.out.println("Радио заиграло");
    }


    public void electricityOn(Object obj) {
        playMusic();
    }

}
