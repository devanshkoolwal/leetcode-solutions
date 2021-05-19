class Solution {
    public String[] findWords(String[] words) {
        
        
        String a[]={"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            
            String cha=a[0];
            if(a[1].indexOf(words[i].charAt(0))>=0){
                cha=a[1];
            }
            else if(a[2].indexOf(words[i].charAt(0))>=0){
                cha=a[2];
            }
            
            
            boolean val=true;
            for(int k=1;k<words[i].length();k++){
                if(cha.indexOf(words[i].charAt(k))==-1){
                    val=false;
                    break;
                }
            }
            
            if(val){
                ans.add(words[i]);
            }
        }
        
        String ansa[]=new String[ans.size()];
        ansa=ans.toArray(ansa);
        return ansa;
        
    }
    
    
}