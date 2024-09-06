/* 
 * MAKA AHIO 09-05-2024
 * PROJECT 9524 - EMAIL CREATION APPLICATION 
 * 
 * SCENARIO: 
 * You are an IT Support Admin and you are charged with a task of creating email accounts for your organization or for new hires
 * 
 * OBJECTIVES:
 * - Application needs to do the following
 *      - Generate an email with the following: firstname.lastname@department.company.com
 *      - Determine which department the associate is in (sales, development, accounting), if none leave blank
 *      - Generate a random password
 *      - Have set methods to change password, set the mailbox capacity, and define an alternate email address
 *      - Have get methods to display name, new email, and mailbox capacity
 * 
*/

package emailapp;

public class EmailAppMain {
    public static void main(String[] args) throws Exception {
        Email em1 = new Email("John", "Doe");
        System.out.println(em1.showInfo());
    }
}
