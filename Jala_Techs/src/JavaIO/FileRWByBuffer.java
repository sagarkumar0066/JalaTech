package JavaIO;
import java.io.*;

// 3. Read text from a .txt file using BufferedInputStream
// 4. Write text to a .txt file using BufferedOutputStream

public class FileRWByBuffer 
{
   public static void main(String args[]) throws Exception
   {
	 File f = new File("BufferFile.txt"); 
	 
	 FileRWByBuffer fr = new FileRWByBuffer();
	 
	   fr.write(f);
	   fr.read(f);
   }
   public void read(File f) throws Exception
   {
	   FileInputStream fis = new FileInputStream(f);
	   BufferedInputStream bis = new BufferedInputStream(fis);
	         
	    int i;    
	    while((i=bis.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    bis.close();    
	    fis.close();  
   }
   public void write(File f) throws Exception
   {
	   FileOutputStream fos = new FileOutputStream(f);
	   BufferedOutputStream bos = new BufferedOutputStream(fos);
	   String s="Hello Jala Technologies..";    
	     byte b[]=s.getBytes();    
	     bos.write(b);    
	     bos.flush();    
	     bos.close();    
	     fos.close();    
	   
   }
}
