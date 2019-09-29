package ch2.ex16;

import java.util.LinkedList;

public class Queue {

    /**
     * Add element to the tail of the Queue
     */
    void addNode(String string){
        Node newNode = new Node(string);
        nodes.addLast(newNode);
    }

    /**
     * Delete element from the top of the Queue
     */
    void  removeNode(){
        nodes.removeFirst();
    }

    public static class Node{
        String string;

        Node(String string){
            this.string = string;
        }

        @Override
        public String toString() {
            return string;
        }
    }

    Queue(){
        nodes = new LinkedList<>();
    }

    private LinkedList<Node> nodes;

    public LinkedList<Node> getNodes() {
        return nodes;
    }

    public String toString(int nodeIndex) {
        return nodes.get(nodeIndex).toString();
    }
}
