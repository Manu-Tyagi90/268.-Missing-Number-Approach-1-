class Solution {
  private static int MissinNumber(int[] arr){
    int n = arr.length;
    int total = n*(n+1)/2;
    int sumArray = 0;
    for(int i=0;i<n;i++) 
          sumArray += arr[i];
    // System.gc();
    return total-sumArray;
}
  public static void main(String[] str) {
    int[] arr = new int[] {3,0,1};  
    int res = MissinNumber(arr);
    System.out.println(res);
}
}
