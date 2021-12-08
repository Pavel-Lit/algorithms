package lesson3;

public class Homework {

    public static void main(String[] args) {
        int[] arr1 ={1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] arr2 = {1, 2, 4, 5, 6};
        int[] arr3 = {};

        FindNumber.missingNumber(arr1);
        FindNumber.missingNumber(arr2);
        FindNumber.missingNumber(arr3);
        System.out.println("----------------------------------------");
        MyDeque<Integer> deque = new MyDeque<Integer>(6);

        deque.insertRight(1);
        deque.display();
        deque.insertRight(2);
        deque.display();
        deque.insertRight(3);
        deque.display();
        deque.insertLeft(1);
        deque.display();
        deque.insertLeft(3);
        deque.display();

        deque.insertLeft(2);
        deque.display();
        System.out.println(deque.insertLeft(1));

        System.out.println(deque.insertLeft(1));


        System.out.println("__________________________");
        System.out.println(deque.removeRight());
        deque.display();
        System.out.println(deque.removeRight());
        deque.display();
        System.out.println(deque.removeRight());
        deque.display();
        System.out.println(deque.removeLeft());
        deque.display();
        System.out.println(deque.removeLeft());
        deque.display();
        System.out.println(deque.removeLeft());
        deque.display();


//        deque.display();
    }
}
