package lesson3;

import lesson3.test.Queue;

public interface Deque<E>  {
    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();





    int size();


    boolean isEmpty();


    boolean isFull();


    void display();
}
