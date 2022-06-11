
package javaapplication6;
public class EvenOdd {
    static EvenOdd ob2;
    public void evodd(int a[]){//even number count
        int even=0,odd=0;
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0){//if a[i]%2==0 is true then even and add even numbers
           even+=a[i];
        }
        else{
           odd+=a[i];//if a[i]%2==0 is false then odd number and add odd numbers
        }
    }
        System.out.println("Total all the even number in the array is : "+even);
        System.out.println("Total of all the odd number in the array is : "+odd);
}
    
}
