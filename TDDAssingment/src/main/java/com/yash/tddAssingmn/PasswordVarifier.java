package com.yash.tddAssingmn;

public class PasswordVarifier {
	String upperCaseMatch = "(.*[A-Z].*)";
	String lowerCaseMatch = "(.*[a-z].*)";
	String numberMatch = "(.*[0-9].*)";

	public boolean passwordValidation(String Inputpassword) {
		/*boolean valid = false;
		if (Inputpassword == null) {
			valid = true;
			return valid;
			//throw new NullPointerException("Password should not be null.");
			
		} else if (Inputpassword.length() < 9) {
			valid = true;
			return valid;
			//throw new RuntimeException("password length should be greater than 8 character");
		} else if (!Inputpassword.matches(upperCaseMatch)) {
			valid = true;
			return valid;
			//throw new RuntimeException("Password should atleast one upperCase");
		} else if (!Inputpassword.matches(lowerCaseMatch)) {
			valid = true;
			return valid;
			//throw new RuntimeException("Password should atleast one lowerCase");
		} else if (!Inputpassword.matches(numberMatch)) {
			valid = true;
			return valid;
			//throw new RuntimeException("Password should atleast one number");
		} 
		return valid;
	}

	public boolean passwordValidationNullTest(String password) {
		if (password.equals(null) && password != null) {
			System.out.println("password is null");
			return true;
		} else {
			System.out.println("password is not null");
			return false;
		}

	}*/
		
		
		boolean valid=false;
		  boolean nullPassword = false;
		  boolean greaterPassword = false;
		  boolean lowercasePassword = false;
		  boolean upperCasePassword = false;
		  boolean numberPassword = false;
		  if (!Inputpassword.equals(null) )
          {
                  System.out.println("Password should not be null");
                  nullPassword = true;
                //  System.out.println("status: "+valid);
                  return nullPassword;
          }
          if ( Inputpassword.length() < 9)
          {
                  System.out.println("Password should be more than 8 characters in length.");
                  greaterPassword = true;
                  return greaterPassword;
          }
         
          String upperCaseChars = "(.*[A-Z].*)";
          if (!Inputpassword.matches(upperCaseChars ))
          {
                  System.out.println("Password should contain atleast one upper case alphabet");
                  upperCasePassword = true;
                  return upperCasePassword;
          }
          String lowerCaseChars = "(.*[a-z].*)";
          if (!Inputpassword.matches(lowerCaseChars ))
          {
                  System.out.println("Password should contain atleast one lower case alphabet");
                  lowercasePassword = true;
                  return lowercasePassword;
          }
          String numbers = "(.*[0-9].*)";
          if (!Inputpassword.matches(numbers ))
          {
                  System.out.println("Password should contain atleast one number.");
                  numberPassword = true;
                  return numberPassword;
          }
		return valid;
  }
		
		
		
		
		
}

