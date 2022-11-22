public class MinFlips {
    public static void main(String[] args) {
        int a[]={1,1,0,0,0,1,0,0,1,1,1,1,0};
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i]!=a[i-1]){
                if(a[i]!=a[0])
                System.out.print("From "+ i+"to");
                else 
                System.out.println(i-1);
            }
            
        }
        if(a[n-1]!=a[0])
            System.out.print(n-1);
    }
}
