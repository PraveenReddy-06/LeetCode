class Solution {
    public int maximumSum(int[] arr) {
        if(arr.length == 0) return 0;

       int result = arr[0];
       int nodelete = arr[0];
       int onedelete = arr[0];
       
       for(int i =1 ; i < arr.length ; i++){
            onedelete = Math.max(onedelete +arr[i], nodelete);

            nodelete = Math.max(nodelete + arr[i], arr[i]);

            result = Math.max(nodelete,Math.max(onedelete,result));
       }
       return result;     
    }
}