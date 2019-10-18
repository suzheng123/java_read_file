// "/files/web_info"
import java.io.*; 

public class GetInfo 
{ 
  public static void main(String[] args)throws Exception 
  { 

  File file = new File("files/sometxt"); 
  
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  
  String st; 
  while ((st = br.readLine()) != null) 
    System.out.println(st); 
  } 
} 