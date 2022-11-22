import java.util.*;
public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1=0,p2=0;
        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer> merge=new  ArrayList<>();
        
        while(p1<n && p2<m){
            if(nums1[p1]<nums2[p2]){
                merge.add(nums1[p1]);
                p1++;
            }else {
                merge.add(nums2[p2]);
                p2++;
            }
        }
        while(p1<n){
            merge.add(nums1[p1]);
            p1++;
        }
        while(p2<m){
            merge.add(nums2[p2]);
            p2++;
        }
        int idx = merge.size()/2;
        if(merge.size()%2==1){
            
            return merge.get(idx)*1.00000;
        }
        
        double sum = merge.get(idx)*1.00000 + merge.get(idx-1)*1.00000;
        
        return sum/2;
        
    }
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2};
       System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
