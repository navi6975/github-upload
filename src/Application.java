public class Application {
    public static void main(String[] args)
    {
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        byte myByte = 127;  // (8 bit) 2 to the power of 8 -1 is the max value.   It has a minimum value of -128 and a maximum value of 127 (inclusive)
        short myShort = 847; // (16-bit ) It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
        int myNumber = 88;  // which has a minimum value of 0 and a maximum value of 232-1

        long myLong = 9797; //which has a minimum value of 0 and a maximum value of 264-1

        double myDouble = 7.3243;
        float myFloat = 324.3f;

        char myChar = 'y';
        boolean myBoolean = false;



        System.out.print(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myByte);

    }
}
