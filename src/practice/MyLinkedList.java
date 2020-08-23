package practice;

public class MyLinkedList {
    
	public class MyNode {
		
		public int val;
		public MyNode next;
		
		//constructor
		public MyNode(int val) {
			this.val = val;
		}
		
	}
	
    public MyNode head;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
    	
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int cur = 0;
        MyNode curNode = head;
        while (curNode != null) {
            if (cur == index) {
                return curNode.val;
            }
            curNode = curNode.next;
            cur++;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        MyNode curNode = head;
        if (curNode == null) {
            curNode = new MyNode(val);
        } else {
            MyNode temp = curNode;
            curNode = new MyNode(val);
            curNode.next = temp;
        }
        head = curNode;
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        MyNode newNode = new MyNode(val);
        MyNode curNode = head;
        if (curNode == null) {
            this.addAtHead(val);
        } else {
            MyNode prev = head;
            while (curNode != null) {
                prev = curNode;
                curNode = curNode.next;
            }
            prev.next = newNode;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        MyNode newNode = new MyNode(val);
        
        if (index == 0) {
            this.addAtHead(val);
            return;
        }
        
        int cur = 0;
        MyNode prev = head;
        MyNode curNode = head;
        while (curNode != null) {
            if (cur == index) {
                prev.next = newNode;
                newNode.next = curNode;
                return;
            }
            prev = curNode;
            curNode = curNode.next;
            cur++;
        }
        if (curNode == null && cur == index) {
            this.addAtTail(val);
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }
        
        MyNode prev = head;
        MyNode curNode = head;
        
        if (index == 0) {
        	head = head.next;
        	prev.next = null;
        }
        
        int cur = 0;
        while (curNode != null) {
            if (cur == index) {
                prev.next = curNode.next;
                curNode.next = null;
                return;
            }
            prev = curNode;
            curNode = curNode.next;
            cur++;
        }
    }
}
