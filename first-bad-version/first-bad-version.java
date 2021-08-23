/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int temp=1; int i=1; int j=n;
       while(i<=j){
        int mid=i+(j-i)/2;
           
           if(isBadVersion(mid) && !isBadVersion(mid-1))
               return mid;
           
         if (isBadVersion(mid)){
             temp=mid;
             j=mid-1;
         }
        else{
            i=mid+1;
        }
        
    }  return -1;
       }
       
    }
   
