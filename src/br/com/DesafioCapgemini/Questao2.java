package br.com.DesafioCapgemini;

import java.util.Scanner;

public class Questao2 {
	
	public static int checkPassword(String pass){
	    int count = 0;
	    
	    if(!pass.matches("(.*[a-z]+.*)")){
	        count++;
	    }
	    
	    if(!pass.matches("(.*[A-Z]+.*)")){
	        count++;
	    }
	    
	    if(!pass.matches("(.*[0-9]+.*)")){
	        count++;
	    }
	    
	    if(!pass.matches("(.*[\\!\\@\\#\\$%\\^\\&\\*\\(\\)\\-\\+]+.*)")){
	        count++;
	    }
	    
	    return Math.max(count,6 - pass.length());
	}
}
