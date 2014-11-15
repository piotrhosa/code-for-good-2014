import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class AnalysedDatabase {
	Scanner sc;
	Scanner sc1;
	Scanner sc2;
	Scanner sc3, sc4;
	String interestRate;
	String dob;
	String loanId;
	String principle;
	float score;
	public AnalysedDatabase(LoanApplicant app){

		try{
			
			sc = new Scanner(new File("/home/piotr/Documents/EclipseWorkspace/Musoni/src/AnnualInterestRate.csv"));
			sc1 = new Scanner(new File("/home/piotr/Documents/EclipseWorkspace/Musoni/src/DateOfBirth.csv"));
			sc2 = new Scanner(new File("/home/piotr/Documents/EclipseWorkspace/Musoni/src/loanPurposeId.csv"));
			sc3 = new Scanner(new File("/home/piotr/Documents/EclipseWorkspace/Musoni/src/PrincipleAmount.csv"));
			sc4 = new Scanner(new File("/home/piotr/Documents/EclipseWorkspace/Musoni/src/nulldata.csv"));
		}catch (Exception e){
			e.printStackTrace();
			throw new RuntimeException("failed to read configuration files", e);
		}

		TreeMap <Float,String>interestrate=getTreeMap(sc);
		TreeMap <Float,String>dateOfBirth=getTreeMap(sc1);
		TreeMap <Float,String>loanPurposeId=getTreeMap(sc2);
		//TreeMap <Float,String>principleAmount=getTreeMap(sc3);
		
		// Order is: Middle name, mobile no, state, town, address, telephone no
		ArrayList<String> ar=new ArrayList<String>();
		
		while(sc4.hasNextLine()){
			String f= sc4.nextLine();
			ar.add(f);
		}
		
		if(app.getMiddleName() != "") score += Float.valueOf(ar.get(0));
		if(app.getMobileNumber() != "") score += Float.valueOf(ar.get(1));
		if(app.getState() != "") score += Float.valueOf(ar.get(2));
		if(app.getTown() != "") score += Float.valueOf(ar.get(3));
		if(app.getPhoneNumber() != "") score += Float.valueOf(ar.get(4));	
	

		
		interestRate=app.getInterest();
		dob=app.getDateOfBirth();
		loanId=app.getLoanPuropse();
		
		score = Float.valueOf(findClosest(interestrate,interestRate))+Float.valueOf(findClosest(dateOfBirth,dob))+
				Float.valueOf(findClosest(loanPurposeId,loanId));
		
		score = score /8;
		System.out.println(Float.toString(score));
		
	}
	String getScore(){
		return Float.toString(score);
	}
	TreeMap<Float,String> getTreeMap(Scanner s){
		TreeMap <Float,String> h= new TreeMap<Float,String>();
		//s.useDelimiter(",");
		while(s.hasNextLine()){
			String w=s.nextLine();
			String [] tokens = w.split(",");
			
			String key = tokens[0];
			System.out.println(key);
			String value= tokens[1];
			
			h.put(Float.valueOf(key), value);

		}
		return h;
	}
	
	public String findClosest(TreeMap<Float,String> h, String s){
		TreeMap<Float,String> map = h;
		if(s.isEmpty()) return "0";
		float l = Float.parseFloat(s);
		Map.Entry<Float,String> low = map.floorEntry(l);
		Map.Entry<Float,String> high = map.ceilingEntry(l);
		String res = "";
		if (low != null && high != null) {
			res = Math.abs(l-low.getKey()) < Math.abs(l-high.getKey())
					?   low.getValue()
							:   high.getValue();
		} else if (low != null || high != null) {
			res = low != null ? low.getValue() : high.getValue();
		}
		

		
		return res;
	}
	
	public float calculateScore() {
		
		return score;
	}
}
