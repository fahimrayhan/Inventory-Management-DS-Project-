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
public class C_Queue {
    
    static class Node {
        
//      Customer Details
        
        String name;
        String email;
        int[] phone;
        String Address;
        
        
//      Order Details
        
        String order_details;
        int quantity;
        double price;
        Node next;

        public Node(String name, String email, int[] phone, String Address, String order_details, int quantity, double price) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.Address = Address;
            this.order_details = order_details;
            this.quantity = quantity;
            this.price = price;
        }    
        
    }
    
    private Node first = null;
    private Node last = null;

    public void enqueue(Node node) {
        if(last == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
    
    public void dequeue() {
        first = first.next;
        if(first == null)
            last = null;
    }

    public void print() {
        Node node = first;
        while(node != null) {
            System.out.print(" ");
            node = node.next;
        }
    }
        
}
