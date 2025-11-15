class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){

            //Adding char in sb
                char c=s.charAt(i);
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }

            if(s.charAt(i)==' '){
                    sb.reverse();
                    res.append(sb);
                    sb.setLength(0);
                    res.append(' ');
                }

                


            
        }
        if(sb.length()!=0){
            sb.reverse();
            res.append(sb);
        }
                

                
        
        
        String result = res.toString();
        return result;

    }
}