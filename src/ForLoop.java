public class ForLoop {

    public static void main(String[] args)
    {
        //for (init var; condition, actualization)
        // initialize the variable out of loop for use in the rest of the program
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= 3; j++)
            {
                for (int k = 1; k <= 3; k++)
                {
                    System.out.print(i + " ");
                    System.out.println();
                }

            }
        }
    }
}
