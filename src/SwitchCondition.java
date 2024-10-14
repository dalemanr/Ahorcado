import java.util.Scanner;

public class SwitchCondition {

    public static void main(String[] args)
    {
        //what type of drink do you like?
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to drink machine");
        System.out.println("Select your drink");
        String drink = sc.nextLine();

        switch (drink){

            case "Caffe":
                System.out.println("Caffe");
                break;
            case "Juice":
                System.out.println("Juice");
                break;
            case "Water":
                System.out.println("Water");
                break;
            case "Beer":
                System.out.println("Beer");
                break;
            default:
                System.out.println("Enjoy your drink!");
        }

        sc.close();
    }
}
