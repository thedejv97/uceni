package com.david.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PINValidator {
    static int day;
    static int month;
    static int year;

    public static boolean isPINValid(String personalNumber) {

        //TODO implementace po doplnění toto smazat
        // validace délky řetězce
        // validace zda se jedná o validní řetězec PIN (rodné číslo)
        // vyextrahovat jednotlivé prvky: datum, pohlaví, bezpečnostní známku (číslo za lomítkem)

        if (personalNumber.length() == 11) {
            System.out.println("délka řetězce je validní");
        } else {
            System.out.println("délka řetězce není validní");
        }

        return false;
    }

    static void personalNumberValidity(String personalNumber) {
    }

    static void personalNumberCutter(String personalNumber) {
        String y = personalNumber.substring(0, 2);
        String m = personalNumber.substring(2, 4);
        String d = personalNumber.substring(4, 6);

        year = Integer.parseInt(y);

        if (year > 22) {
            year += 1900;
        } else {
            year += 2000;
        }

        month = Integer.parseInt(m);

        if (month > 12) {
            month -= 50;
        }

        day = Integer.parseInt(d);
    }

    static void sex(String personalNumber) {
        String sex;

        if (month > 12) {
            sex = "woman";
        } else {
            sex = "man";
        }
    }

    static void vypis(String personalNumber) {
        System.out.format("%02d", "%02d", "%04d", day, month, year);
    }
}
