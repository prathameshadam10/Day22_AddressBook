package com.bridgelabz;


import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("******Welcome to Address Book Program******");
        System.out.println("Contacts created in Address Book");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        boolean flag1 = true;
        while (flag1){

            System.out.println("-----\nSelect option");
            System.out.println("1.Add Details \n 2.Edit Contact\n 3.Delete contact \n 4.Display\n 5.Exit");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    addressBook.addDetails();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.display();
                    break;
                case 5:
                    flag1 = false;
                    break;
                default:
                    System.out.println(option + "is not valid option");
                    break;
            }
        }
