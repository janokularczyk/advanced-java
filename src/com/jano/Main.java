package com.jano;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Strings methods
        String[] words = {"funk", "chunk", "furry", "baconator"};
        // startsWith method
        for(String w : words) {
            if(w.startsWith("fu")) {
                System.out.println(w + " starts with fu");
            }
        }
        // endsWith method
        for(String w : words) {
            if(w.endsWith("unk")) {
                System.out.println(w + " ends with unk");
            }
        }
        // characters and substrings
        String s = "buckyrobertsbuckyroberts";
        System.out.println(s.indexOf('k'));
        System.out.println(s.indexOf('k',5));  // ignore first 5
        System.out.println(s.indexOf("rob"));  // output will be the starting point

        String a = "Bacon ";
        String b = "monster";

        System.out.println(a + b);  // concatenate strings
        System.out.println(a.concat(b));  // better
        System.out.println(a.replace('B', 'F'));
        System.out.println(a.toUpperCase());  // useful with database
        System.out.println(b.trim());  // removes unnecessary spaces


        //Recursion
        System.out.println(fact(5));


        //ArrayList
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();
        // add array items to list
        for (String x: things) {
            list1.add(x);
        }

        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();
        for (String y: moreThings) {
            list2.add(y);
        }
        // print list 1
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));  // print format
        }

        editList(list1, list2);  // removes items from list 1 which where in list 2
        System.out.println();
        // print list 1 after method editList
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));  // print format
        }


        //LinkedList
        String[] things2 = {"apples", "noobs", "pwnage", "bacon", "goATS"};
        List<String> list3 = new LinkedList<String>();
        for(String x : things2) {
            list3.add(x);
        }

        String[] things3 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list4 = new LinkedList<String>();
        for(String y : things3) {
            list4.add(y);
        }

        list3.addAll(list4);  // takes everything from list 3 and adds it to list 4
        list4 = null;

        System.out.println();
        printMe(list3);  // prints list
        removeStuff(list3, 2, 5);  // is taking list and two locations FROM and TO you wanna delete
        printMe(list3);
        reverseMe(list3);  // is reversing everything in list


        //List to array
        String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));  // we created  a list containing array stuff
        // treating array as a list using list methods
        theList.add("pumpkin");
        theList.addFirst("firstThing");
        // convert back to an array
        stuff = theList.toArray(new String[theList.size()]);
        // printing stuff array
        for(String x : stuff) {
            System.out.printf("%s ", x);
        }
        System.out.println();


        //Sort method
        String[] crap = {"apples", "lemons", "geese", "bacon", "youtube"};
        List<String> l1 = Arrays.asList(crap);  // converts array into an list
        // we can call methods from Collection class
        Collections.sort(l1);  // sorts list in alphabetical order
        System.out.printf("%s\n", l1);

        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);


        //Reverse copy & fill method
        Character[] ray = {'p', 'w', 'n'};
        List<Character> l = Arrays.asList(ray);
        System.out.println("list is: ");
        output(l);
        // reverse and print out the list
        Collections.reverse(l);  // reverses everything
        System.out.println("after reverse: ");
        output(l);
        // create a new array and new list
        Character[] newRay = new Character[ray.length];
        List<Character> lCopy = Arrays.asList(newRay);
        // copy contents of list into list copy
        Collections.copy(lCopy, l);  // 1 parameter destination 2 parameter source
        System.out.println("copy of list: ");
        output(lCopy);
        // fill collection with crap
        Collections.fill(l, 'X');  // 2 parameters 1 what collection do you wanna fill 2 is type of data
        System.out.println("after filling the list: ");
        output(l);


        //AddAll method
        // convert food array to a list
        String[] food = {"apples", "beef", "corn", "ham"};
        List<String> foodList = Arrays.asList(food);

        ArrayList<String> websites = new ArrayList<String>();
        websites.add("youtube");
        websites.add("google");
        websites.add("digg");
        // printing foodList
        for(String x : websites) {
            System.out.printf("%s ", x);
        }
        System.out.println();

        Collections.addAll(websites, food);  // it takes all the elements from food and adds it to websites
        for(String x : websites) {
            System.out.printf("%s ", x);
        }
        System.out.println();
        // frequency method
        System.out.println(Collections.frequency(websites, "digg"));  // it goes through websites list and checks how many times something appears
        // disjoint method
        boolean tof = Collections.disjoint(foodList, websites);  // this method return true if there is no items in common
        System.out.println(tof);

        if(tof) {
            System.out.println("this list do not have anything in common");
        } else {
            System.out.println("this list must have something in common!");
        }


        //Stack
        Stack<String> stack = new Stack<String>();

        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);


        //Priority queue
        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("first");  // highest priority
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ", q);
        System.out.println();

        System.out.printf("%s ", q.peek());  // it will look at the element with the highest priority and return it
        System.out.println();

        q.poll();  // automatically removes element with the highest priority
        System.out.printf("%s ", q);
        System.out.println();


        //Hashset
        // cannot contain duplicates
        String[] evenMoreThings = {"apples", "bob", "ham", "bob", "bacon"};
        List<String> listOfEvenMoreThings = Arrays.asList(evenMoreThings);

        System.out.printf("%s ", listOfEvenMoreThings);
        System.out.println();

        Set<String> set = new HashSet<String>(listOfEvenMoreThings);  // set removes duplicates
        System.out.printf("%s ", set);
        System.out.println();


        //Generic method
        Integer[] iRay = {1, 2, 3, 4};
        Character[] cRay = {'b', 'u', 'c', 'y'};

        print(iRay);
        print(cRay);
        // returning generic data
        System.out.println(max(23,42,1));
        System.out.println(max("apples", "tots", "chicken"));


        //Threads
        // threads allows you to do multiple things at once
        Thread t1 = new Thread(new Threads("one"));  // creating thread from threads class
        Thread t2 = new Thread(new Threads("two"));
        Thread t3 = new Thread(new Threads("three"));
        Thread t4 = new Thread(new Threads("four"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
    //Recursion
    // fact = factorial
    public static long fact(long n) {
        if(n <= 1) {  // base case
            return 1;
        } else {
            return n * fact(n-1);  // method called inside is the same method
        }
    }
    //ArrayList
    // for polymorphism pass the highest thing possible
    public static void editList(Collection<String> l1, Collection<String> l2) {
        Iterator<String> it = l1.iterator();  // iterator goes through each list item by item
        while(it.hasNext()) {  // loop through until you reach the end of the list
            if(l2.contains(it.next())) {  // is checking if item is in the list 2
                it.remove();  // if it isn't it's removed
            }
        }
    }
    //LinkedList
    private static void printMe(List<String> l) {
        for(String b : l) {
            System.out.printf("%s ", b);  // "%s " this line of code will print each item with space
        }
        System.out.println();
    }

    private static void removeStuff(List<String> l, int from, int to) {
        l.subList(from, to).clear();
    }

    private static void reverseMe(List<String> l) {
        ListIterator<String> iterator = l.listIterator(l.size());
        while(iterator.hasPrevious()) {  // while it has something before it this is gonna be true until last element
            System.out.printf("%s ", iterator.previous());
        }
        System.out.println();
    }
    //Reverse copy & fill method
    private static void output(List<Character> theList) {
        for(Character thing : theList) {
            System.out.printf("%s ", thing);
        }
        System.out.println();
    }
    //Stack
    private static void printStack(Stack<String> s) {
        if(s.isEmpty()) {
            System.out.println("you have nothing in your stack");
        } else {
            System.out.printf("%s TOP\n", s);
        }
    }
    //Generic method
    // generic method compact methods that do the same but for different data type
    // <T> is convention for generic parameter
    public static <T> void print(T[] x) {
        for(T b : x) {
            System.out.printf("%s ", b);
        }
        System.out.println();
    }
    // returning generic data
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T m = a;
        if( b.compareTo(a) > 0) {
            m = b;
        }
        if ( c.compareTo(m) > 0) {
            m = c;
        }
        return m;
    }
}