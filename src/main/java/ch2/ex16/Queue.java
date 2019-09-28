package ch2.ex16;

import java.util.ArrayList;

public class Queue {

    /**
     * Add element to the tail of the Queue
     */
    void addNode(String string){
        Node newNode = new Node(string);
        nodes.add(newNode);
    }

    /**
     * Delete element from the top of the Queue
     */
    void  removeNode(){
        nodes.remove(0);
    }

    public static class Node{
        private String string;

        Node(String string){
            this.string = string;
        }

        @Override
        public String toString() {
            return string;
        }
    }

    private  ArrayList<Node> nodes = new ArrayList<>();

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public String toString(int nodeIndex) {
        return nodes.get(nodeIndex).toString();
    }
}
