/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author Matthew
 */
public class Lists
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("Today");
        listOfStrings.add("Tommorrow");
        listOfStrings.add(0, "Yesterday");
        listOfStrings.remove(1);
        
        while( !listOfStrings.isEmpty() )
        {
            System.out.println(listOfStrings.remove(0));
        }
        
        
        
        
        
    }
    
}
