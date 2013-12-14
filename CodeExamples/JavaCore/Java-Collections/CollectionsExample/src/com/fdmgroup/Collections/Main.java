package com.fdmgroup.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.fdm.service.StopWatch;

public class Main {

	public static void main(String[] args) {

		
		final int SAMPLE_LIMIT = 20000;
		
		
		StopWatch sw = new StopWatch();
		Random intGen = new Random();
		
		Integer[] sample = new Integer[SAMPLE_LIMIT];

		for (int index = 0; index < SAMPLE_LIMIT; index++)
			sample[index] = intGen.nextInt(SAMPLE_LIMIT);

		
		List<Integer> listSample = new ArrayList<Integer>();
		Queue<Integer> queueSample = new LinkedList<Integer>();
		Set<Integer> setSample = new TreeSet<Integer>();

		sw.start();
		for (int index = 0; index < SAMPLE_LIMIT; index++) {
			listSample.add(sample[index]);
		}
		sw.stop();
		
		long listAddTime = sw.getElapsedTime();
		
		sw.start();
		for (int index = 0; index < SAMPLE_LIMIT; index++) {
			queueSample.add(sample[index]);
		}
		sw.stop();
		
		long listQTime = sw.getElapsedTime();
		
		sw.start();
		for (int index = 0; index < SAMPLE_LIMIT; index++) {
			setSample.add(sample[index]);
		}
		sw.stop();
		
		long listTreeTime = sw.getElapsedTime();

		
		System.out.println("base sample");
		for (Integer i : sample) {
			System.out.println("sample[]:" + i);
		}
		
		System.out.println("List sample");
		for (Integer i : listSample) {
			System.out.println("listSample:" + i);
		}
		
		System.out.println("queue sample");
		for (Integer i : queueSample) {
			System.out.println("queueSample:" + i);
		}
		
		System.out.println("set sample");
		for (Integer i : setSample) {
			System.out.println("setSample:" + i);
		}

		
		sw.start();
		for (int index = 0; index < SAMPLE_LIMIT; index++) {
			listSample.contains(sample[index]);
		}
		sw.stop();
		
		System.out.println("Time to add elements in an ArrayList:"
				+ listAddTime);
		System.out.println("Time to find element in an ArrayList:"
				+ sw.getElapsedTime());

		sw.start();
		for (int index = 0; index < SAMPLE_LIMIT; index++) {
			queueSample.contains(sample[index]);
		}
		sw.stop();
		
		System.out.println("Time to add element in a PriorityQueue:"
				+ listQTime);
		System.out.println("Time to find element in a PriorityQueue:"
				+ sw.getElapsedTime());

		sw.start();
		for (int index = 0; index < SAMPLE_LIMIT; index++) {
			setSample.contains(sample[index]);
		}
		sw.stop();
		
		System.out.println("Time to add element in a TreeSet:" + listTreeTime);
		System.out.println("Time to find element in a TreeSet:"
				+ sw.getElapsedTime());

	}

}
