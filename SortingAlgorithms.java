/**
 * This file pedagogical material for the course
 * CS 240: Data Structures and Algorithms
 * taught at California State Polytechnic University - Pomona, and
 * cannot be used without express written consent from the author.
 * 
 * Copyright (c) 2012 - Edwin Rodr&iacute;guez.
 */
package sortingAlgorithmsTesting;

import java.util.Arrays;
import java.util.Random;
import java.io.*;

//import edu.csupomona.cs.cs241.structures.ArrayHeap;

/**
 * @author Edwin Rodr&iacute;guez
 * 
 */
public class SortingAlgorithms {

	final static int NUMBER_OF_ALGORITHMS = 7;
	final static int NUMBER_OF_ELEMENTS_CHANGES = 4;
	final static int NUMBER_OF_BOUND_CHANGES = 6;
	static int numOfElements;
	static int boundSize;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		//Bubble Sort, Selection Sort, 
		//Insertion Sort, Merge Sort, 
		//Quick Sort, Counting Sort, and Radix Sort
		
		String fileName = "//WINDOWS-PC//Users//Eric//"
				+ "workspace//AlgorithmDataFile.txt";
		
		PrintWriter outputFile = new PrintWriter(fileName);
		
		 
				
		/*				

				
				
			 // Quick sort
			outputFile.println("------- Quick Sort (broken) ---------");
			
				A : for(int j = 0; j < NUMBER_OF_ELEMENTS_CHANGES ; ++j) {
					
					numOfElements = 0;
					
					switch(j) {
					
					case 0: // 1,000
						numOfElements = 1000;
						System.out.println("IN 1000");
						outputFile.println("numOfElements const : 1000"); 
						break;
					case 1: // 10,000
						numOfElements = 10000;
						System.out.println("IN 10000");
						outputFile.println("numOfElements const : 10000");
						break;
					case 2: // 100,000
						numOfElements = 100000;
						System.out.println("IN 100000");
						outputFile.println("numOfElements const : 100000");
						break;
					case 3: // 1,000,000
						//numOfElements = 1000000;
						//System.out.println("IN 1000000");
						//outputFile.println("numOfElements const : 1000000");
						break A;
					default:
						break;
					}
					
					for (int k = 0; k < NUMBER_OF_BOUND_CHANGES; ++k) {
						
						boundSize = 0;
						
						switch(k) {
						case 0: // 0 - 9
							outputFile.print("\nboundSize 10 : ");
							System.out.println("bound 0-9");
							boundSize = 10;
							break;
						case 1: // 0 - 99
							outputFile.print("\nboundSize 100 : ");
							System.out.println("bound 0-99");
							boundSize = 100;
							break;
						case 2: // 0 - 999
							outputFile.print("\nboundSize 1000 : ");
							System.out.println("bound 0-999");
							boundSize = 1000;
							break;
						case 3: // 0 - 9999
							outputFile.print("\nboundSize 10000 : ");
							System.out.println("bound 0-9999");
							boundSize = 10000;
							break;
						case 4: // 0 - 99999
							outputFile.print("\nboundSize 100000 : ");
							System.out.println("bound 0-99999");
							boundSize = 100000;
							break;
						case 5: // 0 - 999999
							outputFile.print("\nboundSize 1000000 : ");
							System.out.println("bound 0-999999");
							boundSize = 1000000;
							break;
						default:
							break;
						}
						
						
						
				
						int[] list = new int[numOfElements];
						Random rand = new Random();

						for (int l = 0; l < list.length; ++l) {
							list[l] = rand.nextInt(boundSize);
						}

						long initTime = System.currentTimeMillis();
						quickSort(list);
						long finalTime = System.currentTimeMillis();

						outputFile.print("time: " + (finalTime - initTime) + " ms");
						
					}
					
				}
			
				
				*/
				
				
			// Counting sort
				outputFile.println("------- Counting Sort ---------");
				
