package ua.myjavastudy.lesson3.task1.controller;

public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_AND_SURNAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    //Latin name
    String REGEX_NAME_AND_SURNAME_LAT = "^[A-Z][a-z]{1,20}$";
    // Nick regex
    String REGEX_NICK = "[A-Za-z0-9_-]{8,20}";
}
