package org.example.EXCEPTION;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exception {
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void Execute()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true)
        {
            LOGGER.info("\n1)BANK EXCEPTION \n2)Shape Exception \n3)Student Exception \n4)Creditcard Exception \n5)Coordinate Exception  \n6)Singleton Exception\n7)Exit");
            LOGGER.info("Choose any one of the option in the above");
            choice=sc.nextInt();
            if(choice==1)
            {
                BankException.execute();
            }
            else if(choice==2)
            {
                ShapeException.execute();
            }
            else if(choice==3)
            {
                StudentException.execute();
            }
            else if(choice==4)
            {
                CreditcardException.execute();
            }
            else if(choice==5)
            {
                CoordinateException.execute();
            }
            else if(choice==6)
            {
                SingletonException.execute();
            }
            else if(choice==7)
            {
                break;
            }
            else {
                LOGGER.info("please choose any one of the option in the above");
            }
        }
    }
}
