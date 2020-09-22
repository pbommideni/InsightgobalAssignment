package com.challenge.solution;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The decimal obtained after binary reversal is: "+doBinaryReversal("2"));

	}

	private static int doBinaryReversal(String num) {
		int val = Integer.parseInt(num);
		String binVal = Integer.toBinaryString(val).toString();
		if (binVal.length() < 8) {
			binVal = padZeroes(binVal);
		}
		StringBuilder sb = new StringBuilder(binVal);
		binVal = sb.reverse().toString();
		return Integer.parseInt(binVal, 2);
	}

	private static String padZeroes(String val) {
		int n = 8 - val.length();
		String value = "";
		for (int i = 0; i < n; i++) {
			value = value + "0";
		}
		value = value + val;

		return value;
	}
}
