public class Contact {
    private String name;
    private String email;


    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static void add() {
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public void display(){
        System.out.print("Contact name:" + name + " " + "Contact email:" + " " + email);
        Contact contacts = new Contact(name, email);
    }



}
