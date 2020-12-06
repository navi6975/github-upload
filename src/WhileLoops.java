public class WhileLoops {
    public static void main(String[] args)
    {
        int value=0;
        int sum = 0;
        while (value<10)
        {
            System.out.println(" " +value);
            value++;
            sum = sum + value;
        }
        System.out.println("The total sum: "+sum);
    }
}
