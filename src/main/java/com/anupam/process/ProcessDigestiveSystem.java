package com.anupam.process;

import java.util.Arrays;
import java.util.List;

public class ProcessDigestiveSystem implements IProcessICD{

	public List<String> IcdCodes() {
		return Arrays.asList("K300","K301","K302","K303","K304");
	}

	public void ProcessRecord() {
		System.out.println("process ICD code for digestive system disorder");
		
	}

}
