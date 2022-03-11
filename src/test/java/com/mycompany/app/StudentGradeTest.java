package com.mycompany.app;

import static org.junit.Assert.*;
// import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StudentGradeTest{
    
    StudentGrade studentGrade;

	@Before
	public void setUp() throws Exception {
		System.out.println("Inside setup");
		studentGrade = new StudentGrade(); //object ref
	}

	
	@Test
	public void testGradeA() {
		assertEquals('A',studentGrade.getGrade(90));
	}
	
	// @Test
	// void testGradeA2() {
	// 	assertNotEquals('A',studentGrade.getGrade(84));
	// }

	@Test
	public void testGradeB() {
		assertEquals('B',studentGrade.getGrade(75));
	}
	
	@Test
	public void testGradeC() {
		assertEquals('C',studentGrade.getGrade(60));
	}
	@Test
	public void testGradeD() {
		assertEquals('D',studentGrade.getGrade(45));
	}
	@Test
	public void testGradeE() {
		assertEquals('E',studentGrade.getGrade(30));
	}
	@Test
	public void testGradeF() {
		assertEquals('F',studentGrade.getGrade(20));
	}
}
