class Solution {
  private static int MissinNumber(int[] arr){
    int x = arr[0];
    int n = arr.length;
    for(int i=1;i<n;i++) x ^=arr[i];
    for(int i=1;i<n+1;i++)  x^=i;
    // System.gc();
    return x;
}
  public static void main(String[] str) {
    int[] arr = new int[] {3,0,1};  
    int res = MissinNumber(arr);
    System.out.println(res);
}
}
