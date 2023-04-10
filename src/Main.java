import java.util.*;
public class Main {
    public static void main(String[] args) {
        boolean amir = false;
        Scanner scn = new Scanner(System.in);
        phonebook phone = new phonebook(30);
        String order = "exit";
        do {
            if (!amir) order = scn.next();
            amir = false;
            if (order.equals("contacts")) {
                String ar, firstname, lastname, tmp;
                ar = scn.next();
                firstname = scn.next();
                lastname = scn.next();
                contact now = new contact();
                phonenumber k = new phonenumber();
                address ad = new address();
                if (ar.equals("-a")) {
                    System.out.println("Please enter contact's group: ");
                    tmp = scn.next();
                    now.setGroup(tmp);
                    System.out.println("Please enter contact's email: ");
                    tmp = scn.next();
                    now.setEmail(tmp);
                    System.out.println("Please enter contact's country code: ");
                    tmp = scn.next();
                    k.setcountrycode(tmp);
                    System.out.println("Please enter contact's phone number: ");
                    tmp = scn.next();
                    k.setnumber(tmp);
                    System.out.println("Please enter contact's zip code: ");
                    tmp =scn.next();
                    ad.setZipCode(tmp);
                    System.out.println("Please enter contact's country: ");
                    tmp = scn.next();
                    ad.setCountry(tmp);
                    System.out.println("Please enter contact's city: ");
                    tmp = scn.next();
                    ad.setCity(tmp);
                    now.setphonenummber(k.getNumber());
                    now.setAddress(ad);
                    phone.addContact(now);
                }
                if (ar.equals("-r")) {
                    if (phone.deleteContact(firstname, lastname)) {
                        System.out.println("OK");
                    }
                    else System.out.println("Not found");
                }
            }
            if (order.equals("show")) {
                String gc, firstname, lastname, group;
                gc = scn.next();
                if (gc.equals("-g")) {
                    group = scn.next();
                    for (contact each : phone.findContacts(group)) {
                        if (each == null) continue;
                        phone.printContact(each);
                        System.out.println("==============");
                    }
                }
                else if (gc.equals("-c")) {
                    firstname = scn.next();
                    lastname = scn.next();
                    phone.printContact(phone.findContact(firstname, lastname));
                }
                else {
                    order = gc;
                    phone.printContacts();
                    amir = true;
                }
            }
        } while (!order.equals("exit"));
    }



}