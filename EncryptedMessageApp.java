import java.util.Scanner;

public class EncryptedMessageApp {
    private final Scanner scanner = new Scanner(System.in);
    private static String amount;
    
    public EncryptedMessageApp()
    {
        //
    }

    public static String getAmount()
    {
        return amount;
    }

    private void askPrompt()
    {
        System.out.print("Enter Message: ");
    }

    private void printExit()
    {
        System.out.print("You have chosen life encryption");
    }

    private void printSplash()
    {
        System.out.println("=== Mr. Coder ===\nType exit to quit");
    }

    public void run() 
    {
        while(true)
        {
            printSplash();
            askPrompt();
            String msg = scanner.nextLine();
            if(msg.equals("exit")){break;}
            System.out.print(StringManipulator.OPTIONS);
            String type = scanner.nextLine();
            if(type.equals("exit")){break;}
            if(type.contains("ipher"))
            {
                if(!(type.contains(":")))
                {
                    System.out.print("By how much Caeser cipher shift? ");
                    amount = scanner.nextLine();
                    if(amount.equals("exit")){break;}
                    type += ":" + amount;
                }
                else
                {
                    amount = type.substring(type.indexOf(':') + 1, type.length());
                }
            
            }
            else if(type.contains("ompress"))
            {

            }
            else{break;}
            StringManipulator.manipulate(msg, type);
            System.out.print("Would you like to see Mr. Coder again? (y/n) ");
            String ans = scanner.nextLine();
            if(ans.contains("n") || ans.equals("exit")){break;}

        }
        printExit();


        

    }
    
}
