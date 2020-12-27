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
        C_LinkedList.Node node;
        C_Queue queue = new C_Queue();
        C_Queue.Node qNode;
        Pull_Stack stack;
        
        
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
                System.out.println("Enter Item SKU: ");
                int No = scan.nextInt();
                System.out.println("Enter Item Name: ");
                String Name = scan.next();
                System.out.println("Enter Item Price: ");
                double Price = scan.nextDouble();
                System.out.println("Enter Item Details: ");
                String details = scan.next();
                System.out.println("Enter Item Quantity: ");
                int Quantity = scan.nextInt();
                
                node = new C_LinkedList.Node(No, Name, Price, details, Quantity);

                list.addAtEnd(node);
                
            }
            else if(cs==2)
            {
                System.out.println("Enter Customer Name: ");
                String name = scan.next();
                System.out.println("Enter Customer Email Address: ");
                String email = scan.next();
                System.out.println("Enter Customer Phone Number: ");
                String phone = scan.next();
                System.out.println("Enter Customer Address: ");
                String Address = scan.next();
                

        //      Order Details
                
                while(true)
                {
                    System.out.println("1: Place Order. 2: Cancel");
                    
                    int ch = scan.nextInt();
                    
                    if(ch==1)
                    {
                        System.out.println("Select Item:");
                        list.print();

                        System.out.println("Enter Item Code: ");
                        int item = scan.nextInt();
                        
                        C_LinkedList.Node list2;
                        list2 = list.search(item);
                        
                        qNode = new C_Queue.Node(name, email, phone, Address, list2);
                        
                        queue.enqueue(qNode);
                        
                        System.out.println("Order Placed Successfully!");
                        System.out.println("Do you want to make another purchase?");
                        System.out.println("1: Yes, 2: No");
                        int x = scan.nextInt();
                        if(x==1)
                        {
                            continue;
                        }
                        else if(x==2)
                        {
                            break;
                        }
                        
                    }
                    else if(ch==2)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Choose Correct Option");
                    }
                }
                
                
                
            }
            else if(cs==3)
            {
                
            }
            else if(cs==4)
            {
                break;
            }
            else{
                System.out.println("Please Choose Valid Options");
            }
                    
        }

    }
    
    
}
