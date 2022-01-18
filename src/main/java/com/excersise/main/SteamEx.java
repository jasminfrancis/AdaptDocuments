package com.excersise.main;

import java.util.Arrays;
import java.util.List;


public class SteamEx {

	public static void main(String arg[]) {
		List number = Arrays.asList(2, 3, 4, 5);
		List a=number.stream().map(x -> x*x).collect(Collectors.toList());

	}

}
