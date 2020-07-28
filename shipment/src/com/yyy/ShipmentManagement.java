package com.yyy;

public class ShipmentManagement {
	
	private int rootQ = 100;
	
	private int[] proportion = {2,3,5};
	
	private int[] merge = {1,2};
	
	private double[] ratio; 
	
	private double[] splitArray;
	
	private double mergeV = 0.0;

	public ShipmentManagement() {
		ratio = new double[proportion.length];
		splitArray = new double[proportion.length]; 
		ratio();
		split();
		merge();
	}
	
	private void ratio() {
		double sum = 0;
		for (double i : proportion) {
			sum += i;
		}
		for (int i = 0; i < ratio.length; i++) {
			ratio[i]=proportion[i]/sum;
		}
	}
	
	public void split() {
		for (int i = 0; i < ratio.length; i++) {
			splitArray[i] = ratio[i]*rootQ;
		}
	}
	
	public void merge() {
		for (int i = 0; i < merge.length; i++) {
			mergeV += splitArray[merge[i]];
		}
	}

	public void print() {
		System.out.println("----------split------");
		for (double i : splitArray) {
			System.out.println(i);
		}
		System.out.println("----------merge------");
		System.out.println(mergeV);
	}
	
	public static void main(String[] args) {
		ShipmentManagement sm = new ShipmentManagement();
		sm.print();
	}

	
}
