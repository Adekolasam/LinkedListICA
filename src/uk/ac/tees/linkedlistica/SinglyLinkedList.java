package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 */
public class SinglyLinkedList {
    
    /**
     * Stores the first node in the list.
     */
    public ListNode head;
    
    public int length = 0;
    
    /**
     * Creates a new singly linked list from an existing array.
     * @param data  the array to create the new linked list from
     */
    public SinglyLinkedList(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        // Populate list.
        for (int i = data.length - 1; i >= 0; i--) {
            head = new ListNode(data[i], head);
        }
    }
    
    /**
     * Creates a new, empty singly linked list.
     */
    public SinglyLinkedList() {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        this(new int[] {});
    }
    
    
   /**
     * Adds an item at the front of the list.
     * @param value   the item to add
     */
    public void addFirst(int value){
        head = new ListNode(value, head);
    }
     

    /**
     * Gets the item at the specified index in the list.
     * @param index the index
     * @return      the item, or -999 if not found
     */
    public int getAtPos(int index) {
        ListNode tempHead = head;
        for (int i = 0;  tempHead != null; i++) {
            if(i == index) return tempHead.data;
            
            tempHead = tempHead.next;
        }
        return -999;
    }
    
    
     /**
     * Count all nodes with the given value, returning the number of nodes.
     * @param obj   the value
     * @return      the number of nodes with value obj
     */
    public int countNodesWithValue(int obj) {  
        int i = 0;
        ListNode current = head;
        while(current != null){
            if(current.data == obj) i++;
            current = current.next;
        }
        return i;
    }
    
        /**
     * Gets the last item in the circular linked list, or -999 if not found.
     * @return  the last item, or -999 if empty
     */
    public int getLast() {  
        ListNode tempHead = head;
        for (int i = 0; tempHead != null; i++) {
            if(tempHead.next == null) return tempHead.data;
            
            tempHead = tempHead.next;
        }
        return -999;
    }
    
     /**
     * Adds a piece of data at the specified index.
     * @param obj   the data
     * @param index the index
     * @return      true on successful insert, otherwise false
     */
    public boolean addAtPos(int obj, int index) {
        if(index == 0){
            this.head = new ListNode(obj, head);
            return true;
        }
        //we pop everything into an array
        // and insert the new data in between if index exist
        int[] data = new int[index-1];
        ListNode current = this.head;
        int i = 0;
        while(current != null) {
            if((i+1) == index){
                ListNode newNode = new ListNode(obj, current.next);
                current.next = newNode;
                
                //loop back through the array
                for(int j = data.length-1; j>= 0; j-- ){
                    current = new ListNode(data[j], current);
                }
                this.head = current;
                return true;
            }
            data[i] = current.data;
            current = current.next;
            
            i++;
        }
        
        return false;
    }
    
    
    
         /**
     * Appends a singly linked list to this circular linked list.
     * @param list  the singly linked list to append
     */
    public void appendSinglyLinkedList(SinglyLinkedList list) {
        //add each element of list to head
        ListNode currentList= list.head;
        while(currentList != null){
            this.addFirst(currentList.data);
            currentList = currentList.next;
        }
    }
    
       /**
     * Returns the sum of all integers in the list.
     * @return  the sum
     */
    public int sum() {
        int sum = 0;
        ListNode tempHead = head;
        while (tempHead != null) {
            sum += tempHead.data;
            tempHead = tempHead.next;
        }
        return sum;
    }
    
}

