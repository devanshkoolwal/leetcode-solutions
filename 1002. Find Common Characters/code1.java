class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans=new ArrayList<String>();
        for(char a:words[0].toCharArray()){
            boolean flag=false;
            for(int i=1;i<words.length;i++){
                int index=words[i].indexOf(a);
                if(index>=0){
                  words[i]=words[i].substring(0, index) + words[i].substring(index + 1);
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            
            if(flag){
                ans.add(String.valueOf(a));
            }
        }
        return ans;
    }
}