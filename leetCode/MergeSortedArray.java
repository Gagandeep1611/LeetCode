package leetCode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(m!=nums1.length){
            if(nums1[i]<nums2[j]){
                if(i==m){
                nums1[i]=nums2[j];
                j++;
                m++;
                }else{
                    i++;
                }
            }else if(nums1[i]>=nums2[j]){
                if (m - i >= 0) System.arraycopy(nums1, i, nums1, i + 1, m - i);
                nums1[i]=nums2[j];
                m++;
                j++;
                i++;
            }
        }
    }

    public static void main(String[] args) {
    int[] nums1={1,2,3,0,0,0};
    int m=3;
    int[] nums2={2,5,6};
    int n=3;
    MergeSortedArray lists=new MergeSortedArray();
    lists.merge(nums1,m,nums2,n);
    }
}
