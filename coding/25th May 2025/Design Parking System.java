//Design Parking System
class ParkingSystem 
{
    int b, m, s;
    public ParkingSystem(int big, int medium, int small) 
    {
        b = big;
        m = medium;
        s = small;
    }
    
    public boolean addCar(int carType) 
    {
        if(carType == 1 && b != 0)
        {
            b--;
            return true;
        }
        if(carType == 2 && m != 0)
        {
            m--;
            return true;
        }
        if(carType == 3 && s != 0)
        {
            s--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
