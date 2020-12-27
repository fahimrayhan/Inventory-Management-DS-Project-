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
    
    static class Node {
        int value;
        Node next;
    
        public Node(int value) {
            this.value = value;
        }
    }

    private Node first = null;

    public void push(Node node) {
        node.next = first;
        first = node;
    }

    public void pop() {
        first = first.next;
    }
    
  public void print() {
      Node node = first;
    while(node != null) {
        System.out.println("|"+node.value+"|");
        node = node.next;
    }
  }

}