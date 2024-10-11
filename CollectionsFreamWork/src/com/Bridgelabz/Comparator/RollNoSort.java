package com.Bridgelabz.Comparator;

import java.util.Comparator;

public class RollNoSort implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {

		return stu1.getRollno() - stu2.getRollno();
	}

}
