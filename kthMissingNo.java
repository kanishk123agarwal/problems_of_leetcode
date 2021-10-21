package leetCode;

public class kthMissingNo {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k= 5;
        int ans = findKthPositive(arr,k);
        System.out.println(ans);
    }

    static int findKthPositive(int[] arr, int k) {
        int[] count = new int[1000];
        count = new int[]{-1};
        int[] ans = new int[k+1];

        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]=1;
        }
        int j=0;
        for(int i=0;i<1000/2;i++)
        {
            if(count[i]==-1){
                ans[j] = i;
                j++;
            }
        }
        return ans[k];
    }
}
