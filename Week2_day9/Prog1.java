import java.util.Scanner;
public class Prog1 {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a integer:");
    int number=sc.nextInt();
    int divsion=0;
    
    while(number>1)
      {
        if(number>=1000)
        {
          divsion=divsion%1000;
          System.out.println("M");
          divsion--;
        }
      }
     else if(number>=500){
        division=number/500;
        while(division>0){
          System.out.print("D");
          division--;
        }
        number=number%500;
      }
      else if(number>=100){
        division=number/100;
        while(division>0){
          System.out.print("C");
          division--;
        }
        number=number%100;
      }
      else if(number>=90){
        division=number/90;
        while(division>0){
          System.out.print("XC");
          division--;
        }
        number=number%90;
      }
      else if(number>=50){
        division=number/50;
        while(division>0){
          System.out.print("L");
          division--;
        }
        number=number%50;
      }
      else if(number>=40){
        division=number/40;
        while(division>0){
          System.out.print("XL");
          division--;
        }
        number=number/40;
      }
      else if(number>=10){
        division=number/10;
        while(division>0){
          System.out.print("X");
          division--;
        }
        number=number/10;
      }
      else if(number>=9){
        division=number/9;
        while(division>0){
          System.out.print("IX");
          division--;
        }
        number=number/9;
      }
      else if(number>=5){
        division=number/5;
        while(division>0){
          System.out.print("X");
          division--;
        }
        number=number/5;
      }
      else if(number>=4){
        division=number/4;
        while(division>0){
          System.out.print("IV");
          division--;
        }
        number=number/4;
      }
      else{
        division=number;
        while(division>0){
          System.out.print("I");
          division--;
        }
        number=0;
      }
    }
    
    
  }
}