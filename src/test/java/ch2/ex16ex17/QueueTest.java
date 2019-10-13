package ch2.ex16ex17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QueueTest {

    String str1 = "First string";
    String str2 = "Second string";
    String str3 = "Third string";


    @Test
    void addNodeTest() {
        Queue queue = new Queue();
        assertTrue(queue.getNodes().isEmpty());
        queue.addNode(str1);
        queue.addNode(str2);
        assertEquals(str1, queue.toString(0));
        assertEquals(str2, queue.toString(1));
    }

    @Test
    void removeNodeTest(){
        Queue queue = new Queue();
        queue.addNode(str1);
        queue.addNode(str2);
        queue.addNode(str3);
        assertEquals(str3, queue.toString(2));
        assertEquals( 3, queue.getNodes().size());
        queue.removeTopNode();
        assertEquals( 2, queue.getNodes().size());
        assertEquals(str2, queue.toString(0));
        assertEquals(str3, queue.toString(1));
    }


}
