/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject_cse207;


/**
 *
 * @author fahim
 */
public class C_LinkedList {
    
    static class Node
    {
        int No;
        char Name;
        double Price;
        String details;
        int Quantity;
        Node next;

        public Node(int No, char Name, double Price, String details, int Quantity) {
            this.No = No;
            this.Name = Name;
            this.Price = Price;
            this.details = details;
            this.Quantity = Quantity;
        }
        
    }
    
    Node head = null;
    
    public void addAtFront(Node node)
    {
        node.next = head;
        head = node;
    }
    
    public void addAtEnd(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            
            temp.next = node;
        }
    }
    
    public void removeFront()
    {
        head = head.next;
    }
    
    
    
    
   public void print()
   {
       Node temp = head;
       while(temp!=null)
       {
           System.out.println("");
           temp = temp.next;
       }
       
   }
    
}
