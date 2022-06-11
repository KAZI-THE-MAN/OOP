package javaapplication6;
public class Sum {
    static Sum ob4;
    public void arraysum(int a[]){   //array element sum
        int sum=0,n=a.length;
        //for loop
        for(int i=0;i<n;i++){
            sum+=a[i];//sum all array element           
            System.out.println("till index " +i+ " sum is : " + sum);
    }
}
}
        
