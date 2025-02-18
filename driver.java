import static java.lang.System.*;

import java.util.Scanner;

public class driver extends User_Input

{
    public static void main(String arg[])
    {

        Scanner in = new Scanner(System.in);
        driver mylist = new driver();

        int choice;

        out.println("TASK LIST PROGRAM ENTER USER OPTION\n"); 

        do
        {   
            
            out.println("\n0 - Exit\n1 - Add task\n2 - Remove completed task\n3 - Output both list\n4 - Output only to do task\n5 - Output only complete list\n6 - Clear all tasks");
            out.print("\nCHOICE: ");

            while(!(in.hasNextInt()))
            {
                if (in.hasNextInt())
                {  
                    // Check if input is an integer
                    choice = in.nextInt();
                    break;  // Exit loop if valid
                } 
                else
                {
                    out.println("Invalid input! Please enter a valid integer.");
                    in.next();  // Clear the invalid input
                }
            }

            choice = in.nextInt(); 
            
            while(choice < 0 ||  choice > 6)
            {
                out.println("\nONLY 0 - 6 " +
                "\n0 - Exit\n1 - Add task\n2 - Remove completed task\n3 - Output both list\n4 - Output only to do task\n5 - Output only complete list\n6 - Clear all tasks");
                out.print("\nChoice: ");
                
                while(!(in.hasNextInt()))
                {
                    if (in.hasNextInt())
                    {  
                        // Check if input is an integer
                        choice = in.nextInt();
                        break;  // Exit loop if valid
                    } 
                    else
                    {
                        out.println("Invalid input! Please enter a valid integer.");
                        in.next();  // Clear the invalid input
                    }
                    
                }
                
                choice = in.nextInt();

                if(choice > 0 && choice < 6)
                {
                    break;
                }
            }
             

            switch (choice) 
            {
                case 1:
                    mylist.input_todo();
                    break;
            
                case 2:
                    mylist.input_complete();
                    break;

                case 3:
                    mylist.all();
                    break;

                case 4:
                    mylist.incomplete_output();
                    break;
                
                case 5:
                    mylist.complete_output();
                    break;
                case 6:
                    mylist.clear();
                case 0:

                    break;

            }

        }while (choice != 0);

        in.close();
        
        out.println("Goodbye");
    } // close main

} // close class
    


