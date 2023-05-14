 public class BinSearch {
    public static void main(String[] args) {
   
        int[] arr= {1,2,3,4,5,6,7,8,99};   //array declaration 
        int target =99;   //target 
        int ans= binsearch(arr,target);  // function call
        System.out.println(ans);
    }
    static int binsearch(int[] arr,int target) // the function
    {
        // we will create two pointers s= start , e= end 
        int s = 0; //initially
        int e= arr.length -1;//initially
        while(s<=e)
        {
            int mid= s + (e-s)/2;// slices the code in teo parts.
            if  ( arr[mid]>target){
                e= mid-1;//target must lie in the left side of slice so end = mid-1
            }
            else if (arr[mid]<target){
                s=mid+1;// target must lie in the right side of slice so start = mid+1
            }else return mid;// else target == mid then retuen the mid thats the answer
        };
        return -1; 
    }
    
 }
