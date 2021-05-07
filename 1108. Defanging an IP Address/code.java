class Solution {
    public String defangIPaddr(String address) {
        
        StringBuilder as=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                as.append("[.]");
            }
            else
                as.append(address.charAt(i));
        }
        return as.toString();
        }
    }
