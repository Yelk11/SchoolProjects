/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingexamples;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Matthew
 */
public class SortingExamples
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String[] strings = new String[] {"Cat", "Mouse", "Elephant", "Wolf", "Dog", "Supercalifragisticexpealidotous"};
        printArray(strings);
        //Arrays.sort(strings, new StringLengthSort());
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String thing1, String thing2)
            {
                return thing1.length() - thing2.length();
            }
        });
        
        Arrays.sort(strings, (String thing1, String thing2) -> thing1.length() - thing2.length()); // LAMDA notation
        
        printArray(strings);
    }
    
    public static void printArray(String[] strings)
    {
        for (String s : strings)
        {
            System.out.println(s);
            
        }
        System.out.println();
    }
    
}
