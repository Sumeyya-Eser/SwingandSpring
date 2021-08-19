/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.sort;

import java.util.ArrayList;

import java.util.Collections;

/**
 *
 * @author Sumeyya
 */
public class SortingVisualizer {

	
	private static Thread sortingThread;

	public static VisualizationPanel frame;
	public static Integer[] toBeSorted;
	public static boolean isSorting = false;
	public static int sortDataCount = 100;
	public static int sleep = 20;
	public static int blockWidth;
	
	public static boolean stepped = false;
	
//	public static void main(String[] args) {
//		frame = new VisualizationPanel();
//		resetArray();
//		
//	}
	
	public static void resetArray(){
	//random data for now
		if (isSorting) return;
		toBeSorted = new Integer[sortDataCount];
		blockWidth = (int) Math.max(Math.floor(500/sortDataCount), 1);
		for(int i = 0; i<toBeSorted.length; i++){
			if (stepped) {
				toBeSorted[i] = i;
			} else {
				toBeSorted[i] = (int) (sortDataCount*Math.random());
			}
		}
		if (stepped) {
			ArrayList<Integer> shuffleThis = new ArrayList<>();
			for (int i = 0; i < toBeSorted.length; i++) {
				shuffleThis.add(toBeSorted[i]);
			}
			Collections.shuffle(shuffleThis);
			toBeSorted = shuffleThis.toArray(toBeSorted);
		}
		frame.preDrawArray(toBeSorted);
	}
	
	public static void startSort(String type){
		
		if (sortingThread == null || !isSorting){
			
			resetArray();
			
			isSorting = true;

			switch(type){
			case "Bubble":
				sortingThread = new Thread(new BubbleSort(toBeSorted, frame, false));
				break;

//			case "Selection":
//				sortingThread = new Thread(new SelectionSort(toBeSorted, frame, false));
//				break;
//
//			case "Insertion":
//				sortingThread = new Thread(new InsertionSort(toBeSorted, frame, false));
//				break;
//				
//			case "Gnome":
//				sortingThread = new Thread(new GnomeSort(toBeSorted, frame, false));
//				break;
//
//			case "Merge":
//				sortingThread = new Thread(new MergeSort());
//				break;
//				
//			case "Radix LSD":
//				sortingThread = new Thread(new RadixSort(toBeSorted, frame, true));
//				break;
//				
//			case "Radix MSD":
//				sortingThread = new Thread(new RadixSort(toBeSorted, frame, false));
//				break;
//				
//			case "Shell":
//				sortingThread = new Thread(new ShellSort());
//				break;
//				
//			case "Bubble(fast)":
//				sortingThread = new Thread(new BubbleSort(toBeSorted, frame, true));
//				break;
//
//			case "Selection(fast)":
//				sortingThread = new Thread(new SelectionSort(toBeSorted, frame, true));
//				break;
//
//			case "Insertion(fast)":
//				sortingThread = new Thread(new InsertionSort(toBeSorted, frame, true));
//				break;
//				
//			case "Gnome(fast)":
//				sortingThread = new Thread(new GnomeSort(toBeSorted, frame, true));
//				break;
//				
			default:
				isSorting = false;
				return;
			}
			
			sortingThread.start();
			
		}
		
	}

    
}
