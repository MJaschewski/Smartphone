package de.neuefische;

public class Friend extends Contact{
    private int phoneNumber;

    public Friend() {
    }

    public Friend(String contactName, int phoneNumber) {
        super(contactName);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber=" + phoneNumber +
                "} " + super.toString();
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
