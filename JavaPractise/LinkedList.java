//import java.util.HashSet;

public class LinkedList {
    Node head;
    static class Node
    {
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
        
    }
    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        //LinkedList list2 = new LinkedList();
 
        // Creating first linked list
        list1.head = new Node(1);
        list1.head.next = new Node(2);
        list1.head.next.next = new Node(3);
        list1.head.next.next.next = new Node(4);
        list1.head.next.next.next.next = new Node(5);
        list1.head.next.next.next.next.next = new Node(6);
 
        // Creating second linked list
        // list2.head = new Node(5);
        // list2.head.next = new Node(6);
        // list2.head.next.next = new Node(1);
        // list2.head.next.next.next = list1.head.next.next;
        // //findIntersectionNode(list.head1, list.head2);

        // displayUsingNode(list1.head);
        // displayUsingNode(list2.head);
        //System.out.println("Intersecting Node: " + findIntersectionNode(list1.head, list2.head).data);

        // displayUsingNode(list1.head);
        // findMid(list1.head);
        // FindHeadOfRev(list1.head);

        //rearrangeZigZag(list1.head);
        
        removeTargetNode(list1.head, 4);

        
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
    

    public static int getSize(Node node) {
        int count = 0;
        if (node == null) {
            return count;
        } else {
            Node curr = node;
            while(curr != null) {
                count++;
                curr = curr.next;
            }
            return count;
        }
    }



    public static Node findIntersectionNode(Node h1, Node h2) {
        //brute force approach using 2 loops

        //Time Complexity:O(N * M), where N and M is the size of the linked lists
        //Space Complexity:O(1), as no extra space is used.

        // while(h1 != null) {
        //     Node temp = h2;
        //     while(temp != null) {
        //         if(h1 == temp) return h1;
        //         temp = temp.next;
        //     }
        //     h1 = h1.next;
        // }
        // return null;

        //approach using hashmap

        //Time Complexity:O(N + M), where N and M is the size of the linked list
        //Space Complexity:O(M), since the nodes of list B are stored.

        // HashSet<Node> map = new HashSet<>();
        // while(h1 != null) {
        //     map.add(h1);
        //     h1=h1.next;
        // }
        // while(h2 !=null) {
        //     if(map.contains(h2)) return h2;
        //     h2 = h2.next;
        // }
        // return null;

        //two pointers approach
        //Time Complexity:O(N + M), where N and M is the size of the linked list
        //Space Complexity:O(1), since the nodes of list B are stored.
        Node pA = h1;
        Node pB = h2;
        while(pA != pB) {
            pA = (pA == null) ? h2 : pA.next;
            pB = (pB == null) ? h1 : pB.next;
        }
        System.out.println(h1);
        return pA;
        
    }

    public static Node findMid(Node node) {
        Node slow = node;
        Node fast = node;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        return slow;
    }

    public static Node FindHeadOfRev(Node node) {
        Node prev = null;
        Node current = node;
        Node frw = null;

        while(current != null) {
            frw = current.next;
            current.next = prev;
            prev = current;
            current = frw;
        }
        displayUsingNode(prev);
        return prev;
    }

    //Q) 1->2->3->4->5 ===== 1->5->2->4->3
    public static void rearrangeZigZag(Node node) {
        Node midNode = findMid(node);
        Node revHead = FindHeadOfRev(midNode);
        Node tp = node;
        while(revHead.next != null) {
            Node temp1 = tp.next; //2
            Node temp2 = revHead.next;
            tp.next = revHead; //1->5
            revHead.next = temp1;
            tp = temp1;
            revHead = temp2;
        }
        displayUsingNode(node);
    }
    //Q) Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
    public static void removeTargetNode(Node node, int k) {
        Node curr = node;
        Node prev = null;
        while(curr != null) {
            if(curr.data == k) {
                if (prev == null) { //when head node.val == val, we set curr = next
                    curr = curr.next;
                } else { //else we prev node'next will be current's next
                    prev.next = curr.next;
                }
            } else prev = curr; // if no match found we set prev as curr and move curr to next after both the conditions check 
            curr = curr.next;
        }
        displayUsingNode(node);
    }
}
