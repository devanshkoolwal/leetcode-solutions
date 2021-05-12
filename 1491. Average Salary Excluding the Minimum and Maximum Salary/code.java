class Solution {
    public double average(int[] salary) {
        double sum=0;
        int min=Integer.MAX_VALUE;
        int max=0;
        
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
            if(salary[i]>max)
                max=salary[i];
            if(salary[i]<min)
                min=salary[i];
        }
        
        return (sum-min-max)/(salary.length-2);
            
            
    }
}