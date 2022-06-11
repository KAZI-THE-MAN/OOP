package javaapplication6;
public class LinearSearch {
    public void search(int a[],int searchele){

        int i;
        boolean found = false;
        for(i=0;i<a.length;i++){
            //a[i] == searchele  means statement is true and it will be executed
            if(a[i]==searchele){
                found = true;
                break;//if  condition true then break
            }
        }

        //found true  means  statement is executed 
        if(found){
            System.out.println(searchele +" found at the number "+i+" index in the array");
        }
        else{
            //if found not true  else statement is executed
            System.out.println(searchele+"  not found in array: ");
        }
    }

}
