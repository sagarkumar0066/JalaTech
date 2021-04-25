package JavaIO;

import java.util.Properties;
import java.io.*;

// 9. Write a program to read data from properties file

public class ReadByPropertiesFile 
{
  public static void main(String args[]) throws Exception
  {
	  File f = new File("Properties.txt");
	  ReadByPropertiesFile rp = new ReadByPropertiesFile();
	  rp.write(f);
	  rp.read(f);
  }
  public void write(File f) throws Exception
  {
	  Properties p = new Properties();
	  OutputStream os = new FileOutputStream(f);
	  
	  p.setProperty("username", "sagar kumar");
	  p.setProperty("password", "sagar123456789");
	  
	  p.store(os, null);
  }
  
  public void read(File f) throws Exception
  {
	  Properties p = new Properties();
	  InputStream is = new FileInputStream(f); 
	  
	  p.load(is);
	  
	  p.list(System.out);
  }
}
