package com.java.core.collections.Queue;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * The elements of the priority queue are ordered according to their natural ordering
 * or by a Comparator provided at queue construction time, depending on which constructor is used.
 * A priority queue does not permit null elements
 * The head of this queue is the least element with respect to the specified ordering.
 */

@Slf4j
public class PriorityQueueExample {

    Queue<String> fruits = new PriorityQueue<>();

    public static void main(String[] args) {
        PriorityQueueExample priorityQueue = new PriorityQueueExample();

        priorityQueue.addFruits();

        priorityQueue.poll();
    }

    public void addFruits() {
        fruits.offer("apple");
        fruits.add("banana");
        fruits.addAll(List.of("oranges", "grapes"));
        log.info(fruits.toString());
    }

    public void poll() {
        fruits.poll();
        log.info(fruits.toString());
    }
}
