package edu.ecnu.sei.st;

public class JenkinsGradleDemoClass {
	
	public int absSum(Integer op1, Integer op2) {
	
	
		 String op1_string= op1.toString();
		 
		 if((op1 == null) && (op2 == null)){
				return 0;
			}
			
			
			if((op1 == null) &&( op2 != null)){
				return Math.abs(op2);
			}
			

			if(op2 == null) {
				return Math.abs(op1);
			}
			
			return Math.abs(op1)+Math.abs(op2);
		}
}
