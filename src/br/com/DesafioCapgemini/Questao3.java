package br.com.DesafioCapgemini;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class Questao3 {
	
	
	public static int fatorial(int num) {

        if (num <= 1) {

            return 1;

        } else {

            return fatorial(num - 1) * num;

        }

    }

	
	public void geraSubstring(String teste) {
	
		Map<String,Integer> mapSubstring = new HashMap<String,Integer>();
		int quantAnagramas = 0;
		
		for(int i=0; i<=teste.length();i++) {
			for (int j=i+1; j<=teste.length(); j++) {
				char[] ch = teste.substring(i,j).toCharArray();
				Arrays.sort(ch);
				
				if(mapSubstring.containsKey(new String(ch))) {
					mapSubstring.put(new String(ch),mapSubstring.get(new String(ch))+1);
				}else {
					mapSubstring.put(new String(ch),1);
				}
				
			}	
		}
		
		for(Map.Entry<String, Integer> anagramas: mapSubstring.entrySet()) {
			if(anagramas.getValue()>=2) {
				quantAnagramas= quantAnagramas + fatorial(anagramas.getValue())/2;
				
			}
		
		}
		System.out.println(quantAnagramas);
	}
}	
