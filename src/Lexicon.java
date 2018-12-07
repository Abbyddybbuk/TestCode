import java.io.*;
import java.util.*;

public class Lexicon {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);  
      String A=sc.next();
      String B=sc.next();
      
      int len = A.length() + B.length();
      System.out.println(len);
      
      int lex = A.compareTo(B);
      if (lex <= 0) {
    	  System.out.println("No");
      } else if (lex > 0) {
    	  System.out.println("Yes");
      } 
      
      char a1 = A.charAt(0);
      a1 = Character.toUpperCase(a1);
      
      StringBuilder fnlA = new StringBuilder(A);
      fnlA.setCharAt(0, a1);
      System.out.print(fnlA);
      System.out.print(" ");
      
      char b1 = B.charAt(0);
      b1 = Character.toUpperCase(b1);
      
      StringBuilder fnlB = new StringBuilder(B);
      fnlB.setCharAt(0, b1);
      System.out.println(fnlB);      
      

  }
}
