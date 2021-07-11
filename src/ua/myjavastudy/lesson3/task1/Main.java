package ua.myjavastudy.lesson3.task1;


import ua.myjavastudy.lesson3.task1.controller.Controller;

public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
