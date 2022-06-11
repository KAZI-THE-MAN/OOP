package javaapplication6;
public class MinimumMaximum {  
    //for maximum value
    public void Maximum(int[] a){ 
    int maxValue = a[0],n=a.length;
    //for loop 
    for(int i=0;i<n;i++){ 
      if(a[i] > maxValue){ 
         maxValue = a[i];        
      }
    }
        System.out.println(maxValue);               
}
     
//for minimum value
   public void Minimum(int[] a){ 
    int minValue = a[0],n=a.length; 
    //for loop 
    for(int i=0;i<n;i++){ 
      if(a[i] < minValue){ 
        minValue=a[i];       
      } 
    } 
      System.out.println(minValue);            
  } 
}
    

