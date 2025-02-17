import java.util.Scanner;
import static java.lang.System.*;

public class User_Input extends List  
{
    final private String task = "exit";

    List baseObj = new List();

    public void input_todo()
    {
        String input;
        Scanner in = new Scanner(System.in);
        out.println("\n\nTo quit just type exit.\n");
        outter :
        {
        do
        {
            out.print("Enter a task: ");
            input = in.nextLine();

            if((input.equals(task)))
            {
                break outter;
            }
            else
            {
                add(input);
            }

        }while(!(input.equals(task)));

        }

    } 

    public void input_complete()
    {
        String input;
        Scanner in = new Scanner(System.in);
       

        out.println("To quit just type exit.\n");
        outter :
        {
        do
        {
            out.print("Enter a completed task: ");
            input = in.nextLine();

            if(input.equals(task))
            {
                break outter;
            }
            
        inner :
        {
            for(var check : list)
            {
                if(!(check.equals(input)))
                {
                    continue;
                }

                if(check.equals(input))
                {
                    complete(input);
                    break inner;
                }

            }
        }
            
        
        } while(!(input.equals(task)));

        }
    
    }


}// close for User_Input class