/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject_cse207;

import java.util.Scanner;

/**
 *
 * @author fahim
 */
public class Inventory_Management {
    
    
    public static void main(String[] args) {
       
        
//       Functionalities
//         Add Items, Order Items; Generate Report; Monthly Report;
        
        C_LinkedList list = new C_LinkedList();
        C_Queue queue = new C_Queue();
        Pull_Stack stack = new Pull_Stack();
        
        
        while(true)
        {
            System.out.println("Choose Option: 1: Add Items To The Inventory");
            System.out.println("Choose Option: 2: Order An Item");
            System.out.println("Choose Option: 3: Generate Monthly Report");
            System.out.println("Choose Option: 4: Exit");
            
            Scanner scan = new Scanner(System.in);
            
            int cs = scan.nextInt();
            
            if(cs==1)
            {
                
            }
            else if(cs==2)
            {
                
            }
            else if(cs==3)
            {
                
            }
            else if(cs==4)
            {
                
            }
            else{
                System.out.println("Please Choose Valid Options");
            }
                    
        }

    }
    
    
}
