public class ControlFlows {

    public static void main(String[] args) {

        int i;

        for (i = 0; i < 10; i++)
        {
            System.out.println(i);
            if(i==5){
                return; //break to stop loop, continue to skip the condition, return similar to break but return anything it's for functions
            }
            System.out.println(i);
        }
    }
}
