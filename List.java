import java.util.ArrayList;
import static java.lang.System.*;

public class List 
{

    //private String task = "";

    public ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> Complete_list = new ArrayList<>();

    private  int Total_list_items = 0;
    private  int Total_Completelist_items = 0;


    /**
    * The function will add a task to the list 
    * also increments total tasks for list
    * @param task 
    */
    public void add(String task)
    {
        list.add(task);

        ++Total_list_items;
    }

    /**
    * This function will add a task to the complete list and remove task from list. 
    * Also, will decrement total list task, and increment complete list tasks
    * @param task
    */
    public void complete(String task)
    {
        Complete_list.add(task);
        list.remove(task);
        --Total_list_items;
        ++Total_Completelist_items;
    }

    /**
     * Clear both list and reset the task counter
     */
    public void clear()
    {
        list.clear();
        Complete_list.clear();
        Total_list_items = 0;
        Total_Completelist_items = 0;
    }
    
    /**
     * The function will return the complete list for both 
     * @return *lists 
     */
    public void all()
    {
        if(Total_list_items == 0 && Total_Completelist_items != 0)
        {
            out.println("\nNo Current task");
            out.printf("%s%3d\n\n", "Complete list total:", get_Complete_list_total());
        }
        if(Total_Completelist_items == 0 && Total_list_items != 0)
        {
            out.println("\nNo Completed task");
            out.printf("%s%3d\n\n", "To do list remaining task:", get_list_total());
        }
        if(Total_list_items == 0 && Total_Completelist_items == 0)
        {
            out.println("\nNo tasks or completed tasks.\n\n");
        }
        else if(Total_list_items != 0 && Total_Completelist_items != 0)
        {
            out.printf("\n%s%3d\n", "To do list remaining task:", get_list_total());
            for(var itr = 0; itr < list.size(); itr++)
            {
                // incomplete list tasks
                out.println("->  " + list.get(itr));
            }
            out.printf("\n%s%3d\n", "Complete list total:", get_Complete_list_total());

            for(var itr = 0; itr <  Complete_list.size(); itr++)
            {
                //complete list tasks
                out.println("->  " + Complete_list.get(itr));
            }
            out.println();
        }
    }

    /**
     * Output the list with task completed
     */
    public void complete_output()
    {
        if(Total_Completelist_items == 0)
        {
            out.println("\nNo completed tasks");
        }
        out.printf("\n%s%3d\n", "Completed task: ", get_Complete_list_total());

        for( var itr = 0; itr < Total_Completelist_items; itr++)
        {
            out.println("->  " + Complete_list.get(itr));
        }
        out.println();
    }

    /**
     * Output the list with tasks not complete
     */
    public void incomplete_output()
    {
        if(Total_list_items == 0)
        {
            out.println("\nNo current tasks in list.");
        }
        out.printf("\n%s%3d\n","To do list task remaining:", get_list_total());
        for( var itr = 0; itr < Total_list_items; itr++)
        {
            out.println("->  " + list.get(itr));
        }
        out.println();
    }

    /**
     * This plays a vital part in the output of the array list as there isn't any integrated function 
     * @return Total items on the list
     */
    final int get_list_total()
    {
        return Total_list_items;
    }

    /**
     * This plays a vital part in the output of the array list as there isn't any integrated function
     * @return Total items on the complete list
     */
    final int get_Complete_list_total()
    {
        return Total_Completelist_items;
    }
}