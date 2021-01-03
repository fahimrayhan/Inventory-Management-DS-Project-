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
public class Pull_Stack {
    
    int count = 0;
    
    static class Node {
        
        C_LinkedList.Node list2;
        Node next;

        public Node(C_LinkedList.Node list2) {
            this.list2 = list2;
        }

    }

    private Node first = null;

    public void push(Node node) {
        node.next = first;
        first = node;
        count++;
    }

    public Node pop() {
        Node temp;
        temp = first;
        first = first.next;
        return temp;
    }
    
  public void print() {
      
      Node temp = first;
      System.out.println("\t/// Last Sold Item ///");
      temp = pop();
      System.out.println("Item No: "+temp.list2.No+", Item Name: "+temp.list2.Name+", Price: "+temp.list2.Price+", Category: "+temp.list2.Category);
       
      
      System.out.println("\t/// Monthly Report ///\n");
      System.out.println("Total Item Sold: "+count);
      
      int sum = (int) temp.list2.Price;
      
      while(temp != null) {
        
            
            temp = pop();
            sum += temp.list2.Price;
            System.out.println("Item No: "+temp.list2.No+", Item Name: "+temp.list2.Name+", Price: "+temp.list2.Price+", Category: "+temp.list2.Category);
            temp = temp.next;
    }
      
      System.out.println("\t /// Gross Sale ///\n");
      System.out.println("Gross Sale: "+sum);
  }

}