package com.demo.io.app.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.demo.io.app.EmpDao;
import com.demo.io.entity.Emp;

public class EmpDaoFileSystemImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String message = "emp not written";

		try {
			fr = new FileReader("emp.txt");
			br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.contains("" + e.getEmpId())) {
					message = "Emp already exists";
					return message;
				}
			}

			fw = new FileWriter("emp.txt", true);
			String empData = e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary() + "\n";
			fw.write(empData);
			fw.flush();
			message = "Emp written to file";
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ei) {
				ei.printStackTrace();
			}
		}

		return message;
	}

}
