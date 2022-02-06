package com.company;

public class LinearSearchMain {

    public static void main(String[] args) {
	int[] numbers = {2,1,532,121,534,13};
    LinearSearch linearSearch = new LinearSearch();
    var TargetIndex = linearSearch.search(numbers,534);
    System.out.println(TargetIndex);
    }
}
