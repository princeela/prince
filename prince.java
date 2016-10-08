public class arrayarrangement {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String ret="";
        int maxLen=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++) maxLen=Math.min(strs[i].length(),maxLen);
        for(int i=0;i<maxLen;i++){
            char cur=strs[0].charAt(i);
            int j;
            for(j=1;j<strs.length;j++)
                if(strs[j].charAt(i)!=cur)
                    break;
            if(j!=strs.length) break;
            ret +=cur;
        }
        return ret;
    }
}
