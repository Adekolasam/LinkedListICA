package uk.ac.tees.linkedlistica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A suite of unit tests for the {@link CircularLinkedList} class.
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 */
public class CircularLinkedListTest {
    
    public CircularLinkedListTest() {
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
     * Converts a circular linked list to an array.
     * 
     * @param list  the list to convert
     * @return      the converted list
     */
    private static int[] circularLinkedListToArray(CircularLinkedList list) {
        // Gauge size.
        int n = 0;
        ListNode c = list.head.next;
        while (c != list.head) {
            n++;
            c = c.next;
        }
        // Copy to int array.
        int[] arr = new int[n];
        c = list.head.next;
        int i = 0;
        while (c != list.head) {
            arr[i++] = c.data;
            c = c.next;
        }
        return arr; // Return result.
    }
    
    /**
     * Test of isEmpty method, of class CircularLinkedList.
     */
//    @Test
//    public void testIsEmpty() {
//        // Create instance.
//        CircularLinkedList instance = new CircularLinkedList(
//                new int[] {2, 4, 6, 7, 8});
//        boolean empty = new CircularLinkedList(new int[] {}).isEmpty();
//        assertTrue("True should return for empty lists.", empty);
//        boolean notEmpty = instance.isEmpty();
//        assertFalse("False should return for non-empty lists.", notEmpty);
//    }

    /**
     * Test of toString method, of class CircularLinkedList.
     */
//    @Test
//    public void testToString() {
//        // Create instance.
//        CircularLinkedList instance = new CircularLinkedList(
//                new int[] {3, 7, 9, 13, 12});
//        assertEquals("List should be correctly turned into a string.", 
//                "{3, 7, 9, 13, 12}", instance.toString());
//    }
    
    
    /**
     * Test of countNodesWithValue method
     */
//    @Test
//    public void testCountNodesWithValue() {
//        // Create instance, insert 3 and 6 after first and second index.
//        CircularLinkedList instance = new CircularLinkedList(
//                new int[] {2, 4, 6, 4, 10, 4, 8, 4});
//        // Compare to expected.
//        assertEquals("Items should be correctly counted.", 
//                4, instance.countNodesWithValue(4));
//    }
    
    
    /**
     * Test of searchIndex method
     */
//    @Test
//    public void testsearchIndex() {
//        // Create instance, insert 3 and 6 after first and second index.
//        CircularLinkedList instance = new CircularLinkedList(
//                new int[] {2, 4, 6, 3, 10});
//        // Compare to expected.
//        assertEquals("Index should be correctly returned.", 
//                1, instance.searchIndex(4));
//    }
    
   
    
}