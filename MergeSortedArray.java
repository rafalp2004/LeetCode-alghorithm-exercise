public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=m; i<m+n; i++){
            nums1[i]=nums2[i-m];
        }

        //bubble sort
        int temp;
        for(int i=0; i<n+m; i++){
            for(int j=i; j<n+m; j++){
                if(nums1[i]>nums1[j]){
                    temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }

    }
}
