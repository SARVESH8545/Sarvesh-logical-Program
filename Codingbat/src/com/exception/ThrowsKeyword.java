package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr= new FileReader("E:\\DesktopFrontFolder\\DS.txt");
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());
		Thread.sleep(2000);

	}

}
