package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 */
public class SinglyLinkedList1 {
    
    /**
     * Stores the first node in the list.
     */
    public ListNode head;
    
    public int length = 0;
    
    /**
     * Creates a new singly linked list from an existing array.
     * @param data  the array to create the new linked list from
     */
    public SinglyLinkedList1(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        // Populate list.
        for (int i = data.length - 1; i >= 0; i--) {
            head = new ListNode(data[i], head);
        }
    }
    
    /**
     * Creates a new, empty singly linked list.
     */
    public SinglyLinkedList1() {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        this(new int[] {});
    }
    
    
   /**
     * Adds an item at the front of the list.
     * @param value   the item to add
     */
    public void addFirst(int value){
        head = new ListNode(value, head);
        this.length++;
    }
     

    /**
     * Gets the item at the specified index in the list.
     * @param index the index
     * @return      the item, or -999 if not found
     */
    public int getAtPos(int index) {
        ListNode temHead = head;
        for (int i = length - 1; i >= 0; i--) {
            if(i == index) return temHead.data;
            
            temHead = temHead.next;
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
        ListNode temHead = head;
        for (int i = length - 1; i >= 0; i--) {
            if(i == 0 && temHead != null) return temHead.data;
            
            temHead = temHead.next;
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
        if(index == 1 && length == 0 ){
            this.head = new ListNode(obj, head);
            return true;
        }
        //we pop everything into an array
        // and insert the new data in between if index exist
        int[] Nodes = new int[length+1];
        ListNode current = this.head;
        int i = 0;
        int len = this.length;
        boolean foundInd = false;
        while(current != null) {
            if(len == index){
                Nodes[i] = obj;
                i += 1;
                foundInd = true;
            }
            Nodes[i] = current.data;
            current = current.next;
            
            len--;
            i++;
        }
        
        //if index found then we create a new list
        if(foundInd == true){
            SinglyLinkedList1 newList = new SinglyLinkedList1(Nodes);
            this.head = newList.head;
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
         /**
     * Appends a singly linked list to this circular linked list.
     * @param list  the singly linked list to append
     */
    public void appendSinglyLinkedList(SinglyLinkedList1 list) {
        // adding new list from the tail
        //using getLast from the list value would be costly
        //so we pop everything into array and re-add
        int[] data = new int[list.length-1];
        ListNode headN= list.head;
        for(int i= list.length-1; i >= 0; i--){
            data[i] = headN.data;
            headN = headN.next;
        }
        
        for(int i = 0; i <= data.length; i++ ){
            this.addFirst(data[i]);
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

