package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 * @author Annalisa Occhipinti (a.occhipinti@tees.ac.uk)
 */
public class DoublyLinkedList {
    
    /**
     * Stores the first node in the list.
     */
    public DoublyLinkedListNode head;
      
    /**
     * Creates a new doubly linked list from an existing array.
     * @param data  the array to create the new linked list from
     */
    public DoublyLinkedList(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
           
        for (int i = data.length - 1; i >= 0; i--) {
            DoublyLinkedListNode n = new DoublyLinkedListNode(data[i], head, 
                    null);
            if (head != null) {
                head.prev = n;
            }
            head = n;
        }
    }
    
    
    /**
     * Gets the length of the doubly linked list.
     * @return  the length
     */
    public int getSize() {
        int size = 0;
        DoublyLinkedListNode node = head;
        while(node != null ){
            size++;
            node = node.next;
        }
        
        return size;
    }
    
    /**
     * Gets the last item in the doubly linked list, or -999 if not found.
     * @return  the last item, or -999 if empty
     */
    public int getLast() {
        DoublyLinkedListNode current = head;
        while(current != null ){
            if(current.next == null){
                return current.data;
            }
            current = current.next;
        }
        
        return -999;
    }
    
    /**
     * Deletes all nodes with the given value, returning the number of nodes
     * deleted.
     * @param obj   the value
     * @return      the number of nodes deleted
     */
    public int deleteAllNodesWithValue(int obj) {
        DoublyLinkedListNode[] nodes = new DoublyLinkedListNode[this.getSize()];
        DoublyLinkedListNode current = head;
        int numberOfNodes = 0;
        int i = 0;
        //delete nodes with value
        while(current != null){
            if(current.data != obj){
                nodes[i] = current;
            }
            else numberOfNodes++;
            current = current.next;
            i++;
        }
        
        if(numberOfNodes > 0){
            for (int j = i - 1; j >= 0; j--) {
                if(nodes[j] != null){
                    DoublyLinkedListNode n = new DoublyLinkedListNode(nodes[j].data, current, null);
                    if (current != null) {
                        current.prev = n;
                    }
                    current = n;
                }
            }
            head = current;
        } 
        
        return numberOfNodes;
    }
    
    /**
     * Deletes the node in the list at the specified index.
     * @param index the index
     * @return      true if successful, otherwise false
     */
    public boolean deleteAtPos(int index) {
        if(index == 0){
            head = head.next;
            head.prev = null;
            return true;
        }
        
        int[] data = new int[this.getSize()-1];
        DoublyLinkedListNode current = head;
        
        int i = 0;
        while(current != null) {
            if((i+1) == index){
                //we found index, replace pointer
                // traverse back
                DoublyLinkedListNode newNode = current.next;
                current.next = newNode.next;
                if(current.next != null) current.next.prev = current;
                
                for (int j = i-1; j >= 0; j--) {
                    DoublyLinkedListNode n = new DoublyLinkedListNode(data[j], current, null);
                    if (current != null) {
                        current.prev = n;
                    }
                    current = n;
                }
                head = current;
                return true;
            }
            data[i] = current.data;
            current = current.next;
            i++;
        }
        
        //if no position found
        return false;
    }
    
     /**
     * Count the number of even nodes in the list.
     * @return number of even nodes
     */
    public int evenNodes(){  
        int nodes = 0;
        DoublyLinkedListNode current = head;
        for( int i = 0; current != null; i++){
            if(current.data % 2 == 0) nodes++;
            current = current.next;
        }
            
         return nodes;
    }
    
      /**
     * Delete second node in the list
     * @return true if successful, false if there is no second node in the list
     */
    public boolean deleteSecond(){     
        if(head != null && head.next != null){
            DoublyLinkedListNode node = head.next;
            head.next = node.next;
            head.next.prev = head;
            return true;
        }
        return false;
    }
    
    
    
    /**
     * Adds an item to the end of the list.
     * @param obj   the item
     * @return 
     */
    public boolean addSecondLast(int obj) {   
        if(head == null){
            DoublyLinkedListNode n = new DoublyLinkedListNode(obj, head, 
                    null);
            head = n;
            return true;
        }
        if(head.next == null){
            DoublyLinkedListNode n = new DoublyLinkedListNode(obj, head, 
                    null);
            if (head != null) {
                head.prev = n;
            }
            head = n;
            return true;
        }
        
        int[] data = new int[this.getSize()-1];
        DoublyLinkedListNode current = head;
        
        int i = 0;
        while(current != null) {
            if(current.next == null){
                //we found index, replace pointer
                // roll back
                DoublyLinkedListNode n = new DoublyLinkedListNode(obj, current, 
                    null);
                current.prev = n;
                current = n;
                
                for (int j = i-1; j >= 0; j--) {
                    n = new DoublyLinkedListNode(data[j], current, null);
                    current.prev = n;
                    current = n;
                }
                head = current;
                return true;
            }
            data[i] = current.data;
            current = current.next;
            i++;
        }
        
        //if no position found
        return false;
    }
    
}
