import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;



class Main{
	public static void main(String[] args){
		
      int first,second,test=0;
      Scanner k = new Scanner(System.in);
      first = (int)(Math.random()*3);
      second = (int)(Math.random()*3);
      while(test==0){
      System.out.println("Enter 1 =");
      int player1 = k.nextInt();
      System.out.println("Enter 2 =");
      int player2 = k.nextInt();
      if(player1==first&&player2==second){
      test++;}
      else if(player1==first&&player2!=second){
      System.out.println("pervi right");
      }
      else if(player1!=first&&player2==second){
      System.out.println("vtoroi right");
      }
      else{
      System.out.println("totally wrong");
      }
      }
	}
}

  
 