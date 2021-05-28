class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] countArray = new int[1001];
		
        for(int i=0; i<arr1.length; i++){
            countArray[arr1[i]]++;
        }
        int index=0;
		for(int i=0; i<arr2.length; i++){
            Arrays.fill(arr1, index, (index +countArray[arr2[i]]), arr2[i]);
            index= index+countArray[arr2[i]];
            countArray[arr2[i]] = 0;
        }
        
		for(int i=0; i<countArray.length; i++){
            if(countArray[i] !=0){
                Arrays.fill(arr1, index, (index+countArray[i]), i);
                index= index+countArray[i];
            }
        }
        
        return arr1;
    }
}