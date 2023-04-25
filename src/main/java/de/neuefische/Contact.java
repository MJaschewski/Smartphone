package de.neuefische;

public abstract class Contact {

    private String contactName;

    public String getContactName(){
        return this.contactName;
    }

    public Contact() {
    }

    public Contact(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactName='" + contactName + '\'' +
                '}';
    }
}
