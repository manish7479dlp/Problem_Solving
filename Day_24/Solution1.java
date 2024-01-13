/*

Given a keypad as shown in the diagram, and an N digit number which is represented by array a[ ], the task is to list all words which are possible by pressing these numbers.

*/
class Solution1
{
    //Function to find list of all words possible by pressing given numbers.
    
    static ArrayList<String> f(int arr[] , int n , String[] key , int idx) {
        if(idx == n - 1) {
            ArrayList<String> temp = new ArrayList<>();
            
            for(char ch : key[arr[idx]].toCharArray()) {
                temp.add(ch + "");
            }
            
        
            return temp;
        }
        
        
        ArrayList<String> tres = f(arr , n , key , idx + 1);
        ArrayList<String> result = new ArrayList<>();
        
        
        
            for(char ch : key[arr[idx]].toCharArray()) {
                
                for(String str : tres) {
                   result.add(ch + str);
                    
                }

            }

        
                // System.out.println(result.size());
        
        return result;
        
    }
    
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        String[] key = new String[] {"" ," " ,"abc" , "def" , "ghi" , "jkl" , "mno", "pqrs", "tuv" , "wxyz"};
        
        return f(a , N , key , 0);
    }
}