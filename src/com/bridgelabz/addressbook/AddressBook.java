package com.bridgelabz;

public class AddressBook {
    public void addDetails(){
        Contact cont = new Contact();
        cont.setFirstName("Prathamesh");
        System.out.println("First Name :" + cont.getFirstName());
        cont.setLastName("Adam");
        System.out.println("Last Name :" + cont.getLastName());
        cont.setAddress("Kuchan Nagar");
        System.out.println("Address :" + cont.getAddress());
        cont.setCity("Solapur");
        System.out.println("City :"+ cont.getCity());
        cont.setState("Maharastra");
        System.out.println( "State :"+ cont.getState());
        cont.setZip("413005");
        System.out.println("zip Code :" + cont.getZip());
        cont.setPhoneNumber("8983930906");
        System.out.println( "Phone Number :" + cont.getPhoneNumber());
        cont.setEmail("prathameshadam10@gmail.com");
        System.out.println( "Email :"+ cont.getEmail());


    }

    }



