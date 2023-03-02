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
                        break;

                    case 2:
                        Shape.execute();
                        break;

                    case 3:
                        StudentTest.execute();
                        break;

                    case 4:
                        Singleton.execute();
                        break;

                    case 5:
                        Coordinates.execute();
                        break;

                    case 6:
                        Creditcard.execute();
                        break;


                    case 7:
                        Exception.execute();
                        break;
                    case 8:
                        Students.execute();
                        break;

                    case 9:
                        LinkedList.execute();
                        break;

                    case 10:
                        Hashset.excute();
                        break;

                    case 11:
                        Calculator1.execute();
                        break;

                    case 12:
                        Contact.execute();
                        break;

                    case 13:
                        Fileopds.execute();
                        break;

                    case 14:
                        Games.execute();
                        break;

                    default:
                        LOGGER.info("please enter valid input");
                        break;
                }
            }
    }
}


