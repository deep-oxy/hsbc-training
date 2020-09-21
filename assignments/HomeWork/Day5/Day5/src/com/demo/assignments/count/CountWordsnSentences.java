package com.demo.assignments.count;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a program to count the number of words, sentences in a text file.
 *
 */
public class CountWordsnSentences {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("lion.txt");
		BufferedReader br = new BufferedReader(fr);
		int w = 0, l = 0;
		int s = 0;
		while ((s = br.read()) != -1) {
			if (((char) s + "").equals(" ")) {
				w++;
			}
			if (((char) s + "").equals(".")) {
				l++;
			}
		}

		br.close();
		System.out.println("Number of words = " + w);
		System.out.println("Number of lines = " + l);

	}

}
