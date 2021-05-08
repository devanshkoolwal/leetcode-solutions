class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder a=new StringBuilder();
        HashMap<Integer,String> c=new HashMap<Integer,String>();
        for(int i=0;i<indices.length;i++)
            c.put(indices[i],Character.toString(s.charAt(i)));
        for(int i=0;i<indices.length;i++){
            a.append(c.get(i));
        }
        return a.toString();
    }
}