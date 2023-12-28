//Common elements

class Solution2
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int f = 0 , s= 0 , t = 0;
        int le = -9999;
        
        while(f < n1 && s < n2 && t < n3) {
            int fe = A[f];
            int se = B[s];
            int te = C[t];
            
            if(fe == se && se == te) {
                if(le != fe) {
                    res.add(fe);
                    le = fe;
                    
                }
                f++;
                s++;
                t++;
            } else if(fe >=  se && fe > te) {
                if(se > te) {
                    t++;
                } else {
                    s++;
                }
            } else if(se >= fe && se > te) {
                if(fe > te) {
                    t++;
                } else {
                    f++;
                }
            } else {
                if(fe > se) {
                    s++;
                } else {
                    f++;
                }
            }
        }
        
        return res;
    }
}