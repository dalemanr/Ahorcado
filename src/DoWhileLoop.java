public class DoWhileLoop {

    public static void main(String[] args) {

        int cont = 1;

        //do the action before check condition for first time
        do{
            System.out.println("This is before the condition loop");
            System.out.println(cont);

            cont++;
        }while (cont <= 5);



    }
}
