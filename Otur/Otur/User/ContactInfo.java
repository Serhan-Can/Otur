package Otur.User;

public class ContactInfo {
    String number;
    String eMailAddress;


    public ContactInfo() {
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEMailAddress() {
        return this.eMailAddress;
    }

    public void setEMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }
    public String getContactInfo(){
        return this.getNumber() +" \n" + this.getEMailAddress();
    }    
}
