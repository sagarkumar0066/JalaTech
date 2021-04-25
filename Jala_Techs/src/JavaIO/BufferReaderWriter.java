package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// 7. Read text from a .txt file using BufferedReader
// 8. Write text to a .txt file using BufferedWriter

public class BufferReaderWriter 
{
	public static void main(String args[]) throws Exception
	   {
		  File f = new File("BufferReaderWriter.txt"); 
		  
		  BufferReaderWriter br = new BufferReaderWriter();
		  br.write(f);
		  br.read(f);
		  
	   }
	   public void write(File f) throws Exception
	   {
		    FileWriter fw = new FileWriter(f);  
		    BufferedWriter bw = new BufferedWriter(fw);  
		    bw.write("File writing and reading by BufferWriter and BufferReader");  
		    bw.close();   
	   }
	   public void read(File f) throws Exception
	   {
		   FileReader fr = new FileReader(f); 
		   BufferedReader br=new BufferedReader(fr);
	        int i;
		   while((i=br.read())!=-1)    
		          System.out.print((char)i); 
		   
		          br.close();
		          fr.close(); 
	 
	   }
}
