import java.util.Scanner;
public class MinMax {
    static class pair{
        long first,second;
        public pair(long first,long second){
            this.first=first;
            this.second=second;
        }

    }
    static pair getMinMax(long a[],int n){
        long max=Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(a[i],min);
            max=Math.max(a[i],max);
        }
        pair p=new pair(min,max);
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        pair product=getMinMax(a, n);
        System.out.println(product.first+" "+product.second);
        sc.close();

    }
}
