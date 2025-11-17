class Solution {
    public boolean isPalindrome(String s) {

        String clean = s.replaceAll("[^A-Za-z0-9]","");

        if (clean.length()==0||clean.length()==1){return true;}
        
        StringBuilder sb = new StringBuilder();

        

        for(int i=0 ;i<clean.length();i++){

            if(clean.charAt(i)==' '){
                continue;
            }

            sb.append(Character.toLowerCase(clean.charAt(i)));


        }

        boolean result = true ;
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)==sb.charAt(j)){
                result = result&&true ;
            }

            else return false ;

            i++;
            j--;
        }


        return result ;
     

    }
}