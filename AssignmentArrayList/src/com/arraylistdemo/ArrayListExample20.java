package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample20 {

	public static void main(String[] args) {

		Collection<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		Integer[] array = list.toArray(new Integer[0]);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
