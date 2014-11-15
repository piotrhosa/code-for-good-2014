import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class LoanApplicant {

	String firstName, lastName, middleName, dateBirth, activationDate, phoneNumber, mobileNumber, loanOfficer, 
	state, town, address, loanPurpose, principalAmount, interest;


	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param middleName
	 * @param dateBirth
	 * @param activationDate
	 * @param phoneNumber
	 * @param mobileNumber
	 * @param loanOfficer
	 * @param state
	 * @param town
	 * @param address
	 * @param loanPurpose
	 * @param principalAmount
	 */
	public LoanApplicant(String firstName, String lastName, String middleName, String dateBirth, String activationDate, 
			String phoneNumber, String mobileNumber, String loanOfficer, String state, String town, String address, 
			String loanPurpose, String principalAmount, String interest) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.dateBirth = dateBirth;
		this.activationDate = activationDate;
		this.phoneNumber = phoneNumber;
		this.mobileNumber = mobileNumber;
		this.loanOfficer = loanOfficer;
		this.state = state;
		this.town = town;
		this.address = address;
		this.loanPurpose = loanPurpose;
		this.principalAmount = principalAmount;
		this.interest=interest;

	}

	//Setters for 

	public String getFirstName() {return firstName;}

	public String getLastName() {return lastName;}
	
	public String getMiddleName() {return middleName;}

	public String getDateOfBirth() {return dateBirth;}

	public String getActivationDate() {return activationDate;}

	public String getPhoneNumber() {return phoneNumber;}
	
	public String getMobileNumber() {return mobileNumber;}
	
	public String getLoanOfficer() {return loanOfficer;}
	
	public String getState() {return state;}
	
	public String getTown() {return town;}
	
	public String getAddress() {return address;}
	
	public String getLoanPuropse() {return loanPurpose;}
	
	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getPrincipalAmount() {return principalAmount;}



}
