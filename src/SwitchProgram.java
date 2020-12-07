import java.util.Scanner;

public class SwitchProgram{
    public static void main(String[] args)
    {
        System.out.println("Please enter a text: ");

        Scanner input = new Scanner(System.in);
        String text=input.nextLine();

        switch(text)
        {
            case"start":
            {
                System.out.println("Machine Started");
                break;
            }

            case "stop":
            {
                System.out.println("System stopped");
                break;
            }

            default:
                System.out.println("Command not understand");
        }
    }
}
