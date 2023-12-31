//Minimum distance between two numbers


class Solution {
   int minDist(int a[], int n, int x, int y) {
        // code here
        int dis = Integer.MAX_VALUE;
        int xx = -1 , yy = -1;
        for(int i=0; i<n; i++){
            if(a[i] == x) xx = i;
            else if(a[i] == y) yy = i;
            
            if(xx != -1 && yy != -1){
                dis = Math.min(dis, Math.abs(xx - yy));
            }
        }
        if(dis == Integer.MAX_VALUE) return -1;
        return dis;
    }
}