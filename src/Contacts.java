import java.util.ArrayList;

public class Contacts {
    private Contact contactList;
    private BusinessContacts businessContacts;

    public Contacts(String name, String email, String phone) {
        this.contactList = new Contact(name, email);
        this.businessContacts = new BusinessContacts( name,  email,  phone);
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




    }
    @Override
    public String toString() {
        return "Contacts{" +
                "contactList=" + contactList +
                ", businessContacts=" + businessContacts +
                '}';
    }

    public void add(Contacts contacts) {
        contacts.add(contacts);
        }

}

