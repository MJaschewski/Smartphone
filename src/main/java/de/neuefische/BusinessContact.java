package de.neuefische;

public class BusinessContact extends Contact{
    private String companyName;

    public BusinessContact(String contactName, String companyName) {
        super(contactName);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BusinessContact() {
    }
}
