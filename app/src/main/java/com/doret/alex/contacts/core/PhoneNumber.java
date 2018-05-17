package com.doret.alex.contacts.core;

import java.util.List;

public class PhoneNumber {

    public String Number;
    public Contact Owner;

    public PhoneNumber(String number){
        Number = number;
    }

    public static List <PhoneNumber> getByOwner(Contact contact){



        return RandomHelper.generatePhoneNumberList();
    }


}
