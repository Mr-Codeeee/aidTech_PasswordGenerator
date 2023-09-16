import java.util.Random;

public class GeneratePassword {

    public String genenrated_Password (int size) {

        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuwxyz@#$%&()<>?/|";

        String password="";

        Random rand=new Random();

        while (password.length()<size) {

            int index = (int) (rand.nextFloat() * chars.length());

            password += chars.charAt(index);
        }
        return password;
    }

}
