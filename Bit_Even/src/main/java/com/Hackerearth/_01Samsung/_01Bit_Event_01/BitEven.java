package com.Hackerearth._01Samsung._01Bit_Event_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BitEven {

	

	public static void main(String[] args) throws Exception {

		Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter cout = new PrintWriter(System.out);
		int t = cin.nextInt();
		while (t > 0) {
			int l = cin.nextInt();
			Integer[] given = new Integer[l];
			for (int i = 0; i < l; i++) {
				given[i] = cin.nextInt();
			}
			int sum = given[0];
			for (int i = 1; i < given.length; i++) {
				if(given[0]!=-1) {
					if (given[i] == -1) {
						Integer d = convertTobin(given[i - 1]);
						given[i] = d;
						sum += given[i];
					} 	
				}
				else {
					sum += given[i];
				}
			}
			System.out.println(sum);
			cout.write(sum+"\n");
			t--;
			cout.flush();

		}
		cout.close();
		cin.close();
	}

	

	static Integer convertTobin(Integer n) {
		int bit = countBit(n) + 2;
		Integer[] bitArray = new Integer[bit];
		for (int i = bitArray.length - 1; i >= 0; i--) {
			if ((n >> i & 1) > 0) {
				bitArray[i] = 1;
			}else {
				bitArray[i] = 0;
			}
		}
		int index = 0;
		for (int i = 0; i <= bitArray.length - 1; i+=2) {
			if (bitArray[i] != 0) 
			{
				index = i;
				bitArray[i] = 0;
			}
		}
		if(bitArray[index+1]!= 0) {
			index+=2;
		}
		for (int i = 0; i <= index; i++) {
			bitArray[i] = 0;
		}
		bitArray[index+1] = 1;
		Collections.reverse(Arrays.asList(bitArray));
		String bitA = Arrays.toString(bitArray);
		bitA = bitA.substring(1, bitA.length() - 1).replace(",", "").replace(" ", "");
		int dec = Integer.parseInt(bitA, 2);
		return dec;
	}

	static int binToDec(Integer[] n) {
		int d = 0, base = 1;
		int l = n.length;
		for (int i = l - 1; i >= 0; i--) {
			if (n[i] == 1) {
				d += base;
			}
			base = base * 2;
		}
		return d;
	}

	static int countBit(Integer n) {
		int c = 0;
		while (n != 0) {
			c++;
			n >>= 1;
		}
		return c;
	}

}
