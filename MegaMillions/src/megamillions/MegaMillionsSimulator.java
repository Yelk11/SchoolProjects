/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megamillions;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Matthew
 */
public class MegaMillionsSimulator
{
    public static void main(String[] args)
    {
        int totalSpent = 0;
        int totalWon = 0;
        
        int numberOfTicketsToPurchase = Integer.parseInt(
                JOptionPane.showInputDialog(
                "Please enter the number of tickets you want to buy, or 0 to quit") );
        
        while ( numberOfTicketsToPurchase != 0 )
        {
            Date date = new Date();
        
            
            totalSpent += numberOfTicketsToPurchase * MegaMillions.TICKET_PRICE;
            MegaMillions winningTicket = new MegaMillions();
            long timeMilli = date.getTime();
            //System.out.println( timeMilli);
            for ( int ticketNumber = 0; ticketNumber < numberOfTicketsToPurchase; ticketNumber++ )
            {
                
                MegaMillions myTicket = new MegaMillions();
                totalWon += myTicket.getWinnings( winningTicket );
                if ( myTicket.getWinnings(winningTicket ) == 1000000000 )
                {
                    JOptionPane.showMessageDialog(null, "JACKPOT");
                }
                
            }
            Date thisisBAd = new Date();
            System.out.println( "Time to execute");
            System.out.println( thisisBAd.getTime() - timeMilli);
            String message = String.format("Total Spent: %d - Total Won: %d - Net Loss: %d", 
                    totalSpent, totalWon, totalWon - totalSpent );
            JOptionPane.showMessageDialog(null, message);
            
            numberOfTicketsToPurchase = Integer.parseInt(
                JOptionPane.showInputDialog(
                "Please enter the number of tickets you want to buy, or 0 to quit") );
            
        }
    }
}
