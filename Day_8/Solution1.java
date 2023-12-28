//443. String Compression

class Solution1 {
    public int compress(char[] chars) {
        
        
        int cnt = 1;

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < chars.length; i++) {
             char cur = chars[i];
             char pre = chars[i - 1];

             if(cur == pre) {
                 cnt++;
             } else {
                sb.append(pre);
                 if(cnt > 1) {
                    sb.append(cnt);
                 }
                 
                 
                 cnt = 1;

                //  sb.append(cur);
             }
        }

        sb.append(chars[chars.length -1]);

        if(cnt > 1) {
            sb.append(cnt);
        }

        for(int i = 0; i < sb.length(); i++) {
              chars[i] = sb.charAt(i);
        }

        // System.out.println(sb.toString());

        return sb.length();
    }
}