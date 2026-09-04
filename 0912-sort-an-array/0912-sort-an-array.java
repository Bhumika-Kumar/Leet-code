class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    private void mergesort(int[] arr,int left,int right){
        if(left<right){
            int mid= left+ (right-left)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    private static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] l1=new int[n1];
        int[] l2=new int[n2];

        for(int i=0;i<n1;i++){
            l1[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            l2[j]=arr[mid+1+j];
        }
        int i=0,j=0,counter=left;
        while(i<n1 && j<n2){
            if(l1[i]<l2[j]){
                arr[counter]=l1[i];
                i++;
            } else{
                arr[counter]=l2[j];
                j++;
            }
            counter++;
        }
        while(i<n1){
            arr[counter++]=l1[i];
            i++;
        }
        while(j<n2){
            arr[counter++]=l2[j];
            j++;
        }
    }

}