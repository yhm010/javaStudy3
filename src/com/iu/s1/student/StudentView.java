package com.iu.s1.student;

public class StudentView {

	// 출력 전용
	
	// vieStudents - 여러명의 학생의 모든 정보를 출력
	public void viewStudents(Student [] student) {
		for (int i = 0; i < student.length; i++) {
			Student student1 = student[i];
			System.out.println("이름 : " + student1.name);
			System.out.println("번호 : " + student1.num);
			System.out.println("국어 : " + student1.kor);
			System.out.println("영어 : " + student1.eng);
			System.out.println("수학 : " + student1.math);
		}
	}
	
	// viewStudent - 학생의 모든 정보를 출력
	public void viewStudent(Student student) {
		System.out.println("이름 : " +student.name);
		System.out.println("번호 : " +student.num);
		System.out.println("국어 : " +student.kor);
		System.out.println("영어 : " +student.eng);
		System.out.println("수학 : " +student.math);
	}
	
	
	
	
	public void viewMessage(String message) {
		// 문자열 출력
		System.out.println("------------------------");
		System.out.println(message);
		System.out.println("------------------------");
	}

}
