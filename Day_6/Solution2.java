//Arranging the array

    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        int pointer1=0;
        for(int pointer2=0;pointer2<n;pointer2++){
            
            if(a[pointer2]<0){
                if(pointer1 != pointer2){
                    int temp=a[pointer2];
                    for(int i=pointer2;i>pointer1;i--){
                        a[i]=a[i-1];
                    }
                    a[pointer1]=temp;
                }
                pointer1++;
            }
        }
    }
}