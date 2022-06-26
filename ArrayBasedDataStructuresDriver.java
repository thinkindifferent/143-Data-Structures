//package HW3;

/**Incomplete Driver for ArrayList(ObjectList),Stack and Queue***/
// Lesley's version - has some extra ArrayList tests

public class ArrayBasedDataStructuresDriver {
	public static void main(String[] args) {
		arrayListTests();
		
		queueTests();
		stackTests();	
		
	}

	private static void arrayListTests() {
		System.out.println("ArrayList Tests");
		// todo: make more tests here
		ArrayList a = new ArrayList();
		System.out.println("Check empty array isEmpty:" + a.isEmpty());
		a.insert('B', 0);
		a.insert('a', 0);
		a.insert('t', 1);
		System.out.println("Check non-empty array isEmpty:" + a.isEmpty());
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println(a.remove(0));
		}
			
		// Fill over initial capacity and check that it grows
		for (int i = 0; i < 110; i++)
		{
			a.append(new Integer(i));
		}
		System.out.println("Size of array after 110 adds: "+ a.size());
		System.out.println("Value of last element: "+ a.get(a.size()-1));
		System.out.println("Insert past end of list");
		a.insert('z', 200);
		System.out.println("Insert negative index");
		a.insert('z',  -3);
		System.out.println("Remove past end of list");
		a.remove(200);
		
		// -----------------------------------------------------------------
		// ADDITIONAL TESTS
		
		// Check for equality
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list1.insert("A", 0);
		list1.insert("B", 0);
		list1.insert("C", 0);
		list2.insert("A", 0);
		list2.insert("B", 0);
		list2.insert("C", 0); 
		System.out.println("equality true check: " + list1.equals(list2));
		list2.remove(1);
		list2.insert("D", 0);
		System.out.println("equality false check: " + list1.equals(list2));
		
		System.out.println("index of, expecting 1: " + list1.getIndexOf("B"));
		System.out.println("index of, expecting -1: " + list1.getIndexOf("J"));
		System.out.println("getAt, expecting A: " + list1.get(2));
		System.out.println("getAt, expecting error: ");
		System.out.println(list1.get(9));
		System.out.println("size, expecting 3: " + list1.size());
		System.out.println("remove return value, expecting A: " + list1.remove(2));

		/**
		 * 
		 * Additional tests copied from self-created test driver
		 * 
		 */

		ArrayList test = new ArrayList(5);

        //append method tests
        test.append(1);
        test.append(2);
        test.append(3);
        test.append(4);
        test.append(5);

        //insert method test
        test.insert(5, 0);

        ArrayList equalsTest = new ArrayList();

        for (int i = 0; i < 4; i++) {
            equalsTest.append(4);
        }

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }

        //various method tests
        System.out.println("toString test: " + equalsTest);
        System.out.println("equals test, should be false: " + test.equals(equalsTest));
        System.out.println("size test, should be 6: " + test.size());
        System.out.println("getIndexOf test, should be 3: " + test.getIndexOf(3));
        System.out.println("getIndexOf test, should be -1: " + equalsTest.getIndexOf(5));
        System.out.println("contains test, should be false: " + equalsTest.contains(90));
        System.out.println("isEmpty test, should be false: " + test.isEmpty());

        ArrayList emptyTest = new ArrayList();
        System.out.println("isEmpty test, should be true: " + emptyTest.isEmpty());

        //Additional tests for size, remove, etc.
        System.out.println(test);
        System.out.println(test.size());
        System.out.println(test.remove(3));
        System.out.println(test.size()); 
        System.out.println(test);

        //final insert test, with a test for attempting to insert 1 beyond the length of ArrayList
        test.insert(1, 1);
        test.insert(6, 7);
        System.out.println(test);

        //stack tests: push, toString, isEmpty, equals, pop
        Stack stackTest = new Stack();
        Stack anotherStackTest = new Stack();
        stackTest.push(1);
        stackTest.push(10);
        stackTest.push(90);
        stackTest.push(1000);

        System.out.println("toString test, should be 1, 10, 90, 1000: " + stackTest);
        System.out.println("isEmpty test, should be false: " + stackTest.isEmpty());
        System.out.println("equals test, should be false: " + stackTest.equals(anotherStackTest));

        for (int i = 0; i < stackTest.size(); i++) {
            System.out.println(stackTest.pop());
        }

        //queue tests: enq, deq, isEmpty, equals
        Queue queueTest = new Queue();
        Queue anotherQueueTest = new Queue();

        queueTest.enqueue(80);
        queueTest.enqueue(900);
        queueTest.enqueue(39684);
        queueTest.enqueue(67);
        queueTest.dequeue();

        System.out.println("toString test, should be 900, 39684, 67: " + queueTest);
        System.out.println("isEmpty test, should be true: " + anotherQueueTest.isEmpty());

        anotherQueueTest.enqueue(900);
        anotherQueueTest.enqueue(39684);
        anotherQueueTest.enqueue(67);

        System.out.println("equalsTest, should be true: " + queueTest.equals(anotherQueueTest));
		
	}

	private static void queueTests() {
		System.out.println("\nQueue Tests");

		Queue a = new Queue();
		System.out.println("dequeue empty q");
		a.dequeue();
		a.enqueue('B');
		a.enqueue('a');
		a.enqueue('t');
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println(a.dequeue());
		}
		System.out.println("Fill past initial size");
		for (int i = 0; i < 110; i++)
		{
			a.enqueue(i);
		}
		System.out.println("size: "+ a.size());
	}

	private static void stackTests() {
		System.out.println("\nStack Tests");
	
		Stack a = new Stack();
		System.out.println("pop empty stack");
		a.pop();
		a.push('B');
		a.push('a');
		a.push('t');
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println(a.pop());
		}
		
		System.out.println("pop past pushes");
		a.push('A');
		a.pop();
		a.pop();
		System.out.println("Fill past initial size");
		for (int i = 0; i < 110; i++)
		{
			a.push(i);
		}
		System.out.println("pop last");
		System.out.println(a.pop());
	}
}