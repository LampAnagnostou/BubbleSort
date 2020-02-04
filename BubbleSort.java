/*
Implementation of a Bubble Sort algorithm
 */
package bubblesort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Lampros Anagnostou <lampanagnostou@gmail.com>
 */
public class BubbleSort {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Random rand = new Random();
        int [] array = new int[10];
        
        for (int i = 0; i < 10 ; i++){
            array[i] =(int) (Math.random()*10);
        }
        
        bubbleSort(array);

    }

    public static void bubbleSort(int[] numbers) {
        System.out.printf("Unsorted array: %s %n", Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    swap(numbers, j, j - 1);
                }
            }
        }
        System.out.printf("Sorted array with Bubble Sort: %s %n", Arrays.toString(numbers));
    }

    public static void swap(int[] array, int from, int to) {
        int tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }

}
