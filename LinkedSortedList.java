import java.util.Scanner;

public class LinkedSortedList {
        class Node {
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node head = null;
        Node tail = null;

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void sort() {
            Node current = head, next = null;
            int temp;
            if (head == null) {
                return;
            } else {
                while (current != null) {
                    next = current.next;

                    while (next != null) {
                        if (current.data > next.data) {
                            temp = current.data;
                            current.data = next.data;
                            next.data = temp;
                        }

                        next = next.next;
                    }
                    current = current.next;
                }
            }
        }
        public void display() {
            Node current = head;

            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            LinkedSortedList list=new LinkedSortedList();
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=input.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(input.nextInt());
            }
                list.sort();
                list.display();

        }
    }

