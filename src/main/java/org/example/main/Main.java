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
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) throws IOException{
        int choice;
        Scanner sc=new Scanner(System.in);
            while(true) {
                LOGGER.info("\n)Bank\n2)shape\n3)student\n4)singleton\n5)coordinates\n6)credit card\n7)Exception\n8)Studentdata\n9)Array,Arraylist,Linkedlist\n10)hashset,treeset,hashmap\n11)calculator\n12)studentcontacts using Linkedlist\n13)file operation \n14)Tictactoe game\n15)Exit");
                LOGGER.info("Choose any one of the option in the above ");
                choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        Bank.execute();

                    case 2:
                        Shape.execute();

                    case 3:
                        StudentTest.execute();

                    case 4:
                        Singleton.execute();

                    case 5:
                        Coordinates.execute();

                    case 6:
                        Creditcard.execute();


                    case 7:
                        Exception.execute();
                    case 8:
                        Students.execute();

                    case 9:
                        LinkedList.execute();

                    case 10:
                        Hashset.excute();

                    case 11:
                        Calculator1.execute();

                    case 12:
                        Contact.execute();


                    case 13:
                        Fileopds.execute();

                    case 14:
                        Games.execute();

                    default:
                        LOGGER.info("please enter valid input");
                        break;
                }
            }
    }
}


/*
if (choice == 1) {
                    Bank.execute();
                }
                else if (choice == 2) {
                    Shape.execute();

                } else if (choice == 3) {
                    StudentTest.execute();
                } else if (choice == 4) {
                    Singleton.execute();
                } else if (choice == 5) {
                    Coordinates.execute();

                } else if (choice == 6) {
                    Creditcard.execute();
                } else if (choice == 7) {
                    Exception.execute();
                } else if (choice == 8) {
                    Students.execute();
                } else if (choice == 9) {
                    LinkedList.execute();
                } else if (choice == 10) {
                    Hashset.excute();

                } else if (choice == 11) {
                    Calculator1.execute();

                } else if (choice == 12) {
                    Contact.execute();
                } else if (choice == 13) {
                    Fileopds.execute();

                } else if (choice == 14) {
                    Games.execute();

                } else if(choice == 15) {
                    LOGGER.info("Thank you ");
                    break;
                }
                else{
                    LOGGER.info("please choose correct choice in the above");
                }
 */


/*
switch(case)
    {
        case 1:
            Bank.execute();

        case 2:
            Shape.execute();

        case 3:
            StudentTest.execute();

        case 4:
            Singleton.execute();

        case 5:
            Coordinates.execute();

        case 6:
            Creditcard.execute();


        case 7:
            Exception.execute();
        case 8:
            Students.execute();

        case 9:
            LinkedList.execute();

        case 10:
            Hashset.excute();

        case 11:
            Calculator1.execute();

        case 12:
            Contact.execute();


        case 13:
            Fileopds.execute();

        case 14:
            Games.execute();

        default:
            LOGGER.info("please enter valid input");
    }
 */