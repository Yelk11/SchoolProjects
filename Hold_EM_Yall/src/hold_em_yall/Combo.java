/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hold_em_yall;

import java.util.ArrayList;
import stacks.LinkedStack;

/**
 *
 * @author Matt
 * 
 * borrowed code from 
 * http://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
 */
public class Combo
{
    
    
    
    public void combonation(int arr[], int data[], int start, int end, int index, int combo_length)
    {
        
        if(index == combo_length)
        {
            arr = data;
                
                
            
        }
            
        for (int i=start; i<=end && end-i+1 >= combo_length-index; i++)
        {
            data[index] = arr[i];
            combonation(arr, data, i+1, end, index+1, combo_length);
        }
        
    }
    
    
    
    
    
}