package SelfPractise;

import java.util.ArrayList;
import java.util.HashSet;

// On compiling process, use this command:

// javac -d . [FileName.java] ==> javac -d . LinkedListP.java 
// To run the class, please use this command:

// java [Package].[ClassName] ==> java SelfPractise.LinkedListP 

// >>>>>>>>>>>>>>>>    REMEMBER    <<<<<<<<<<<<<<<<<
//don't change the head variale




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
            LinkedListP list2 = new LinkedListP();
            insert(list,1);
            insert(list,2);
            insert(list,3);
            insert(list,4);
            insert(list,5);
            insert(list,6);

            insert(list1,1);
            insert(list1,2);
            insert(list1,5);

            insert(list2,6);
            insert(list2,7);

            //display(list);
            // display(list1);
            // display(list2);
            // ArrayList <LinkedListP> aList = new ArrayList<LinkedListP>();
            // aList.add(list);
            // aList.add(list1);
            // aList.add(list2);
            // displayFirst(list);
            // displayFirst(list1);
            // displayLast(list);
            // displayLast(list1);
            // displayMid(list);
            // displayMid(list1);
            //removeFirst(list);
            //removeLast(list);
            //removeAtK(list, 2);
            //reverseLinkedList(list);
            //isPalindrome(list);
            //addAtFirst(list,7);
            //addAtLast(list,7);
            //addAtK(list,4,9);
            //detectLoop(list);
            // if (detectLoop(list)) {
            //     System.out.println("Detected a Loop");
            // } else System.out.println("No Loop Detected");

            // if (searchElement(list, 21)) {
            //     System.out.println("Element Found");
            // } else System.out.println("Element Not Found");

            //System.out.println(countOccurrence(list,1));

            //mergeSortedList(list, list1);
            //intersectionSortedList(list, list1);
            //mergeKsortedLists(aList);
            //removeKthFromLast(list, 3);
            //rearrangeList(list);
            Node n = list.head;
            displayUsingNode(recursiveReverse(n));

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

