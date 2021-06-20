class Solution {
    public int numberOfRounds(String startTime, String finishTime) {
        int sh=Integer.valueOf(startTime.substring(0,2));
        int sm=Integer.valueOf(startTime.substring(3));
        
        int eh=Integer.valueOf(finishTime.substring(0,2));
        int em=Integer.valueOf(finishTime.substring(3));
        int h=0;
        int r=0;
        int add=0;
        
        if(eh==sh && sm>em)
            h=24;
        else if(eh>=sh){
            h=eh-sh;
        }
        else{
            h=(24-sh)+eh;
        }
        if(sm>0 && sm<=15)
                r=1;
        if(sm>15 && sm<=30)
            r=2;
        if(sm>30 && sm<=45)
            r=3;
        if(sm>45 && sm<=60)
            r=4;
        if(em>=15 && em<30)
            add=1;
        if(em>=30 && em<45)
            add=2;
        if(em>=45 && em<60)
            add=3;
        if(eh==sh && sm<em)
            return r;
                
        return add+(h*4)-r;
        
    }
}