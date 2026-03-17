import java.util.HashMap;

public class lengthoflongestsubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int mxlen=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left=Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            mxlen=Math.max(mxlen,right-left+1);
        }
        return mxlen;
    }
}
