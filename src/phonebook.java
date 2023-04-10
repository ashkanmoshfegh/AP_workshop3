public class phonebook {
    private contact[] contacts;
    private int sizeContacts;
    public PhoneBook(int size) {
        contacts = new contact[size];
        sizeContacts = 0;
    }
    public boolean addContact(contact contact) {
        contacts[sizeContacts] = contact;
        sizeContacts++;
        return true;
    }

    public boolean deleteContact(String firstName, String lastName) {
        for (int i = 0; i < sizeContacts; i++) {
            if (contacts[i].getFirstname().equals(firstName) && contacts[i].getLastname().equals(lastName)) {
                for (int j = i + 1; j < sizeContacts; j++) {
                    contacts[j - 1] = contacts[j];
                }
                return true;
            }
        }
        return false;
    }

    public contact findContact(String firstName, String lastName) {
        for (int i = 0; i < sizeContacts; i++) {
            if (contacts[i].getFirstname().equals(firstName) && contacts[i].getLastname().equals(lastName)) {
                return contacts[i];
            }
        }
        return contacts[0];
    }

    public contact[] findContacts(String group) {
        contact[] res = new contact[50];
        int j = 0;
        for (int i = 0; i < sizeContacts; i++) {
            System.out.println(contacts[i].getGroup() + " != " + group);
            if (contacts[i].getGroup().equals(group)) {
                res[j] = contacts[i];
                j++;
            }
        }
        return res;
    }

    public void printContacts() {
        for (int i = 0; i < sizeContacts; i++) {
            printContact(contacts[i]);
            System.out.println("-------------------");
        }
    }

    public void printContact(contact x) {
        if (x.getGroup() == null) System.out.println("group: -");
        else System.out.println("group: " + x.getGroup());
        if (x.getEmail() == null) System.out.println("email: -");
        else System.out.println("email: " + x.getEmail());
        if (x.getFirstname() == null) System.out.println("firstName: -");
        else System.out.println("firstName: " + x.getFirstname());
        if (x.getLastname() == null) System.out.println("lastName: -");
        else System.out.println("lastName: " + x.getLastname());
        System.out.println("phoneNumber: " + x.getphonenummber().toString());
        System.out.println("address: " + x.getAddress().toString());
    }
}
