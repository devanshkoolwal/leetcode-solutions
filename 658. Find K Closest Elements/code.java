class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> sortedArr = new ArrayList<Integer>();
        for (int num: arr) {
            sortedArr.add(num);
        }
        
        Collections.sort(sortedArr, (num1, num2) -> Math.abs(num1 - x) - Math.abs(num2 - x));
      
        sortedArr = sortedArr.subList(0, k);

        Collections.sort(sortedArr);
        return sortedArr;
    }
}