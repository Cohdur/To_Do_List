import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass
{
    @Test
    public void TestForCount()
    {

        //Only TEST for primary function necessary for entire program to function 

        //complete list has a user input test to check if task has been started
        //to add the task into the complete list.
        //Also, in driver class the input will check for string inputs to be interpretted as invalid.

        List handle = new List();

        //Add tasks to incomplete tasks

        handle.add("Milk");
        handle.add("Wash car");
        handle.add("Cheese");

        assertEquals(3, handle.get_list_total());

        //Testing for complete list condition.
        //Only through User input within driver will accept only started task

        handle.complete("Cheese");
        handle.complete("Milk");

        assertEquals(2, handle.get_Complete_list_total());

        //Clear all count

        handle.clear();

        assertEquals(0, handle.get_list_total());
        assertEquals(0, handle.get_Complete_list_total());
    }


}
