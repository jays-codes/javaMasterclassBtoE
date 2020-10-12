package com.jay.assorted;

public class ProcessAPITest {

	public static void main(String[] args) {
		
		ProcessHandle currProc = ProcessHandle.current();
		ProcessHandle.Info currProcInfo = currProc.info();
		System.out.println("Current Process: " + currProcInfo);
	}

}
