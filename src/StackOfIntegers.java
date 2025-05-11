/**
 * No. 25
 * If you have any questions on what's going on send me text
 * THis stack uses an array
 * 
 * You have to add tests, inside of your main function
 */

public class StackOfIntegers {
    private int[] elements;
    private int size;

    StackOfIntegers() {
        this.size = 16;
        elements = new int[size];
    }

    StackOfIntegers(int size) {
        this.size = size;
        elements = new int[size];
    }

    public boolean empty() {
        return this.elements.length == 0;
    }

    public int peek() {
        int forLastElem = elements.length - 1;
        return elements[forLastElem];
    }

    public void push(int value) {
        pusher(value);
    }

    public int pop() {
        int[] arr = new int[size - 1];
        int returnValue = elements[size - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elements[i];

        }
        this.elements = arr;

        return returnValue;
    }

    private void pusher(int toBeAdded) {
        int[] arr = new int[size + 1];
        arr[arr.length - 1] = toBeAdded;
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = elements[i];
        }
        this.elements = arr;

    }

    public int getSize() {
        return this.size;
    }

}