package practice;

public class DynamicArray {
	private int[] array;
	private int size = 0;
	private int curIndex = -1;
	
	public DynamicArray() {
		
	}
	
	public void add(int val) {
		if (size == 0) {
			array = new int[1];
			curIndex = 0;
			size++;
			array[curIndex] = val;
		} else if (size > curIndex + 1) {
			array[++curIndex] = val;
		} else if (size == curIndex + 1) {
			int[] newArray = new int[size * 2];
			
			for (int i = 0; i < size; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			array[++curIndex] = val;
			size *= 2;
		}
	}
	
	public void printArray() {
		for (int i = 0; i <= curIndex; i++) {
			System.out.println(array[i]);
		}
	}
}