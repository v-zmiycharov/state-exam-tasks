package stateexam;

public class CharStack {
    private int size;
    private char[] array;
    private int topIndex;
    
    public CharStack(int size) {
        this.size = size;
        this.array = new char[size];
        this.topIndex = -1;
    }
    
    public boolean isEmpty() {
        return topIndex == -1;
    }
    
    public void push(char elem) {
        this.topIndex++;
        this.array[topIndex] = elem;
    }
    
    public char pop() {
        topIndex--;
        return this.array[topIndex+1];
    }
}
