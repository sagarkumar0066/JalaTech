package JavaIO;

import java.io.*;

// 1. Write a program to read text from .txt file using InputStream
// 2. Write a program to write text to .txt file using OutputStream

public class FileReadWrite 
{
   public static void main(String args[]) throws Exception
   {
	   File f = new File("JT.txt");
	   
	   FileReadWrite frw = new FileReadWrite();
	   frw.write(f);
	   frw.read(f);
   }
   public void write(File f) throws Exception
   {
	   OutputStream os = new FileOutputStream(f);
	   DataOutputStream dos = new DataOutputStream(os);
	   
	   dos.writeUTF("Jala Technologies");
   }
   
   public void read(File f) throws Exception
   {
	   InputStream in = new FileInputStream(f);
	   DataInputStream dis = new DataInputStream(in);
	   
	   String str = dis.readUTF();
	   
	   System.out.println(str);
   }
}
