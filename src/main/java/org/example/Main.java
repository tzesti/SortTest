package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello Sort!");

        // Generate two identical lists of N random numbers
        int N = 10;

        Random random = new Random();

        List<Double> temps1 = new ArrayList<>(N);
        List<Double> temps2 = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            Double v = random.nextDouble();
            temps1.add(v);
            temps2.add(v);
        }

        // Optionally print the original list
        printList(temps1);


        // Sort with benchmarks
        long start;

        start = System.currentTimeMillis();
        selectionSort(temps1);
        System.out.println("Selection Sort: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        quicksort(temps2);
        System.out.println("Quick Sort: " + (System.currentTimeMillis() - start) + "ms");


        // Optionally print the lists
        printList(temps1);
        printList(temps2);
    }


    // Insertion Sort

    public static void selectionSort(List<Double> list) {
        int size = list.size(); // size of the list
        Double firstValue = list.get(0); // first value of the list
        Double lastValue = list.get(size - 1); // last value of the list
        list.set(0, 1.0); // set first item at index 0 to the value 1.0
        list.set(list.size() - 1, Double.MIN_VALUE); // set the last item at index size-1 to the smallest possible double value

    }


    // Quicksort

    public static void quicksort(List<Double> list) {
        qs(list, 0, list.size());
    }

    public static void qs(List<Double> list, int s, int e) {

    }


    // Helper Functions

    public static void printList(List<Double> list) {
        System.out.println("List: ");
        for (Double d : list) {
            System.out.println("  " + d);
        }
    }
}
