package ch2.ex16ex17;

import ch3.ex6.Sequence;

import java.util.LinkedList;

/**
 * Implement a class Queue, an unbounded queue of strings. Provide methods
 * add, adding at the tail, and remove, removing at the head of the queue.
 * Store elements as a linked list of nodes. Make Node a nested class. Should
 * it be static or not?
 * //**
 * Provide an iterator — an object that yields the elements of the queue in
 * turn — for the queue of the preceding class. Make Iterator a nested class
 * with methods next and hasNext. Provide a method iterator() of the Queue
 * class that yields a Queue.Iterator. Should Iterator be static or not?
 */

public class Queue {

    private LinkedList<Node> nodes;

    Queue() {
        nodes = new LinkedList<>();
    }

    public static class Node {
        String string;

        Node(String string) {
            this.string = string;
        }

        @Override
        public String toString() {
            return string;
        }
    }

    //todo tests
    public static class Iterator implements Sequence<Node> {

        private Node head;

        private Iterator() {
        }

        @Override
        public Node next() {
            return head;
        }

        public boolean hasNext() {
            return head != null;
        }
    }


    void addNode(String string){
        Node newNode = new Node(string);
        nodes.addLast(newNode);
    }

    void addNode(Node node){
        nodes.addLast(node);
    }

    void removeTopNode(){
        nodes.removeFirst();
    }

    LinkedList<Node> getNodes() {
        return nodes;
    }

    String toString(int nodeIndex) {
        return nodes.get(nodeIndex).toString();
    }
}
