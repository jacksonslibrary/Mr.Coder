public class StringManipulator {
    public static final String OPTIONS = "Cipher or Compress? ";
    public static final String VOWELS = "aeiouAEIOU";

    public StringManipulator()
    {
        //
    }

    public static String encrypt(String msg, int shift)
    {
        StringBuilder encryptMsg = new StringBuilder();
        for(int i = 0; i < msg.length(); i++) 
        {
            encryptMsg.append((char)(msg.charAt(i) + shift));
        }
            

        return encryptMsg.toString();
    }

    public static String stringCompress(String msg)
    {
        StringBuilder compressMsg = new StringBuilder();
        char space = ' ';
        for(int i = 0; i < msg.length(); i++)
        {
            char a = msg.charAt(i);
            if(!(VOWELS.contains(a + "")) || Character.isWhitespace(space))
            {
                compressMsg.append(a);
            }
            space = a;
        }
        return compressMsg.toString();
    }

    public static String manipulate(String msg, String type)
    {
        if(type.contains("ompress"))
        {
            System.out.println("Your Coded Message: " + stringCompress(msg));
        }
        else if(type.contains(EncryptedMessageApp.getAmount()))
        {
            System.out.println("Your Coded Message: " + encrypt(msg, Integer.parseInt(EncryptedMessageApp.getAmount())));
        }
        else
        {
            //
        }

        return "";

    }

}
