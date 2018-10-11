package com.anupam.process;

import java.util.Arrays;
import java.util.List;

public class ProcessCirculatorySystem implements IProcessICD{
	
	
	
	


	public List<String> IcdCodes() {
		return Arrays.asList("I100","I101","I102","I103","I104");
	}

	public void ProcessRecord() {
		System.out.println("process ICD code for circulatory system disorder");
		
	}

}
