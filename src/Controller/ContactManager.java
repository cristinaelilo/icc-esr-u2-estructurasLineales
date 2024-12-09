package Controller;

import materia.models.Contact;
import materia.models.LinkedList;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.appendToTail(contact);
    }

    public void printList() {
        if (contacts.getSize() == 0) {
            System.out.println("No contacts available.");
            return;
        }
        contacts.print();
    }
}
