package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    public String myNumber;
    public List<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

   public boolean addNewContact(Contact contact){

       if(findContact(contact) < 0){
           return myContacts.add(contact);
       } else{
           return false;
       }
   }
   public boolean updateContact(Contact oldContact, Contact newContact){
       int index = findContact(oldContact);
       if(index >= 0){
           myContacts.set(index, newContact);
           return true;
       } else{
           return false;
       }
   }
    public boolean removeNewContact(Contact contact){

            return myContacts.remove(contact);

   }

   public int findContact(Contact contact){
        return myContacts.indexOf(contact);
   }

   public int findContact(String name){
        int size = myContacts.size();
        if(size>0){
            for(int i=0; i<myContacts.size(); i++){
                if(myContacts.get(i).getName().equals(name)){
                    return i;
                }
            }
        }

        return -1;
    }

    public Contact queryContact(String name){
        if(name == null){
            return null;
        }
        for(Contact contact : myContacts){
            if(contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }

    public void printContact(){
        for(int i=0; i<myContacts.size(); i++){
            System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+ myContacts.get(i).getPhoneNumber());
        }
    }
}