				for(int j = 0; j < NUMBER_OF_ELEMENTS_CHANGES ; ++j) {
					
					numOfElements = 0;
					
					switch(j) {
					
					case 0: // 1,000
						numOfElements = 1000;
						System.out.println("IN 1000");
						outputFile.println("numOfElements const : 1000"); 
						break;
					case 1: // 10,000
						numOfElements = 10000;
						System.out.println("IN 10000");
						outputFile.println("numOfElements const : 10000");
						break;
					case 2: // 100,000
						numOfElements = 100000;
						System.out.println("IN 100000");
						outputFile.println("numOfElements const : 100000");
						break;
					case 3: // 1,000,000
						numOfElements = 1000000;
						System.out.println("IN 1000000");
						outputFile.println("numOfElements const : 1000000");
						
					default:
						break;
					}
					
					A : for (int k = 0; k < NUMBER_OF_BOUND_CHANGES; ++k) {
						
						boundSize = 0;
						
						switch(k) {
						case 0: // 0 - 9
							outputFile.print("\nboundSize 10 : ");
								System.out.println("bound 0-9");
							boundSize = 10;
							break;
						case 1: // 0 - 99
							outputFile.print("\nboundSize 100 : ");
								System.out.println("bound 0-99");
							boundSize = 100;
							break;
						case 2: // 0 - 999
							outputFile.print("\nboundSize 1000 : ");
								System.out.println("bound 0-999");
							boundSize = 1000;
							break;
						case 3: // 0 - 9999
							if(numOfElements >= 10000) {
							outputFile.print("\nboundSize 10000 : ");
								System.out.println("bound 0-9999");
							boundSize = 10000;
							} else 
								break A;
							break;
						case 4: // 0 - 99999
							if(numOfElements >= 100000) {
							outputFile.print("\nboundSize 100000 : ");
								System.out.println("bound 0-99999");
							boundSize = 100000;
							} else
								break A;
							break;
						case 5: // 0 - 999999
							if(numOfElements >= 1000000) {
							outputFile.print("\nboundSize 1000000 : ");
								System.out.println("bound 0-999999");
							boundSize = 1000000;
							} else
								break A;
							break;
						default:
							break;
						}
						
						
				
						int[] list = new int[numOfElements];
						Random rand = new Random();

						for (int l = 0; l < list.length; ++l) {
							list[l] = rand.nextInt(boundSize);
						}

						long initTime = System.currentTimeMillis();
						countingSort(list);
						long finalTime = System.currentTimeMillis();
						outputFile.print("time: " + (finalTime - initTime) + " ms");
					}
					
				}
				
				
			
			
			
				
				
