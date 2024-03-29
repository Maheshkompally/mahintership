package internship;
import java.io.*;

import java.io.FileWriter;

public class WriteToFile {
	public static void main(String[] args) {
		try
		{
	FileWriter f=new FileWriter("C:\\Users\\mahes\\Desktop\\file2.txt");
				try
				{
					f.write("Assignment for freshers");
				}
finally
{
	f.close();
}
				System.out.println("Succesfully data wrote in File");
}
catch(IOException i)
{
	System.out.println(i);
}
	}
}

