//import java.io.*; 
  
//Java program to implement 
//a Singly Linked List 
public class linkedListPrac { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static linkedListPrac insert(linkedListPrac list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(linkedListPrac list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
        System.out.println();
    }

    //Print the first node
    public static void printFirst(linkedListPrac list) {
        Node currNode = list.head; 
        System.out.println("First Element in LinkedList: " + currNode.data); 
    }
    //Print the first node
    public static void printLast(linkedListPrac list) {
        Node currNode = list.head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        System.out.println("Last Element in LinkedList: " + currNode.data); 
    }
    //Print the mid node
    public static void printMid(linkedListPrac list) {
        Node currNode = list.head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        System.out.println("Last Element in LinkedList: " + currNode.data); 
    }
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        linkedListPrac list = new linkedListPrac(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
        printFirst(list);
        printLast(list);
    } 
} 