/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pmu_ride;
import java.util.Scanner;

public class PMU_Ride {

    class Account{
        //String userID;
        String userPassword;
        String PMUid;
        String fullName;
        String Email;
        String phoneNumber;
        char Gender;
        
        public Account(String userPassword,String PMUid,String fullName,String Email,String phoneNumber,char Gender){
            //this.userID=userID;
            this.userPassword=userPassword;
            this.PMUid=PMUid;
            this.fullName=fullName;
            this.Email=Email;
            this.phoneNumber=phoneNumber;
            this.Gender=Gender;
        } 
        public void createAccount(String userPassword,String PMUid,String fullName,String Email,String phoneNumber,char Gender){
            Scanner input=new Scanner(System.in);
            System.out.println("Full Name:");
            fullName=input.next();
            System.out.println("Email:");
            Email=input.next();
            System.out.println("Phone Number:");
            phoneNumber=input.next();
            System.out.println("PMU ID:");
            PMUid=input.next();
            System.out.println("Gender: (write F for female or M for male)");
            Gender=input.next().charAt(0);
            System.out.println("Password:");
            userPassword=input.next();
            System.out.println("Confirm Password:");
            String confirm=input.next();
            while(userPassword!=confirm){
                System.out.println("*Not the same password please rewrite it again*");
                confirm=input.next();
            }
            
        }
    }
    
    public static void main(String[] args) {
        
    }
    
}
