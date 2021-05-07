class Solution {
    public String truncateSentence(String s, int k) {
        char[] str=s.toCharArray();
        String a="";
        int count=0;
        
        for(int i=0;count<k && str.length>i;i++){
            if(str[i]==' '){
                count++;
                if(count==k)
                    return a;
            }
            a=a.concat(String.valueOf(str[i]));
        }
        return a;
    }
}