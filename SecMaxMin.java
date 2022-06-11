package javaapplication6;
public class SecMaxMin {
     public void secondMax(int arr[]){ //for second max search
        int n=arr.length,temp;
        //nested for loop
        for (int i=0; i<n; i++)   
        {  
            for (int j = i+1; j<n; j++)   
            {  
                if (arr[i] > arr[j])   
                {  //swapping
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
        System.out.println("Second Maximum element in the array is : "+arr[n-2]);
    }
    
     public void secondMin(int arr[]){ //for second min search
        
        int temp,n=arr.length,i,j;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {//swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            
            }
        }
        System.out.println("Second minimum element of array is: "+arr[1]);
    }
    
    
}
