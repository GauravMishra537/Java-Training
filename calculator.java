import java.util.Scanner;
public class calculator {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number =");
        float a=sc.nextInt();
        System.out.print("Enter second number =");
        float b=sc.nextInt();
        System.out.print("Enter 1 for addition\n");
        System.out.print("Enter 2 for multiplication\n"); 
        System.out.print("Enter 3 for subtraction\n");
        System.out.print("Enter 4 for divison\n");  
        System.out.print("Enter 5 for all condition\n"); 
        int c=sc.nextInt();
        switch(c){

        
        case 1:
        System.out.println("The sum of given no is "+(a+b));
        break;
        case 2:
        System.out.println("The product of given no is "+(a*b));
        break;
        case 3:
        System.out.println("The difference of no is "+(a-b));
        case 4:
        System.out.println("The quotient of two number is "+(a/b));
        break;
        case 5:
        System.out.println("The sum of given no is "+(a+b));
        System.out.println("The product of given no is "+(a*b));
        System.out.println("The difference of no is "+(a-b));
        System.out.println("The quotient of two number is "+(a/b));
        default:
        System.out.print("Wrong Input");
        }



    }
    
}
