public class Queue {
    /**
     * ArrayList to hold the queue items.
     */
    private ArrayList queue = new ArrayList();

    /**
     * Appends the input to the end of the queue.
     * @param input
     */
    public void enqueue(Object input) {
        queue.append(input);
    }

    /**
     * Removes the first element in the queue.
     * @return
     */
    public Object dequeue() {
        return queue.remove(0);
    }

    public String toString() {
        return queue.toString();
    }

    /**
     * Determines if the queue is empty (0 indices or all null elements).
     * @return
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean equals(Object other) {
        return queue.equals(other);
    }

    public boolean equals(Queue other) {
        return queue.equals(other.getQueue());
    }

    /**
     * Returns the size of the queue.
     * @return
     */
    public int size() {
        return queue.size();
    }

    /**
     * Returns an ArrayList object of the queue.
     * @return
     */
    public ArrayList getQueue() {
        return new ArrayList(queue);
    }
}
