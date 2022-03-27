package com.david.validator;

public class PINValidator {

    static int day;
    static int month;
    static int year;
    static int validity;
    static String sex;


    public static boolean isPINValid(String personalNumber) {

        //TODO implementace po doplnění toto smazat
        // validace délky řetězce
        // validace zda se jedná o validní řetězec PIN (rodné číslo)
        // vyextrahovat jednotlivé prvky: datum, pohlaví, bezpečnostní známku (číslo za lomítkem)

        if (personalNumber.length() != 11) {
            return false;
        }

        if (!personalNumber.contains("/")) {
            return false;
        }

        String y = personalNumber.substring(0, 2);
        String m = personalNumber.substring(2, 4);
        String d = personalNumber.substring(4, 6);
        String secretNumber = personalNumber.substring(6, 11);

        year = Integer.parseInt(y);
        month = Integer.parseInt(m);
        day = Integer.parseInt(d);

        boolean isDayValid = false;
        boolean isMonthValid = false;

        if (month > 0 & month < 13) {
            sex = "man";
            isMonthValid = true;
        } else if (month > 50 & month < 63) {
            sex = "woman";
            month = -50;
            isMonthValid = true;
        }

        if (day > 0 & day < 32) {
            isDayValid = true;
        }

        if (isDayValid && isMonthValid) {
            System.out.println(day + "." + month + "." + year + " " + sex + " secret number = " + secretNumber);
            return true;
        }

        return false;


    }
}
