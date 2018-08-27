package com.yash.tddAssingmn;

public class PasswordVarification {
	
	public boolean checkPasswordNotNull(String getInputPassword){
		boolean passwordFlag=false;
		if(!getInputPassword.equals(null)){
			passwordFlag=true;			
		}
		return passwordFlag;
	}
	
	public boolean checkPasswordGreaterThan8Characters(String getInputPassword){
		boolean passwordFlag=false;
		if(getInputPassword.length() > 8){
			passwordFlag=true;			
		}
		return passwordFlag;
	}
	
	private String upperCaseMatch = "(.*[A-Z].*)";
	public boolean checkPasswordShouldAtleastOneUpperCase(String getInputPassword){
		boolean passwordFlag=false;
		if(getInputPassword.matches(upperCaseMatch)){
			passwordFlag=true;			
		}
		return passwordFlag;
	}
	
	private String lowerCaseMatch = "(.*[a-z].*)";
	public boolean checkPasswordShouldAtleastOneLowerCase(String getInputPassword){
		boolean passwordFlag=false;
		if(getInputPassword.matches(lowerCaseMatch)){
			passwordFlag=true;			
		}
		return passwordFlag;
	}
	private String numberMatch = "(.*[0-9].*)";
	public boolean checkPasswordShouldAtleastOneNumber(String getInputPassword){
		boolean passwordFlag=false;
		if(getInputPassword.matches(numberMatch)){
			passwordFlag=true;			
		}
		return passwordFlag;
	}
	
	public boolean varifyPassword(String getInputPassword){
		boolean nullStatus=checkPasswordNotNull(getInputPassword);
		boolean greaterStatus=checkPasswordGreaterThan8Characters(getInputPassword);
		boolean lowercaseStatus=checkPasswordShouldAtleastOneLowerCase(getInputPassword);	
		boolean uppercaseStatus=checkPasswordShouldAtleastOneUpperCase(getInputPassword);
		//boolean numberCaseStatus=checkPasswordShouldAtleastOneNumber(getInputPassword);
		if(nullStatus==true && greaterStatus==true && uppercaseStatus==true && lowercaseStatus==true){
			System.out.println("Password is OK!");
			return true;
		}else{
			System.out.println("Password is not OK!");
			 throw new RuntimeException("Password is not OK!");
		}
		
	}
}
