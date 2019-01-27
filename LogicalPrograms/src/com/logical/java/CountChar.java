package com.logical.java;

import java.util.HashMap;
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		String s;
		int value;
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		System.out.println("Enter String:");
		s = sc.nextLine();

		for (int i = 0; i <s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				value = map.get(s.charAt(i));
				value++;
				map.put(s.charAt(i), value);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for(Character k:map.keySet()) {
			System.out.println("Charcter:'"+k+"'count:"+map.get(k));
		}

	}

}
