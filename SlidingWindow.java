public class SlidingWindow {
    public static void main(String[] args) {
        int a[]={1,8,30,-5,20,7};
        int n=a.length;
        int  k=4;int curr=0;
        for(int i=0;i<k;i++)
            curr+=a[i];
           int res=curr;
            for(int i=k;i<n;i++){
               curr+=a[i]-a[i-k];
               res=Math.max(res,curr); 
            }
            System.out.println(res);
        
    }
}
