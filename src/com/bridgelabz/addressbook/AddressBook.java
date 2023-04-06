package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> addressBook1 = new ArrayList<>();


    public Contact createContact(){
        Contact person = new Contact();
        System.out.println("Enter your First Name");
        person.setFirstName(sc.nextLine());


        System.out.println("Enter your Last Name");
        person.setLastName(sc.nextLine());


        System.out.println("Enter Your Address");
        person.setAddress(sc.nextLine());


        System.out.println("Enter your City");
        person.setCity(sc.nextLine());


        System.out.println("Enter your state");
        person.setState(sc.nextLine());


        System.out.println("Enter your Zip code");
        person.setZip(sc.nextLine());


        System.out.println("Enter your Contact Number");
        person.setPhoneNumber(sc.nextLine());


        System.out.println("Enter your Email ID");
        person.setEmail(sc.nextLine());

        return person;
    }
    public void addDetails(){
        ArrayList<Contact> addressBook1 = new ArrayList<>();
        Contact cont = createContact();
        addressBook1.add(cont);
        System.out.println(cont);
        System.out.println("Contacts added Successfully");
    }
    public void editContact (){
        ArrayList<Contact> addressBook1 = new ArrayList<>();

        boolean isContactFound = false;
        System.out.println("Enter ContactDetail to edit");
        String contactDetail = sc.next();
        for(Contact cont : addressBook1){
            if (contactDetail.equalsIgnoreCase(cont.getFirstName())){
                isContactFound = true;
                System.out.println("Enter First Name ");
                cont.setFirstName(sc.next());
                System.out.println("Enter Last Name ");
                cont.setLastName(sc.next());
                System.out.println("Enter address ");
                cont.setAddress(sc.next());
                System.out.println("Enter City");
                cont.setCity(sc.next());
                System.out.println("Enter State");
                cont.setState(sc.next());
                System.out.println("Enter Email");
                cont.setEmail(sc.next());
                System.out.println("Enter Zip Code ");
                cont.setZip(sc.next());
                System.out.println("Enter Phone Number ");
                cont.setPhoneNumber(sc.next());
                break;
            }
        }
        if(isContactFound){
            System.out.println("Contact Updated Successfully..");
        }
        else {
            System.out.println("Contact not found");
        }
    }
    public void deleteContact(){
        boolean isContactFound = false;
        System.out.println("enter name to delete contact");
        String name = sc.nextLine();
        for(Contact contact : addressBook1){
            if (contact.getFirstName().equalsIgnoreCase(name)){
                System.out.println("contact found :");
                isContactFound = true;
                System.out.println(contact);
                System.out.println("Confirm to delete (y/n)");
                if(sc.next().equalsIgnoreCase("y")){
                    addressBook1.remove(contact);
                    System.out.println("contact delete");
                }
                break;
            }
        }
        if (!isContactFound){
            System.out.println("opps... contact not found");
        }
    }
    void display(){

        for(Contact person : addressBook1){
            System.out.println(person);
        }
    }



}














