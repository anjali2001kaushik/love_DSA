/**
 * FirstOccurence
 */
public class FirstOccurence {
    public static int binarySearch(int arr[],int l,int r,int target){
        if(l>r) return -1;
        int mid=l+(r-l)/2;int c=1;
        // if(arr[mid]==target){
            
            // while(arr[mid-c]==target)
            // c+=1;
            // return mid-c+1;
        // }
        if(arr[mid]>target)
        return binarySearch(arr, l, mid-1, target);
        if(arr[mid]<target) return binarySearch(arr, mid+1, r, target);
        else{
            if(mid== 0 || arr[mid-1]!=arr[mid]) return mid;
            else return binarySearch(arr, l, mid-1, target);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,4,4,4,4,4,5,6,6,6,7,7};
        int res=binarySearch(arr,0,arr.length-1,7);
        System.out.println(res);
        System.out.println(arr[res]);
    }
    
}