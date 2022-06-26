public class Driver {
    public static void main(String[] args) {
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
        System.out.println(test.size()); //should be 
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
}
