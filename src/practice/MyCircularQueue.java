package practice;

class MyCircularQueue {
    
    private int start = -1;
    private int end = -1;
    private int logicSize;
    private int realSize;
    private int[] logicArray;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        logicArray = new int[k];
        this.realSize = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (start == -1 && end == -1) {
            logicArray[0] = value;
            start = 0;
            end = 0;
            logicSize++;
            return true;
        } else if (this.isFull() == true) {
            return false;
        } else /*if (this.isFull() == false) */ {
            if (end + 1 > realSize - 1) {
                end = 0;
            } else {
                end++;
            }
            logicArray[end] = value;
            logicSize++;
            
            return true;
        }
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (this.isEmpty() == true) {
            return false;
        } else {
            start++;
            if (start > realSize - 1) {
                start = 0;
            }
            logicSize--;
            return true;
        }
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        } else {
            return logicArray[start];
        }
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        } else {
            return logicArray[end];
        }
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (logicSize == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (logicSize == realSize) {
            return true;
        } else {
            return false;
        }
    }
}

