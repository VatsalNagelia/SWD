package in.ac.bits_hyderabad.swd.swd.helper;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashString {
    public static String getSHA(String input)
    {

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hashtext = no.toString(16);

            while (hashtext.length() < 64) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown"
                    + " for incorrect algorithm: " + e);

            return null;
        }
    }

    // Driver code
    public static void main(String args[]) throws NoSuchAlgorithmException
    {
        System.out.println("HashCode Generated by SHA-256 for:");

        String s1 = "GeeksForGeeks";
        System.out.println("\n" + s1 + " : " + getSHA(s1));

        String s2 = "hello world";
        System.out.println("\n" + s2 + " : " + getSHA(s2));
    }
}