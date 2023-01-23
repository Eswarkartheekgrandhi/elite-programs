class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        char[] ch = s.toCharArray();
        int n = ch.length;
        for(int i=0;i<n;i++){
            if(count.containsKey(ch[i])){
                count.put(ch[i],count.get(ch[i])+1);
            }
            else{
                count.put(ch[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(count.get(ch[i])<2){
                return i;
            }

        }
        return -1;
    }
}
