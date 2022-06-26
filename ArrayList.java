public class ArrayList {
    /**
     * numElements tracks the number of indices that are filled with meaningful
     * values and not nulls. It will increase with each addition into the ArrayList
     * and decrease with each removal from the ArrayList.
     * list is the array storing the ArrayList data
     */
    private int numElements = 0;
    private Object[] list;
   
    /**
     * No arg constructor initializes the ArrayList to 0 indices.
     */
    public ArrayList() {
        list = new Object[0];
    }
   
    /**
     * Constructor that initializes the ArrayList to a specified size.
     * @param size
     */
    public ArrayList(int size) {
        list = new Object[size];
    }

    /**
     * Copy constructor for another ArrayList.
     * @param other
     */
    public ArrayList(ArrayList other) {
        if (other != null) {
            this.numElements = other.numElements;
            this.list = other.list;
        }
    }
   
    /**
     * Takes in an object and index, and moves indices past the specified index
     * over by 1 to the right to make room to insert the object.
     * @param input
     * @param index
     */
    public void insert(Object input, int index) {
        
        if (validIndex(index)) {

            expandList();
            
            for (int i = list.length - 2; i >= 0; i--) {
                list[i + 1] = list[i];
            }

            list[index] = input;
            numElements++;
        } else if (index == list.length) {
            append(input);
        }
    }
   
    /**
     * Adds the specified object onto the end of the ArrayList.
     * @param input
     */
    public void append(Object input) {

        if (numElements == list.length) {
            expandList();
        }
        list[numElements++] = input;
        
    }
   
    /**
     * Returns the object in the ArrayList at the specified index.
     * @param index
     * @return
     */
    public Object get(int index) {
        if (validIndex(index)) {
            return list[index];
        } else {
            return null;
        }
    }

    /**
     * Removes the object from the specified index and moves all elements past
     * the index left by 1.
     * @param index
     * @return
     */
    public Object remove(int index) {
        Object retObj = null;   
        if (validIndex(index)) {
            retObj = list[index];
            Object[] temp = new Object[list.length - 1];

            int j = 0;
            for (int i = 0; i < list.length; i++) {
                if (i == index) {
                    continue;
                }
                temp[j++] = list[i];
            }

            list = temp;
            numElements--;
        }

        
        return retObj;
    }
   
    /**
     * Returns the size of the ArrayList.
     * @return
     */
    public int size() {
        return list.length;
    }
   
    /**
     * Finds the first index that a specified object is in inside
     * the ArrayList. If the object is not present, returns -1.
     * @param input
     * @return
     */
    public int getIndexOf(Object input) {
        int retIndex = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(input)) {
                retIndex = i;
                break;
            }
        }
       
        return retIndex;
    }
   
    /**
     * Finds whether or not a specified object is inside the ArrayList.
     * Returns true if at least 1 copy of the specified object is present,
     * and false if no copy is present.
     * @param input
     * @return
     */
    public boolean contains(Object input) {
        boolean retBool = false;
        for (int i = 0; i < list.length; i++) {

            if (list[i] == null) {
                retBool = false;
                break;
            }

            if (list[i].equals(input)) {
                retBool = true;
                break;
            }
        }
       
        return retBool;
    }

    /**
     * Returns true if the ArrayList is empty (0 indices or all null elements).
     * Returns false otherwise.
     * @return
     */
    public boolean isEmpty() {
        boolean retBool = false;

        if (numElements == 0) {
            retBool = true;
        } else {
            for (Object element : list) {
                if (element == null) {
                    retBool = true;
                }
            }
        }

        return retBool;
    }
   
    public String toString() {
        String retString = "";
       
        for (int i = 0; i < list.length; i++) {

            if (i == (list.length - 1)) {
                retString = retString + list[i];
                break;
            }

            retString = retString + list[i] + ", ";
        }
       
        return retString;
    }

    public boolean equals(Object input) {
        if ((input == null) || !(input instanceof ArrayList)) {
            return false;
        }

        ArrayList that = (ArrayList) input;

        if (this.numElements != that.numElements) {
            return false;
        }

        for (int i = 0; i < numElements; i++) {
            if (this.list[i] != that.list[i]) {
                return false;
            }
        }

        return true;
    }
   
    /**
     * Helper method to expand the ArrayList by 1 index while copying
     * over the data of the ArrayList into a bigger list.
     */
    private void expandList() {
        Object[] temp = new Object[numElements + 1];
       
        System.arraycopy(list, 0, temp, 0, list.length);
        list = temp;
    }
   
    /**
     * Helper method to determine if a specified index is valid (is greater than
     * or equal to 0, and does not surpass the length of the ArrayList). Returns true
     * if these conditions are met, and false if not.
     * @param index
     * @return
     */
    private boolean validIndex(int index) {
        boolean retBool = false;
        if ((index >= 0) && (index < list.length)) {
            retBool = true;
        } else {
            //System.out.println("Invalid index");
        }
       
        return retBool;
    }
}