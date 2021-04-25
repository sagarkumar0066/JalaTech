package JavaIO;
import java.io.*;

// 5. Write a program to read text from .txt file using FileReader
// 6. Write a program to write text to .txt file using FileWriter

public class FileReaderWriter 
{
   public static void main(String args[]) throws Exception
   {
	  File f = new File("FileReaderWriter.txt"); 
	  
	  FileReaderWriter fr = new FileReaderWriter();
	  fr.write(f);
	  fr.read(f);
	  
   }
   public void write(File f) throws Exception
   {
	   FileWriter fw=new FileWriter(f);    
       fw.write("File reading writing by FileWriter and FileReader");    
       fw.close(); 
   }
   public void read(File f) throws Exception
   {
	   FileReader fr = new FileReader(f);    
        int i;
	   while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	           
 
       fr.close();
   }
}
