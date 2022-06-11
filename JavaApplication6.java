package javaapplication6;
import java.util.Scanner;
import static javaapplication6.Duplicate.ob1;
import static javaapplication6.EvenOdd.ob2;
import static javaapplication6.Sum.ob4;
public class JavaApplication6{
    public static void main(String[] args){
        // TODO code application logic here
        Scanner s=new Scanner(System.in);//System.in is passed as a parameter in Scanner class
       int a[]={10,12,34,56,67,81,81,90,90,96,97};//array elements
       int CaseValue=s.nextInt();//Scans the next token of the input as an int
       switch(CaseValue){
           case 1 -> {                    
                    //Create  object for LinearSearch
                    LinearSearch ob= new LinearSearch();
                    System.out.println("which element do you want to search ? ");
                    int SearchInArray = s.nextInt();                  
                    ob.search(a, SearchInArray);

                }
           case 2 -> {               
               Duplicate.ob1=new Duplicate();//duplicat public class
               ob1.duplicate(a);//print duplicate elements with their index
            }
           case 3 -> {         
               EvenOdd.ob2=new EvenOdd();//even and odd public class
               ob2.evodd(a);//print Total all the even number and the odd number
            }
            case 4 -> {            
                MinimumMaximum ob=new MinimumMaximum(); //MinimumMaximum public class
                //call object class
                ob.Maximum(a);//maximum value print
                ob.Minimum(a);//minimum value print
            }
            case 5 -> {
                //create object
                SecMaxMin ob3 = new SecMaxMin();
                //call object method 
                ob3.secondMax(a);//secondmaximum value print
                ob3.secondMin(a);//secondminimum value print
            }
                
           
           case 6 -> {
               
               Sum.ob4=new Sum();
               //call object method
               ob4.arraysum(a);//print the sum of array element 
            }
           case 7 -> System.exit(0);//for exit
           default -> System.out.println("you choose invalid case value! case number is valid for integer 1 to 7 , please choose valid one");// if user choose wrong casevalue    
    }
   }
}
