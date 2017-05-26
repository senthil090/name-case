/*
 * File:			NameCase.java 
 * Created:			5/26/2017
 * Last Updated:	5/26/2017 10:47 AM
 * Author:			Evan Vinciguerra
 * Github:			https://github.com/evanvin/name-case
 * 
 * This code is copyright (c) 2017 Evan Vinciguerra
 * 
 */

package formatter;

public class NameCase {

	private String name;
	
	public NameCase(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String format(){
		String input = this.name;
		String output = this.name;
		
		//if name is all lower/upper case, format the name and return, otherwise, return as is
		if( input.equals(input.toLowerCase()) || input.equals(input.toUpperCase()) ){
			output = output.trim().toLowerCase();
			
			RegExHelper helper = new RegExHelper(output);
			helper.split();
			helper.handleMcMac();
			helper.handleLocalExceptions();
			output = helper.getName();
		}
		
		return output;
	}
	
	
	
}
