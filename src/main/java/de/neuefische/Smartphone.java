package de.neuefische;

import javax.swing.text.Position;
import java.util.Arrays;

public class Smartphone implements GPS, Radio{
    //properties
        private String model;
        private String manufacturer;
        private Contact[] contactList;
        private String position = "Cologne";

    //Methods
        @Override
        public String toString() {
            return "Smartphone{" +
                    "model='" + model + '\'' +
                    ", manufacturer='" + manufacturer + '\'' +
                    ", contactList=" + Arrays.toString(contactList) +
                    '}';
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public Contact[] getContactList() {
            return contactList;
        }

        public void setContactList(Contact[] contactList) {
            this.contactList = contactList;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public Smartphone(String model, String manufacturer, Contact[] contactList, String position) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.contactList = contactList;
            this.position = position;
        }

    public Smartphone(String model, String manufacturer, Contact[] contactList) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contactList = contactList;
    }


    public Smartphone() {
        }

        @Override
        public String getPosition() {
            return position;
        }

        @Override
        public boolean startRadio() {
            System.out.println("Radio started");
            return true;
        }

        @Override
        public boolean stopRadio() {
            System.out.println("Radio stopped");
            return false;
        }
}
