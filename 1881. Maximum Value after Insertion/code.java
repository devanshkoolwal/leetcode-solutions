class Solution {
    public String maxValue(String n, int x) {
        StringBuilder ans=new StringBuilder();
        char arr[]=n.toCharArray();
        Integer k=new Integer(x);
        int check=0;
        if(arr[0]=='-'){
            ans.append('-');
            for(int i=1;i<arr.length;i++){
                if(Character.getNumericValue(arr[i])>x && check==0){
                   ans.append(k);
                    check=1;
                    ans.append(arr[i]);
                }
                else{
                    ans.append(arr[i]);
                }
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(Character.getNumericValue(arr[i])<x && check==0){
                    ans.append(k);
                    check=1;
                    ans.append(arr[i]);
                        
                }
                else{
                    ans.append(arr[i]);
                }
            }
        }
        
        if(check==0)
            ans.append(k);
        
        return ans.toString();
    }
}