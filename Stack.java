public class Stack {
    /**
     * ArrayList to hold the stack items.
     */
    private ArrayList stack = new ArrayList();

    /**
     * Appends the input to the end of the stack.
     * @param input
     */
    public void push(Object input) {
        stack.append(input);
    }

    /**
     * Removes the last element in the stack.
     * @return
     */
    public Object pop() {
        return stack.remove(stack.size() - 1);
    }

    public String toString() {
        return stack.toString();
    }

    /**
     * Determines if the stack is empty (0 indices or all null elements).
     * @return
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean equals(Object other) {
        return (stack.equals(other));
    }

    public boolean equals(Stack other) {
        return stack.equals(other.getStack());
    }

    /**
     * Returns the size of the stack.
     * @return
     */
    public int size() {
        return stack.size();
    }

    /**
     * Returns an ArrayList object of the stack.
     * @return
     */
    public ArrayList getStack() {
        return new ArrayList(stack);
    }
}

/**
 * The equals methods for both Stack and Queue were a bit finnicky and kept giving me:
 * Exception in thread "main" java.lang.ClassCastException: class Stack cannot be cast to class ArrayList (Stack and ArrayList are in unnamed module of loader 'app')
        at ArrayList.equals(ArrayList.java:211)
        at Stack.equals(Stack.java:36)
        at Driver.main(Driver.java:59)
    
    I wanted to use getStack() and getQueue() to be able to use the ArrayLists within
    the classes and avoid any type casting, but I was unsure about implementing it into the 
    equals() methods of either Stack or Queue in a generalized way using the type Object.

    I tried using an overloaded equals method that takes a parameter of a Stack/Queue 
    to use the ArrayList class' equals method to make the comparison, but it still
    produces erratic results.
 */