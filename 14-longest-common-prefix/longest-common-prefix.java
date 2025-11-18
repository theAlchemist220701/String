class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==1){
            return strs[0];
        }
        
        //This loop checks with first prefix 
        for(int i = 1 ; i<=strs[0].length();i++){
            boolean result=true;
            
            String temp = strs[0].substring(0,i);


            //This loop compares the prefix with other elements 
            for(int j=0;j<strs.length;j++){
                result = result&strs[j].startsWith(temp);
            }
            
            if(result==false){
                return (strs[0].substring(0,i-1));
            }

            



        }

    return strs[0];
        
        

      

        


        
    }
}