class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        int arr1[]= new int[s1.length()];
        int arr2[]= new int [s2.length()];
        
        for(int i=0;i<s1.length();i++){
            arr1[i]=(int)s1.charAt(i);
            arr2[i]=(int)s2.charAt(i);
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean ans1=true;
        for(int i=0;i<s1.length();i++){
            if(arr1[i]>arr2[i])ans1= false;
            }
        boolean ans2=true;
         for(int i=0;i<s1.length();i++){
            if(arr1[i]<arr2[i])ans2= false;
            }
        
        return ans1||ans2;
    }
}