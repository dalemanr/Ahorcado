public class Conditions {

    public static void main(String[] args)
    {
        //remember that if a condition is true, this doesn't entry in other condition
        int age = 18;

        if (age > 18)
        {
            System.out.println("You are older than 18, then you can buy beer");
        } else if (age == 18)
        {
            System.out.println("Your age is 18, you can buy beer but don't forget your id");

        } else
        {
            System.out.println("You are not older than 18, then you can't buy beer");
        }

    }
}
