public class BusinessContacts extends Contact {
    private String phoneNumber;
    public BusinessContacts(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "BusinessContacts{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Contact number: " + phoneNumber);
    }


}
