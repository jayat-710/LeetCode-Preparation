class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int n= people.length;
        
        int j=0;
        int k=n-1;
        
        int sum=0;
        for(int i=0;i<people.length;i++){
           if(j>k){
               break;
           } 
            
           if(people[j]+people[k]==limit){
               j++;
               k--;
               count++;
           }
           else if(people[j]+people[k]>limit){
               count++;
               k--;
           }
            
            else{
               
                j++; k--;
                count++;
                
            }
            
            
            
            }
        
        return count;
        }
    }
