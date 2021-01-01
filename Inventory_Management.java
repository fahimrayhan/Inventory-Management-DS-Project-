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
        Pull_Stack stack = new Pull_Stack();
        Pull_Stack.Node sNode;
        Scanner scan = new Scanner(System.in);
        
        
        while(true)
        {
            System.out.println("Choose Option: 1: Add Items To The Inventory");
            System.out.println("Choose Option: 2: Order An Item");
            System.out.println("Choose Option: 3: Generate Monthly Report");
            System.out.println("Choose Option: 4: Exit");
            
            
            
            int cs = scan.nextInt();
            
            if(cs==1)
            {
                System.out.println("Enter Item SKU: ");
                int No = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter Item Name: ");
                String Name = scan.nextLine();
                System.out.println("Enter Item Price: ");
                double Price = scan.nextDouble();
                scan.nextLine();
                System.out.println("Enter Item Category: ");
                String Category = scan.nextLine();
                System.out.println("Enter Item Quantity: ");
                int Quantity = scan.nextInt();
                
                node = new C_LinkedList.Node(No, Name, Price, Category, Quantity);

                list.addAtEnd(node);
                
            }
            else if(cs==2)
            {
                scan.nextLine();
                System.out.println("Enter Customer Name: ");
                String name = scan.nextLine();
                System.out.println("Enter Customer Email Address: ");
                String email = scan.nextLine();
                System.out.println("Enter Customer Phone Number: ");
                String phone = scan.nextLine();
                System.out.println("Enter Customer Address: ");
                String Address = scan.nextLine();
                

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
                        list2.Quantity--;
                        qNode = new C_Queue.Node(name, email, phone, Address, list2);
                        
                        queue.enqueue(qNode);
                        
                        System.out.println("Order Placed Successfully!");
                        
                        System.out.println("\t //// Order Details ////");
                        
                        System.out.println(qNode.toString());
                        
                        sNode = new Pull_Stack.Node(list2);
                        
                        stack.push(sNode);
                        
                        System.out.println("\nDo you want to make another purchase?");
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
                stack.print();
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
