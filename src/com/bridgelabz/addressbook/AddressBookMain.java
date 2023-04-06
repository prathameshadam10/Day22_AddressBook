package com.bridgelabz.addressbook;
import java.util.HashMap;
import java.util.Scanner;
public class AddressBookMain {
    HashMap<String, AddressBook> hashMap = new HashMap<String,AddressBook>();
    Scanner sc = new Scanner(System.in);
    public void addAddressBook(){
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter Name of AddressBook");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            System.out.println("Enter different name for the AddressBook");
            addAddressBook();
        }else {
            addressBook.setAddressBookName(name);
            hashMap.put(addressBook.getAddressBookName(), addressBook);
            System.out.println("Address book Added.....");
        }
    }
    public void addContact() {
        if (hashMap.isEmpty()) {
            System.out.println("your addressbook is empty first please add new Addressbook");
            addAddressBook();
        }
        System.out.println("Enter name of the addressbook  in which you want to add contact:");
        String name = sc.nextLine();
        if (hashMap.containsKey(name)) {
            AddressBook temp = hashMap.get(name);
            temp.addContact();
        }
    }
    public void displayContact(){
        System.out.println("Enter name of Addressbook in which you want to display contact");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.displayContact();
        }
    }
    public void deleteContact(){

        System.out.println("Enter name of the addressbok in which you want to Delete contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.deleteContact();
        }
    }
    public void editContact(){
        System.out.println("Enter name of the addressbok in which you want to Edit contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.editContact();
        }
    }

    public void displayAllAddressbook(){
        System.out.println("Displaying all addressbook");
        if(hashMap.isEmpty()){
            System.out.println("Addressbook is empty");
        }else {
            System.out.println(hashMap);
        }
    }
    public static void main(String[] args) {
        System.out.println("******Welcome to Address Book Program******");
        System.out.println("Contacts created in Address Book");
        AddressBookMain addressBookMain = new AddressBookMain();
        Scanner sc = new Scanner(System.in);

        boolean flag1 = true;
        while (flag1){

            System.out.println("-----\nSelect option");
            System.out.println("1.Add Details \n 2.Edit Contact\n 3.Delete contact \n 4.Display\n 5.Add AddressBook\n 6.Display All Addressbook\n 7. exit");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    addressBookMain.addContact();
                    break;
                case 2:
                    addressBookMain.editContact();
                    break;
                case 3:
                    addressBookMain.deleteContact();
                    break;
                case 4:
                    addressBookMain.displayContact();
                    break;
                case 5 :
                    addressBookMain.addAddressBook();
                    break;
                case 6:
                    addressBookMain.displayAllAddressbook();
                case 7:
                    flag1 = false;
                    break;
                default:
                    System.out.println(option + "is not valid option");
                    break;
            }
        }

    }
}
