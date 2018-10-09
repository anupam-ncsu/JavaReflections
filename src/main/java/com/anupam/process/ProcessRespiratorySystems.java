package com.anupam.process;

import java.util.Arrays;
import java.util.List;

public class ProcessRespiratorySystems implements IProcessICD{

	public List<String> IcdCodes() {
		return Arrays.asList("J200","J201","J202","J203","J204");
	}

}
