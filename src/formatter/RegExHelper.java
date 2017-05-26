/*
 * File:			RegExHelper.java 
 * Created:			5/26/2017
 * Last Updated:	5/26/2017 10:50 AM
 * Author:			Evan Vinciguerra
 * Github:			https://github.com/evanvin/name-case
 * 
 * This code is copyright (c) 2017 Evan Vinciguerra
 * 
 */

package formatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import constants.NameCaseConstants;

public class RegExHelper {
	
	private String name;
	
	public RegExHelper(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void split(){
		String output = this.name;
		if(output.length() >= 2){
			output = output.toUpperCase().charAt(0) + output.substring(1);
		}
		else{
			output = output.toUpperCase();
		}
		
		for(int i = 0; i < NameCaseConstants.NAME_SPLITS.length; i++){
			String[] parts = this.name.split(NameCaseConstants.NAME_SPLITS[i][0]);
			if(parts.length > 1){
				output = "";
				for(int j = 0; j < parts.length; j++){
					if(parts[j].length() >= 2){
						parts[j] = parts[j].toUpperCase().charAt(0) + parts[j].substring(1);
					}
					else if(parts[j].length() == 1){
						parts[j] = parts[j].toUpperCase();
					}
					
					output += parts[j];
					if(j < parts.length-1){
						output += NameCaseConstants.NAME_SPLITS[i][1];
					}
				}
			}
		}
		this.name = output;
	}
	
	public void handleMcMac(){
		String output = this.name;
		if(Pattern.compile("\\bMac[A-Za-z]{2,}[^aciozj]\\b").matcher(output).find() ||
				Pattern.compile("\\bMc").matcher(output).find()){
			Matcher m = Pattern.compile("\\b(Ma?c)([A-Za-z]+)").matcher(output);
			while(m.find()){
				if(m.group(2).length() >= 2){
					output = m.group(1) + m.group(2).toUpperCase().charAt(0) + m.group(2).substring(1);
				}
				else if(m.group(2).length() == 1){
					output = m.group(1) + m.group(2).toUpperCase();
				}
			}
			
			//Mac Exceptions
			for(String[] exp : NameCaseConstants.MAC_EXCEPTIONS){
				output = output.replaceAll(exp[0], exp[1]);
			}
			
		}
		
		//Odd Mac Exceptions
		for(String[] exp : NameCaseConstants.ODD_MAC_EXCEPTIONS){
			output = output.replaceAll(exp[0], exp[1]);
		}
		
		this.name = output;
	}
	
	public void handleLocalExceptions(){
		String output = this.name;
		for(String[] exp : NameCaseConstants.LOCAL_EXCEPTIONS){
			output = output.replaceAll(exp[0], exp[1]);
		}
		this.name = output;
	}
}
