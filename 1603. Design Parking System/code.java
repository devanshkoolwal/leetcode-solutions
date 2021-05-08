class ParkingSystem {
    HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
    public ParkingSystem(int big, int medium, int small) {
        a.put(1,big);
        a.put(2,medium);
        a.put(3,small);
    }
    
    public boolean addCar(int carType) {
        
        if(a.get(carType)==0) return false;
        a.put(carType,a.get(carType)-1);
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */