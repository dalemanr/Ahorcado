public class Arrays {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        numbers[2] = 4000;

        //foreach
        //element of array
        for(int n : numbers)
        {
            System.out.println(n);
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }


    }

}
