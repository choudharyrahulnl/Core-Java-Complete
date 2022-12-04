package com.java.core.collections.List;


import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * All of the operations perform as could be expected for a doubly-linked list.
 * Operations that index into the list will traverse the list from the beginning or the end,
 * whichever is closer to the specified index.
 * Note that this implementation is not synchronized
 */

@Slf4j
public class LinkedListExample {

    LinkedList<String> fruits = new LinkedList<>();

    public static void main(String[] args) {
        LinkedListExample linkedList = new LinkedListExample();

        linkedList.addFruits();

        linkedList.addFirst("oranges");
        linkedList.addLast("apricots");

        linkedList.getFirst();
        linkedList.getLast();

        linkedList.offer("peaches");

        linkedList.peek();
        linkedList.poll();
        linkedList.pop();
        linkedList.push("plums");
    }

    // Add some fruits to the list
    public void addFruits() {
        // "Apple", "Mango", "Pear"
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("apple");
        log.info(fruits.toString());
    }

    // Inserts the specified element at the beginning of this list.
    public void addFirst(String fruit) {
        fruits.addFirst(fruit);
        log.info(fruits.toString());
    }

    // Appends the specified element to the end of this list.
    public void addLast(String fruit) {
        fruits.addLast(fruit);
        log.info(fruits.toString());
    }

    // From List
    // indexOf(Object o): Returns the index of the first occurrence of the specified element
    // in this list, or -1 if this list does not contain the element
    // From LinkedList
    // lastIndexOf(Object o): Returns the index of the last occurrence of the specified element
    // in this list, or -1 if this list does not contain the element


    // Returns the first element in this list.
    public void getFirst() {
        log.info(fruits.getFirst());
    }

    // Returns the last element in this list
    public void getLast() {
        log.info(fruits.getLast());
    }

    // Adds the specified element as the tail (last element) of this list
    public void offer(String fruit) {
        fruits.offer(fruit);
        log.info(fruits.toString());
    }

    // offerFirst(E e): Inserts the specified element at the front of this list.
    // offerLast(E e): Inserts the specified element at the end of this list.

    // Retrieves, but does not remove, the head (first element) of this list.
    public void peek() {
        log.info(fruits.peek());
        log.info(fruits.toString());
    }

    // 	peekFirst(): Retrieves, but does not remove, the first element of this list,
    // or returns null if this list is empty
    // peekLast(): Retrieves, but does not remove, the last element of this list,
    // or returns null if this list is empty.

    // Retrieves and removes the head (first element) of this list
    public void poll() {
        log.info(fruits.poll());
        log.info(fruits.toString());
    }

    // pollFirst(): Retrieves and removes the first element of this list,
    // or returns null if this list is empty.
    // pollLast(): Retrieves and removes the last element of this list,
    // or returns null if this list is empty.


    // Pops an element from the stack represented by this list.
    // Removes from beginning
    public void pop() {
        log.info(fruits.pop());
        log.info(fruits.toString());
    }

    // Pushes an element onto the stack represented by this list.
    // Add at the beginning
    public void push(String fruit) {
        fruits.push(fruit);
        log.info(fruits.toString());
    }
}
