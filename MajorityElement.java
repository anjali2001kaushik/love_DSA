/**
 * MajorityElement
 */
public class MajorityElement {

    public static void main(String[] args) {
        int a[]={2,3,4,2,5,2,2};
        int n=a.length;
        int count=1;
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==a[j])
            count++;
            else
            count--;
            if(count==0){
                count=1;
                j=i;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(a[j]==a[i])
            count++;
        }
        if(count>n/2)
        System.out.println(j);
        else 
        System.out.println(-1);
    }
}