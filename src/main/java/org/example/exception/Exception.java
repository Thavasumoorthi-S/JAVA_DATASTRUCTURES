package org.example.exception;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exception {
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private Exception()
    {

    }
    public static void execute()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true)
        {
            LOGGER.info("\n1)BANK EXCEPTION \n2)Student Exception \n3)Creditcard Exception \n4)Coordinate Exception  \n5)Singleton Exception\n6)Exit");
            LOGGER.info("Choose any one of the option in the above");
            choice=sc.nextInt();
            if(choice==1)
            {
                BankException.execute();
            }
            else if(choice==2)
            {
                StudentException.execute();
            }
            else if(choice==3)
            {
                CreditcardException.execute();
            }
            else if(choice==4)
            {
                CoordinateException.execute();
            }
            else if(choice==5)
            {
                SingletonException.execute();
            }
            else if(choice==6)
            {
                break;
            }
            else {
                LOGGER.info("please choose any one of the option in the above");
            }
        }
    }
}
