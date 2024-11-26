package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123456");
        Contact contact1 = new Contact("irem", "123");
        Contact contact2 = new Contact("merve", "123");
        Contact contact3 = new Contact("merve", "123");

        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact1);

        System.out.println(mobilePhone.myContacts.size());
        System.out.println(mobilePhone.removeNewContact(contact2));
        mobilePhone.printContact();

    }
}
