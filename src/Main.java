import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
   ArrayList<Contacts> contacts = new ArrayList<>();
   boolean isBusinessContact = true;
        try{
            System.out.println("Would you like to add a contact? ");
            String userInput = input.nextLine();
            if((userInput.equals("Yes"))){
                System.out.println("What contact name will you add?");
                String name = input.nextLine();
                System.out.println("What email will you add?");
                String email = input.nextLine();
                System.out.println("What contact number will you add?");
                String phone = input.nextLine();
                contacts.add(new Contacts(name, email, phone));
                System.out.println(contacts);
            }}
        catch(Exception InputArithmetic){
            System.out.println("Please enter an integer");
        }
    }}
