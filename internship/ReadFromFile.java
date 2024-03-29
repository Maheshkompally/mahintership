package internship;

	import java.io.*;

	public class ReadFromFile {
	    public static void main(String[] args) throws IOException {
	    	FileReader r=new FileReader("C:\\Users\\mahes\\Desktop\\file1.txt");
	    	int i;
	    	while((i=r.read())!=-1)
	    	{
	    		System.out.print((char)i);
	    	}
	    	r.close();
	    }
	}