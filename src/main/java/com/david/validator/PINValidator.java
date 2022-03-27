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

        String y = personalNumber.substring(0, 2);
        String m = personalNumber.substring(2, 4);
        String d = personalNumber.substring(4, 6);
        String numberAfterDash = personalNumber.substring(6,9);

        year = Integer.parseInt(y);
        month = Integer.parseInt(m);
        day = Integer.parseInt(d);
        validity = (year + month + day)%11;


        if (personalNumber.length() == 11) { //length validity
            System.out.println("value length is valid");
        } else {
            System.out.println("value length is not valid");
        }

        if (validity==0){ // personal number validity
            System.out.println("personal number is valid");
        }else{
            System.out.println("personal number is not valid");
        }

        if(month>50 & month<63){ // testing if person is a woman or a man
            sex="woman";
        }else{
            sex="man";
        }

System.out.println(day + "." + month + "." + year + " " + sex + " number after dash = " + numberAfterDash);
        return false;

    }
}
