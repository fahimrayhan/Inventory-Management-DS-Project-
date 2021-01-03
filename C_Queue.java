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
        String phone;
        String Address;
        
        
//      Order Details
        
        int Item;
        String p_name;
        double price;
        Node next;

        public Node(String name, String email, String phone, String Address, C_LinkedList.Node node) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.Address = Address;
            this.Item = node.No;
            this.p_name = node.Name;
            this.price = node.Price;
        }

//        @Override
//        public String toString() {
//            return "Node{" + "Name=" + name + ", Email=" + email + ", Phone=" + phone + ", Address=" + Address + ",\n Item No=" + Item + ", Product Name=" + p_name + ", Price=" + price + '}';
//        }
        
        
        
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
