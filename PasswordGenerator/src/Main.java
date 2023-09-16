import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GeneratePassword pass=new GeneratePassword();

        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF PASSWORD");
        int size = scan.nextInt();
        scan.close();

        String password= pass.genenrated_Password(size);
        System.out.println("YOUR GENERATED PASSWORD IS " + password);









       







    }
}