			outputFile.close();
}		
		
		
		/*
		int[] list = new int[100000];
		Random rand = new Random();

		for (int i = 0; i < list.length; ++i) {
//			list[i] = 42;
			list[i] = rand.nextInt(10000);
		}

		long initTime = System.currentTimeMillis();
		radixSort(list, 4);
		long finalTime = System.currentTimeMillis();

		System.out.println(finalTime - initTime);
	*/
		//outputFile.close();


	public static int[] countingSort(int[] numbers) {
		int[] counter = new int[numOfElements];
		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; ++i) {
			++counter[numbers[i]];
		}

		for (int i = 1; i < counter.length; ++i) {
			counter[i] += counter[i - 1];
		}

		for (int i = 0; i < result.length; ++i) {
			result[--counter[numbers[i]]] = numbers[i];
		}

		return result;
	}

	
	public static int[] radixSort(int[] numbers, int radix) {
		int[] result = numbers;
		
		for (int pos = 1; pos <= radix; ++pos) {
			result = modCountingSort(result, pos);
		}
		
		
		return result;
	}
	
	private static int getDigit(int number, int pos) {
		int pow = (int)Math.pow(10, pos);
		int rem = number % pow;
		return rem / (pow / 10);
	}

	public static int[] modCountingSort(int[] numbers, int pos) {
		int[] counter = new int[10];
		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; ++i) {
			++counter[getDigit(numbers[i], pos)];
		}

		for (int i = 1; i < counter.length; ++i) {
			counter[i] += counter[i - 1];
		}

		for (int i = result.length-1; i >= 0; --i) {
			result[--counter[getDigit(numbers[i], pos)]] = numbers[i];
		}

		return result;
	}

	public static int[] quickSort(int[] numbers) {

		quickSortHelper(numbers, 0, numbers.length - 1);

		return numbers;
	}

	private static void quickSortHelper(int[] numbers, int init, int last) {

		if ((last - init) < 1 || (last < 0)) {
			return;
		}

		int pivotIndex = partitionList(numbers, init, last);

		quickSortHelper(numbers, init, pivotIndex - 1);
		quickSortHelper(numbers, pivotIndex + 1, last);

	}

	private static int partitionList(int[] numbers, int init, int last) {
		int lastAssignedPos = init;

		for (int i = init; i < last; ++i) {
			if (numbers[i] < numbers[last]) {
				swap(numbers, lastAssignedPos, i);
				++lastAssignedPos;
			}
		}

		swap(numbers, last, lastAssignedPos);
		return lastAssignedPos;
	}

	public static int[] mergeSort(int[] numbers) {

		return mergeSortHelper(numbers, 0, numbers.length - 1);
	}

	private static int[] mergeSortHelper(int[] numbers, int init, int last) {
		if ((last - init) == 0) {
			return new int[] { numbers[last] };
		}

		int mid = (last + init) / 2;

		int[] subList1 = mergeSortHelper(numbers, init, mid);
		int[] subList2 = mergeSortHelper(numbers, mid + 1, last);

		return merge(subList1, subList2);
	}

	private static int[] merge(int[] subList1, int[] subList2) {
		int[] result = new int[subList1.length + subList2.length];
		int sub1First = 0;
		int sub2First = 0;

		for (int i = 0; i < result.length; ++i) {
			if (sub1First == subList1.length) {
				result[i] = subList2[sub2First++];
			} else if (sub2First == subList2.length) {
				result[i] = subList1[sub1First++];
			} else if (subList1[sub1First] <= subList2[sub2First]) {
				result[i] = subList1[sub1First++];
			} else {
				result[i] = subList2[sub2First++];
			}
		}

		return result;
	}

	public static int[] bubbleSort(int[] numbers) {
		boolean swapped = false;

		do {
			swapped = false;

			for (int i = 0; i < (numbers.length - 1); ++i) {
				if (numbers[i] > numbers[i + 1]) {
					swap(numbers, i, i + 1);
					swapped = true;
				}
			}

		} while (swapped);

		return numbers;
	}

	public static int[] selectionSort(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; ++i) {
			int minIndex = i;

			for (int j = i + 1; j < numbers.length; ++j) {
				if (numbers[j] < numbers[minIndex])
					minIndex = j;
			}

			swap(numbers, minIndex, i);
		}

		return numbers;
	}

	public static int[] insertionSort(int[] numbers) {
		for (int i = 1; i < numbers.length; ++i) {
			for (int j = i; j > 0; --j) {
				if (numbers[j] < numbers[j - 1]) {
					swap(numbers, j, j - 1);
				} else {
					break;
				}
			}
		}

		return numbers;
	}

	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static int[] recInsertSort(int[] list) {
		return recSortHelper(0, list);
	}

	private static int[] insert(int init, int[] list) {
		for (int i = init; i < list.length - 1; ++i) {
			if (list[i] > list[i + 1]) {
				swap(list, i, i + 1);
			} else {
				break;
			}
		}

		return list;
	}

	private static int[] recSortHelper(int init, int[] list) {
		if (init == (list.length - 1)) {
			return list;
		} else {
			return insert(init, recSortHelper(init + 1, list));
		}
	}

}