import static org.junit.Assert.*;

import org.junit.Test;


public class test1 {
	private LoanApplicant applicantInfo;
	private AnalysedDatabase database;
	
	@Test
	public void manualTest() {
		applicantInfo = new LoanApplicant("Panama", "Mama", "Llama", "1928", "2012", "123123", "3234234", "32", "sdddd", "Town", 
				"1/2 45 Street", "5367", "234", "1970");
		database = new AnalysedDatabase(applicantInfo);
		
		float score = database.calculateScore();
		
		System.out.println("score: "+score);
		assertEquals(0.2375, score,0.1);
	}
	
	@Test
	public void autoTest1() {
		applicantInfo = new LoanApplicant("Panama", "Mama", "Llama", "1928", "2012", "123123", "3234234", "32", "sdddd", "Town", 
				"1/2 45 Street", "5367", "234", "1970");
		database = new AnalysedDatabase(applicantInfo);
		
		float score = database.calculateScore();
		
		System.out.println("score: "+score);
		assertEquals(0.2375, score,0.1);
	}
	
	@Test
	public void autoTest2() {
		applicantInfo = new LoanApplicant("Panama", "Mama", "Llama", "1990", "2012", "123123", "3234234", "32", "sdddd", "", 
				"1/2 45 Street", "5367", "234", "20");
		database = new AnalysedDatabase(applicantInfo);
		
		float score = database.calculateScore();
		
		System.out.println("score: "+score);
		assertEquals(0.2375, score,0.1);
	}
	
	@Test
	public void autoTest3() {
		applicantInfo = new LoanApplicant("Panama", "Mama", "Llama", "80", "2010", "", "3234234", "32", "sdddd", "Town", 
				"", "5367", "234", "9");
		database = new AnalysedDatabase(applicantInfo);
		
		float score = database.calculateScore();
		
		System.out.println("score: "+score);
		assertEquals(0.125, score,0.1);
	}
	
}
