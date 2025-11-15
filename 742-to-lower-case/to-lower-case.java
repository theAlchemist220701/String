class Solution {
    public String toLowerCase(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<s.length();i++){
           
            char lc = Character.toLowerCase(s.charAt(i));
            sb.append(lc); 
        }

        
        return sb.toString();
        
    }
}