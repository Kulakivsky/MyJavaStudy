package ua.myjavastudy.lesson3.task1;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.myjavastudy.lesson3.task1.TextConstant.*;

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
            //new Locale("ua", "UA"));
            new Locale("en"));


    public void printMessage(String seekingVariantOfData, String regex) {
        System.out.println(
                bundle.getString(INPUT_STRING_DATA) +
                bundle.getString(seekingVariantOfData) +
                regex);
    }

    public void printWrongMessage(String seekingVariantOfData, String regex) {
        System.out.println(
                bundle.getString(WRONG_INPUT_DATA) +
                        bundle.getString(INPUT_STRING_DATA) +
                        bundle.getString(seekingVariantOfData) +
                        regex);
    }

}
