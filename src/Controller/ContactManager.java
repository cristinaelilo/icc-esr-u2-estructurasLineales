package Controller;

import materia.models.Contact;
import materia.models.LinkedList;
import materia.models.NodeGeneric;

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

    public Contact<?, ?> findContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead(); //Obtener para iterar la 
        while (current != null) {
            if(((String) (current.getValue().getName())).equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();  //Porque siempre pregunta por el mismo y no por el siguiente
            //System.out.println(current);
            //System.out.println(current.getNext());
        } 
        return null; //No se encontro 
    }

    public void deleteContactByName(String name) {
       NodeGeneric<Contact<?, ?>> current = contacts.getHead();

       if (current == null)
           return;

        //Caso 1 que el contacto sea la HEAD o cabeza
        if ((((String) (current.getValue().getName())).equalsIgnoreCase(name))) {
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize(contacts.getSize());
            return;
        }

        //Caso 2 en el resto
        while (current.getNext() != null) {
            if ((((String) (current.getNext().getValue().getName())).equalsIgnoreCase(name))) {
                current.setNext(current.getNext().getNext());
                contacts.setSize(contacts.getSize() - 1);
            }
        }
    }
}
