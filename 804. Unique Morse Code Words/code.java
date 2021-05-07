class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String code[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<Integer,String> str=new HashMap<Integer,String>();
        int count=0;
        for(String w:words){
            StringBuilder s=new StringBuilder();
            for(char letter:w.toCharArray()){
                s.append(code[letter-'a']);
            }
            if(!str.containsValue(s.toString())){
               
                str.put(count,s.toString());
                count++;
            }
        }
        return count;
        
    }
}