package com.jay.assorted;

import java.io.IOException;
import java.util.Arrays;

public class Input<T> {
	private T input;
	
	public static void main(String[] args) throws IOException {
		Input.readKeyboardInput();
	}

	public static void readKeyboardInput() throws IOException {
		
		byte data[] = new byte[100];
		System.out.print(">>");
		System.in.read(data);
		
		Input<String> in = new Input<>();
		in.setInput(Arrays.toString(data));
		
		
		System.out.println("input: " + in.getInput());
	}
	
	public T getInput() {
		return input;
	}

	public void setInput(T input) {
		this.input = input;
	}
	
}
