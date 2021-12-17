class Solution {
    public int maxNumberOfFamilies(int n, int[][] arr1) {
        HashMap<Integer,ArrayList<Integer>> map= new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int arr[]:arr1){
            map.put(arr[0],new ArrayList<>());
        }
        
        for(int i=0;i<arr1.length;i++){
            map.get(arr1[i][0]).add(arr1[i][1]);
        }
        int count=2*n;
        
        for(int x :map.keySet()){
            count-=2;
            System.out.println(x);
            ArrayList l =new ArrayList<>();
            l=map.get(x);
            
            boolean first=true;
            boolean second=true;
            boolean third=true;
            
            for(int k=0;k<l.size();k++){
                int j=map.get(x).get(k);
                System.out.println("-->>"+j);
              if(2<=j && j<=5)first=false;
                if(4<=j && j<=7)second=false;
                if(6<=j && j<=9)third=false;
            }
            
            if(first)count++;
            if(second)count++;
            if(third)count++;
            
            if(first && second && third)count--;
           else if(first && second)count--;
           else if(second && third)count--;
            System.out.println("-->>count="+count);
        }
        
        return count;
    }
}