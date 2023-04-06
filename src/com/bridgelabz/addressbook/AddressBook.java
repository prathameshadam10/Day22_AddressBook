package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
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
        Contact cont = createContact();
           System.out.println(cont);
           System.out.println("Contacts added Successfully");
        }




    }




