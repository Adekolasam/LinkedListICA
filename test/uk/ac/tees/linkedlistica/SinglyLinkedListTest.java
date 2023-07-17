package uk.ac.tees.linkedlistica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A suite of unit tests for the {@link SinglyLinkedList} class.
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 */
public class SinglyLinkedListTest {
    
    public SinglyLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
        
    /**
     * Converts a singly linked list to an array.
     * 
     * @param list  the list to convert
     * @return      the converted list
     */
    private static int[] singlyLinkedListToArray(SinglyLinkedList list) {
        // Gauge size.
        int n = 0;
        ListNode c = list.head;
        while (c != null) {
            n++;
            c = c.next;
        }
        // Copy to int array.
        int[] arr = new int[n];
        c = list.head;
        int i = 0;
        while (c != null) {
            arr[i++] = c.data;
            c = c.next;
        }
        return arr; // Return result.
    }
    
    
   /**
     * Test of addFirst method, of class SinglyLinkedList.
     */
//    @Test
//    public void testAddFirst() {
//        // Create instance, insert 3 and 6 at first position.
//        SinglyLinkedList instance = new SinglyLinkedList(new int[] {2, 4, 6});
//        instance.addFirst(3);
//        instance.addFirst(6);
//        // Compare to expected.
//        assertArrayEquals("Items should be correctly added.", 
//                new int[] {6, 3, 2, 4, 6}, singlyLinkedListToArray(instance));
//    }
    
 
    /**
     * Test of getAtPos method, of class SinglyLinkedList.
     */
//    @Test
//    public void testGetAtPos() {
//        // Create instance.
//        SinglyLinkedList instance = new SinglyLinkedList(new int[] {5, 8, 9});
//        // Compare to expected.
//        assertEquals("Correct item should be retrieved from index 0.", 5, 
//                instance.getAtPos(0));
//        assertEquals("Correct item should be retrieved from index 2.", 9, 
//                instance.getAtPos(2));
//    }
    
    /**
     * Test of countNodesWithValue method
     */
//    @Test
//    public void testCountNodesWithValue() {
//        // Create instance, insert 3 and 6 after first and second index.
//        SinglyLinkedList instance = new SinglyLinkedList(
//                new int[] {2, 4, 6, 4, 10, 4, 8, 4});
//        // Compare to expected.
//        assertEquals("Items should be correctly counted.", 
//                4, instance.countNodesWithValue(4));
//    }
    
     /**
     * Test of getLast method
     */
//    @Test
//    public void testGetLast() {
//        // Create instance.
//        SinglyLinkedList instance = new SinglyLinkedList(new int[] {7, 3, 6});
//        // Compare to expected.
//        assertEquals("Last item should be retrieved.", 6, instance.getLast());
//    }
    
     /**
     * Test of addAtPos method
     */
//    @Test
//    public void testAddAtPos() {
//        // Create instance, insert 3 and 6 at first and second index.
//        SinglyLinkedList instance = new SinglyLinkedList(
//                new int[] {2, 4, 6});
//        boolean success = instance.addAtPos(3, 1) && instance.addAtPos(6, 2);
//        assertTrue("True should return on successful insert.", success);
//        boolean failure = instance.addAtPos(3, 99);
//        assertFalse("False should return on failed insert.", failure);
//        // Compare to expected.
//        assertArrayEquals("Items should be correctly added.", 
//                new int[] {2, 3, 6, 4, 6}, singlyLinkedListToArray(instance));
//    }
    

    
}
    
    
    
    
    
    
    
