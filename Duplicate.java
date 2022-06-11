
package javaapplication6;
public class Duplicate {
    static Duplicate ob1;
    //for duplicate value
   public void duplicate(int a[]) { 
       int c = 0,n=a.length;
       //nested for loop
       for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(a[i]==a[j]){
               System.out.println(a[i]);
               //if a duplicate of array element is found,it will print a[i]
               c+=1;
                 System.out.println(c +" number duplicate value ");
             }
           }
        }
            if(c==0)
        {
            System.out.println("No duplicate valu in this array.");
        }
   }
    
}