// >>>>>>>>>>>>>>>>>>>>> Addition In LinkedList <<<<<<<<<<<<<<<<<<<
        public static void addAtFirst(LinkedListP list, int data) {
            Node newNode = new Node(data);
            newNode.next = null;

            if (list.head == null) {
                list.head = newNode;
            } else {
                Node temp = list.head;
                list.head = newNode;
                newNode.next = temp;
            }
            display(list);
        }

        public static void addAtLast(LinkedListP list, int data) {
            Node newNode = new Node(data);
            newNode.next = null;

            if (list.head == null) {
                list.head = newNode;
            } else {
                Node temp = list.head;
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            display(list);
        }

        public static void addAtK(LinkedListP list, int pos, int data) {
            Node newNode = new Node(data);
            newNode.next = null;

            if (list.head == null) {
                list.head = newNode;
            } else {
                int count = 0;
                Node current = list.head;
                while(count < pos - 1) {
                    current = current.next;
                    count++;
                }
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
                display(list);
            }
        }

// >>>>>>>>>>>>>>>>>>>>> Display In LinkedList <<<<<<<<<<<<<<<<<<<
        public static void display(LinkedListP list) {
            Node temp = list.head;
            System.out.print("LinkedList: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void displayUsingNode(Node node) {
            Node temp = node;
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

// >>>>>>>>>>>>>>>>>>>>> Deletion In LinkedList <<<<<<<<<<<<<<<<<<<
        public static void removeFirst(LinkedListP list) {
            if (list.head == null) {
                System.out.println("This LinkedList is empty.");
            } else {
                Node temp = list.head.next;
                //list.head = null;
                list.head = temp;
                display(list);
            }
        }
        public static void removeLast(LinkedListP list) {
            if (list.head == null) {
                System.out.println("This LinkedList is empty.");
            } else {
                Node temp = list.head;
                while(temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
                display(list);
            }
        }
        public static void removeAtK(LinkedListP list, int pos) {
            if (list.head == null) {
                System.out.println("This LinkedList is empty.");
            } else {
                Node current = list.head;
                int count = 0;
                Node temp;
                while(count < pos - 1) {
                    current = current.next;
                    System.out.println("Current Node: " + current.data);
                    count++;
                }
                temp = current.next.next;
                current.next = temp;
                display(list);
            }
        }
            //  frw    null    2   3   4   5   6   null
            // prev    null    1   2   3   4   5   6
            // curr    1       2   3   4   5   6   null

// >>>>>>>>>>>>>>>>>>>>> Reverse In LinkedList <<<<<<<<<<<<<<<<<<<
            //recursive approach : https://www.digitalocean.com/community/tutorials/reverse-a-linked-list
        public static void reverseLinkedList(LinkedListP list) {
            if (list.head == null) {
                System.out.println("This LinkedList is empty.");
            } else {
                Node prev = null;
                Node current = list.head;
                Node frw = null;
                while(current != null) {
                    frw = current.next;
                    current.next = prev;
                    prev = current;
                    current = frw;
                }
                list.head = prev;
                display(list);
            }
        }
        public static Node recursiveReverse(Node node) {
            Node first;
            if (node==null || node.next == null)
                return node;

	        first = recursiveReverse(node.next);
	        node.next.next = node;
	        node.next = null;

	        return first;
        }

        
// >>>>>>>>>>>>>>>>>>>>> isPalindrome In LinkedList <<<<<<<<<<<<<<<<<<<
        public static void isPalindrome(LinkedListP list) {
            if (list.head == null) {
                System.out.println("This LinkedList is empty.");
            } else {
                Boolean isPalindromeRes = true;
                //Get the middle of the linked list. 
                Node mid = findMid(list);
                //Reverse the second half of the linked list. Return head of reversed list
                Node RevHead = findRevHead(mid);
                System.out.println("RevHead: "+ RevHead);
                //Check if the first half and second half are identical. 
                Node temp = list.head;
                while(temp != null && RevHead != null) {
                    if (temp.data != RevHead.data) {
                        isPalindromeRes = false;
                    }
                    temp=temp.next;
                    RevHead = RevHead.next;
                }
                System.out.println(isPalindromeRes);
            }
        }
        //find mid node using slow and fast pointer
        public static Node findMid(LinkedListP list) {
            Node slow = list.head;
            Node fast = list.head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        //Finding and returning head node after reversal
        public static Node findRevHead(Node node) {
            Node prev = null;
            Node current = node;
            Node frw = null;
            while(current != null) {
                frw = current.next;
                current.next = prev;
                prev = current;
                current = frw;
            }
            return prev;
        }

// >>>>>>>>>>>>>>>>>>>>> Loop In LinkedList <<<<<<<<<<<<<<<<<<<
        //Detect loop or cycle in a linked list

        // Follow the steps below to solve the problem:
        //     Traverse the list individually and keep putting the node addresses in a Hash Table. 
        //     At any point, if NULL is reached then return false 
        //     If the next of the current nodes points to any of the previously stored nodes in  Hash then return true.
        public static boolean detectLoop(LinkedListP list) {
            LinkedListP l_list = createLoop(list);
            HashSet<Node> s = new HashSet<>();
            Node temp = l_list.head;
            while(temp != null) {
                if (s.contains(temp)) {
                    return true;
                }
                s.add(temp);
                temp = temp.next;
            }
            return false;
        }

        public static LinkedListP createLoop(LinkedListP list) {
            Node temp = list.head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = list.head.next;
            return list;
        }

// >>>>>>>>>>>>>>>>>>>>> Searching In LinkedList <<<<<<<<<<<<<<<<<<<

    //Search an element in a Linked List
        public static boolean searchElement(LinkedListP list, int data) {
            Node temp = list.head;
            boolean found = false;
            while(temp !=null) {
                if (temp.data == data) return true;
                temp = temp.next;
            }
            return found;
        }
    //Write a function that counts the number of times a given int occurs in a Linked List
        public static int countOccurrence(LinkedListP list, int data) {
            Node temp = list.head;
            int count = 0;
            while(temp !=null) {
                if (temp.data == data) {
                    count++;
                }
                temp = temp.next;
            }
            return count;
        }

// >>>>>>>>>>>>>>>>>>>>> Operation on two LinkedList <<<<<<<<<<<<<<<<<<<

        public static LinkedListP mergeSortedList(LinkedListP list1 , LinkedListP list2) {
            System.out.println("List 1:");
            display(list1);
            System.out.println("List 2:");
            display(list2);
            Node temp1 = list1.head;
            Node temp2 = list2.head;
            LinkedListP list = new LinkedListP();

            while(temp1 !=null || temp2 !=null) {
                if(temp1 != null && temp2 != null) {
                    if (temp1.data < temp2.data) {
                        insert(list, temp1.data);
                        temp1 = temp1.next;
                    }
                    if (temp2.data < temp1.data) {
                        insert(list, temp2.data);
                        temp2 = temp2.next;
                    }
                    if (temp1.data == temp2.data) {
                        insert(list, temp1.data);
                        temp1 = temp1.next;
                        insert(list, temp2.data);
                        temp2 = temp2.next;
                    }
                } else if (temp1 != null && temp2 == null) {
                    insert(list, temp1.data);
                    temp1 = temp1.next;
                } else if (temp2 != null && temp1 == null) {
                    insert(list, temp2.data);
                    temp2 = temp2.next;
                }
            }
            return list;
        }

        //Intersection of two Sorted Linked Lists
        public static void intersectionSortedList(LinkedListP list1 , LinkedListP list2) {
            Node temp1 = list1.head;
            Node temp2 = list2.head;
            LinkedListP list = new LinkedListP();
            while(temp1 !=null && temp2 !=null) {
                if(temp1.data == temp2.data) {
                    insert(list,temp1.data);
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            display(list);
        }

        //merge k sorted linkedList
        public static void mergeKsortedLists(ArrayList<LinkedListP> alist) {
            System.out.println(alist.size());
            int i = 0;
            LinkedListP list = new LinkedListP();
            
            while(i<alist.size()){
                if(list.head !=null) {
                    list = mergeSortedList(list, (alist.get(i)));
                    i++;
                } else {
                    list = mergeSortedList((alist.get(i)), (alist.get(i+1)));
                    i=i+2;
                }
                System.out.println("MergedList : ");
                display(list);
            }
            System.out.println("FinalList : ");
            display(list);
        }

//    >>>>>>>>>>>>>>>>>>        <<<<<<<<<<<<<<<<<<<<<<
        //Remove nth node from end of the list

        //Follow the given steps to solve the problem:
        // Maintain two pointers main_ptr and ref_ptr
        // Move ref_ptr to the Nth node from the start
        // Now move both main_ptr and ref_ptr, until the ref_ptr reaches the last node
        // Now print the data of the main_ptr, as it is at the Nth node from the end
        public static void removeKthFromLast(LinkedListP list, int pos) {
            // Maintain two pointers main_ptr and ref_ptr
            Node main_ptr = list.head;
            Node ref_ptr = list.head;
            Node temp;

            // Move ref_ptr to the Nth node from the start
            int count = 0;
            while(count < pos -1) {
                ref_ptr = ref_ptr.next;
                count++;
            }

            // Now move both main_ptr and ref_ptr, until the ref_ptr reaches the last node
            while(ref_ptr.next.next != null) {
                main_ptr = main_ptr.next;
                ref_ptr = ref_ptr.next;
            }
            temp = main_ptr.next.next;
            main_ptr.next = temp;
            display(list);
        }
//    >>>>>>>>>>>>>>>>>>        <<<<<<<<<<<<<<<<<<<<<<
        //Rearrange a given linked list in-place.

        public static void rearrangeList(LinkedListP list) {
            Node mid = findMid(list);
            Node revHead = findRevHead(mid);
            while(revHead != null) {
                System.out.print(revHead.data + " ");
                revHead = revHead.next;
            }
            //System.out.println("RevHead: "+ revHead.next.data);
            // Node p1 = list.head;
            // //1->2->3->4->5->6
            // //revHead = 6->5->4
            // while(revHead != null) {
            //     Node next1 = p1.next;
            //     Node next2 = revHead.next;
            //     p1.next = revHead;
            //     revHead.next = next1;
            //     p1 = next1;
            //     revHead = next2;
            // }
            // display(list);
        }
}
