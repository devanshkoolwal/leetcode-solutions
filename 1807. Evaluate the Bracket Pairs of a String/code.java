class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        String ans="";
        String search="";
        
        char[] ch = s.toCharArray();
        Map<String,String> kn=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            kn.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='(')
                ans=ans.concat(String.valueOf(ch[i]));
            
            if(ch[i]=='('){
                for(int j=i+1;ch[j]!=')';j++){
                    search=search.concat(String.valueOf(ch[j]));
                    i++;
                }
                if(kn.containsKey(search)){
                    ans=ans.concat(kn.get(search));
                    search="";
                    i++;
                }
                else{
                    ans=ans.concat("?");
                    search="";
                    i++;
                }
            }
        }
       return ans;
    }
}