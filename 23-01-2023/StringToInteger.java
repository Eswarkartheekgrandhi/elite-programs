class Solution {
    public int myAtoi(String s) {
        long res=0;
        boolean negative=false;
        boolean bound = false;
        int digit = 0;
        int sign=0;
        int i=0;
        if(s.length()<0)
        return 0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        } 
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-'){
                negative=true;
            }
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            digit++;
            res = res*10+s.charAt(i)-'0';
            if(Integer.MAX_VALUE<res){
                bound=true;
                break;
            }
            i++;
        }
        if(digit==0){
            return 0;
        }
        if(negative==true){
            if(bound==true){
                return Integer.MIN_VALUE;
            }
            return -(int)res;
        }
        if(bound==true){
            return Integer.MAX_VALUE;
        }
        return (int)res;

        
    }
}
