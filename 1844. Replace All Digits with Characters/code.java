class Solution {
    public String replaceDigits(String s) {
            
            char[] ch = s.toCharArray();
            for(int i=1;i<ch.length;i+=2){
                int value=(int) ch[i-1];
                int next=Character.getNumericValue(ch[i]);
                System.out.print(value);
                ch[i]=(String.valueOf((char)(value + next)).charAt(0));
            }
        return String.valueOf(ch);
    }
}