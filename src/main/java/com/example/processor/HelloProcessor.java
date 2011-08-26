package com.example.processor;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class HelloProcessor {

	private static final String[] planets = new String[] {
		"Mars", "Earth", "Jupiter", "Mercury", "Venus", "Saturn", "Uranus", "Neptune",
		
		// I still believe in you, Pluto! :-)
		"Pluto"
	};

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		System.out.println("Planets:  " + Arrays.toString(planets));
		ArrayUtils.reverse(planets);
		System.out.println("Reversed: " + Arrays.toString(planets));
	}
}
