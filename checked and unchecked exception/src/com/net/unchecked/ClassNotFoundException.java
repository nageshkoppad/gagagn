package com.net.unchecked;
import java.io.*;
public class ClassNotFoundException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 // Reading file from path in local directory
        FileReader file = new FileReader("C:\\test\\a.txt");
 
        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);
 
        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
 
        // Closing file connections
        // using close() method
        fileInput.close();
	}

}
