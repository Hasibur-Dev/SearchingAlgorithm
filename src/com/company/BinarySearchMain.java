package com.company;

public class BinarySearchMain {
    public static void main(String[] args) {
        int[] mnumbers = {34,14,12,532,1,544};
        BinarySearch binarySearch = new BinarySearch();
        var index = binarySearch.search(mnumbers,544);
        System.out.println(index);

    }
}
