import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
   Contact contactList = new Contact("James","james231@gmail.com");
   Contact contact2 = new Contact("Aaron","aaron242@gmail.com");
   contact2.display();
   Contact contact3 = new Contact("Shukri","shukri16@yahoo.com");
   Contact contact4 = new Contact("Amal","amal882@outlook.com");
   Contact contact5 = new Contact("Mary","marycastle32@gmail.com");
   BusinessContacts businessContacts1 = new BusinessContacts("Amal", "amal882@outlook.com","614-549-8742");
   BusinessContacts businessContacts = new BusinessContacts("Aaron", "aaron242@outlook.com","614-245-3354");
   BusinessContacts businessContacts3 = new BusinessContacts("Silas", "silas91@outlook.com", "614-446-3586");
   businessContacts3.display();
   Contacts contacts = new Contacts(contactList, businessContacts);
   contacts.display();
   try{
        int userInput = Integer.parseInt(input.nextLine());
        if(userInput == 1){
            contacts.add();
        }
        else{
            System.exit(0);
        }
        System.out.println("What contact name will you add?");
        input.nextLine();
       System.out.println("What email number will you add?");
       input.nextLine();
       System.out.println("What contact number will you add?");
       input.nextLine();
        contacts.add();
       System.out.println(contacts);
        }
    catch(Exception InputArithmetic){
        System.out.println("Please enter an integer");
    }
        }}
    
