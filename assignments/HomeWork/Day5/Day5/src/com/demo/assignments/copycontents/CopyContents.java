package com.demo.assignments.copycontents;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Create a file named “data.txt” with some text in it. Accept two command line
 * arguments as file name(s) and copy the contents of one file into another.
 *
 */

public class CopyContents {

	public static void copycat(String f1, String f2) {

		try {
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			String line = "";
			while ((line = br.readLine()) != null) {
				bw.write(line + "\n");
			}
			br.close();
			bw.close();
			System.out.println("Copied Successfully");

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Source file");
		String f1 = sc.nextLine();
		System.out.println("Enter the Destination file");
		String f2 = sc.nextLine();

		copycat(f1, f2);

	}

}
