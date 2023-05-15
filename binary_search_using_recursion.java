public class binary_search_using_recursion {
    public static void main(String[] args) {
   
        int[] arr= {1,2,3,4,5,6,7,8,99};   //array declaration 
        int target =6;   //target 
         // we will create two pointers s= start , e= end
        int s=0;
        int e= arr.length-1;
        int ans= binsearch(arr,target,s,e);  // function call
        System.out.println(ans);
    }
    static int binsearch(int[] arr,int target,int s,int e) // the function
    {
       
        while(s>e){
            return -1;//not found
        }
      
            int mid= s + (e-s)/2;// slices the code in teo parts.
            if  ( arr[mid]>target){
               return binsearch(arr, target, s, mid-1);//recursion call 
            }
            else if (arr[mid]<target){
               return binsearch(arr, target, mid+1, e); //recursion call
            }else return mid;// else target == mid then retuen the mid thats the answer
        
    }
    
}

