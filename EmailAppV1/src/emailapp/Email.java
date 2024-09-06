package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "test.com";

    // Constructor to recieve first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for dept - return the dept.
        this.department = setDepartment();

        // Call a method that generates random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is:" + this.password + "\nNOTE: WRITE YOUR PASSWORD DOWN TO PREVENT LOSS OF ACCOUNT");

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }
    // Ask for department
private String setDepartment() {
    System.out.print("Enter the department \n1 Sales \n2 Development \n3 Accounting \n0 None\n Choose Department: ");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();

    if (depChoice == 1) {
        return "Sales";
    }
    else if (depChoice == 2) {
        return "Development";
    }
    else if (depChoice == 3) {
        return "Accounting";
    }
    else {
        return "";
    }
}
    // Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$!*%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }
    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    // Set alternate email
    public void setAltEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Set the password
    public void changePassword(String password){
        this.password = password;
    }
    
    public int getMailboxCapacity() {return mailboxCapacity; }
    public String getAltEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + "" + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }
}
