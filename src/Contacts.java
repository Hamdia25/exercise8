public class Contacts {
    private Contact contactList;
    private BusinessContacts businessContacts;

    public Contacts(Contact contactList, BusinessContacts businessContacts) {
        this.contactList = contactList;
        this.businessContacts = businessContacts;
    }

    public Contact getContactList() {
        return contactList;
    }

    public void setContactList(Contact contactList) {
        this.contactList = contactList;
    }

    public BusinessContacts getBusinessContacts() {
        return businessContacts;
    }

    public void setBusinessContacts(BusinessContacts businessContacts) {
        this.businessContacts = businessContacts;
    }
    public void display(){
        System.out.println("Would you like to add a contact");
    }
    @Override
    public String toString() {
        return "Contacts{" +
                "contactList=" + contactList +
                ", businessContacts=" + businessContacts +
                '}';
    }

    public void add() {
        Contact.add();
    }
}

