package org.example.main;
import org.example.bank.Bank;
import org.example.calculator.Calculator1;
import org.example.contact_details.Contact;
import org.example.coordinates.Coordinates;
import org.example.creditcard.Creditcard;
import org.example.file_operation.Fileopds;
import org.example.hashing.Hashset;
import org.example.shape.Shape;
import org.example.simple_operation.LinkedList;
import org.example.student_data.StudentTest;
import org.example.student_details.Students;
import org.example.singleton.Singleton;
import org.example.tictactoe.Games;
import org.example.exception.Exception;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) throws IOException{
        int choice;
        Scanner sc=new Scanner(System.in);
            do {
                try
                {
                LOGGER.info("\n)Bank\n2)shape\n3)student\n4)singleton\n5)coordinates\n6)credit card\n7)Exception\n8)Studentdata\n9)Array,Arraylist,Linkedlist\n10)hashset,treeset,hashmap\n11)calculator\n12)studentcontacts using Linkedlist\n13)file operation \n14)Tictactoe game\n15)Exit");
                LOGGER.info("Choose any one of the option in the above ");
                choice = sc.nextInt();
                if (choice == 1) {
                    Bank.execute();
                }
                if (choice == 2) {
                    Shape.execute();

                } if (choice == 3) {
                    StudentTest.execute();
                } if (choice == 4) {
                    Singleton.execute();
                } if (choice == 5) {
                    Coordinates.execute();

                } if (choice == 6) {
                    Creditcard.execute();
                } if (choice == 7) {
                    Exception.execute();
                } if (choice == 8) {
                    Students.execute();
                } if(choice == 9) {
                    LinkedList.execute();
                } if(choice == 10) {
                    Hashset.excute();

                } if (choice == 11) {
                    Calculator1.execute();

                } if (choice == 12) {
                    Contact.execute();
                } if (choice == 13) {
                    Fileopds.execute();

                } if (choice == 14) {
                    Games.execute();

                } if(choice == 15) {
                    LOGGER.info("Thank you ");
                    break;
                }
                else{
                    LOGGER.info("please choose correct choice in the above");
                }
            }
                catch (InputMismatchException e)
                {
                   LOGGER.info("Please enter the  valid input only");
                }
        }while (true);
    }
}

