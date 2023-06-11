package SelfPractise;

// On compiling process, use this command:

// javac -d . [FileName.java]
// To run the class, please use this command:

// java [Package].[ClassName]

public class LinkedListP {
    //Given a Linked List, the task is to insert a new node in this given Linked List at the following positions: 

        // At the front of the linked list  
        // After a given node. 
        // At the end of the linked list.
        Node head;
        static class Node {
            int data;
            Node next;

            Node(int d) {
                this.data = d;
                this.next = null;
            }
        }

        public static void main(String[] args) {
            LinkedListP list = new LinkedListP();
            LinkedListP list1 = new LinkedListP();
            insert(list,1);
            insert(list,2);
            insert(list,3);
            insert(list,4);
            insert(list,5);
            insert(list,6);
            display(list);
            displayFirst(list);
            displayFirst(list1);
            displayLast(list);
            displayLast(list1);
            displayMid(list);
            displayMid(list1);

        }

        public static LinkedListP insert(LinkedListP list, int data) {
            // Create a new node with given data 
            Node new_node = new Node(data);
            new_node.next = null;

            // If the Linked List is empty, 
            // then make the new node as head
            if (list.head == null) {
                list.head = new_node;
            } else {
                // Else traverse till the last node 
                // and insert the new_node there
                Node temp = list.head;
                while(temp.next != null) {
                    temp = temp.next;
                } 
                temp.next = new_node;
            }

            return list;
        }

        public static void display(LinkedListP list) {
            Node temp = list.head;
            System.out.print("LinkedList: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void displayFirst(LinkedListP list) {
            if (list.head == null) {
                System.out.println("This LinkedList is empty.");
            } else {
                System.out.println("LinkedList First Element: " + list.head.data);
            }
        }

        public static void displayLast(LinkedListP list) {
            if (list.head == null) {
                System.out.println("This LinkedList is empty.");
            } else {
                Node last = list.head;
                while(last.next != null) {
                    last = last.next;
                }
                System.out.println("LinkedList Last Element: " + last.data);
            }
        }

        public static int getSize(LinkedListP list) {
            int count = 0;
            if (list.head == null) {
                return count;
            } else {
                Node curr = list.head;
                while(curr != null) {
                    count++;
                    curr = curr.next;
                }
                return count;
            }
        }

        //Time and space complexity analysis . Suppose the length of the linked list is n. So the time complexity = Time complexity of finding the node count + Time complexity of finding the middle node = O(n) + O(n) = O(n) . Space complexity = O(1), as we are using constant extra space.
        // https://www.enjoyalgorithms.com/blog/find-middle-of-linked-list/
        public static void displayMid(LinkedListP list) {
            if (list.head == null) {
                System.out.println("This LinkedList is empty.");
            } else {
                int size = getSize(list);
                Node temp = list.head;
                int count = 0;
                while(count < size/2) {
                    temp = temp.next;
                    count++;
                }
                System.out.println("LinkedList Middle Element: " +  temp.data);

            }
        }

}
