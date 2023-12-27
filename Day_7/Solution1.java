//Maximize sum(arr[i]*i) of an Array

class Solution1{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);

        long ans=0;

        for(long i=0;i<n;i++){

            ans+=(arr[(int)i]*i);

            ans=ans%1000000007;

        }

        return (int)ans%1000000007;
    }   
}