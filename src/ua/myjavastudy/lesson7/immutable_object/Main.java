package ua.myjavastudy.lesson7.immutable_object;

public class Main {
    public static void main(String s[]) {
        Age age = new Age();
        age.setYear(1992);

        ImmutableObject student = new ImmutableObject("Alex", age);

        System.out.println("Alex year = " + student.getAge().getYear());

        age.setYear(1993);
        student.getAge();

        System.out.println("Alex year = " + student.getAge().getYear());
    }
}