
public class Engine implements EngineRequirements{
// Attribute
private FuelType f;
private double currentFuellevel;
private double maxFuellevel;
/*@param f the fuel type of the engine
 * @param currentFuellevel the current fuel level of the engine
 * @param maxFuellevel the maximum fuel level of the engine
 */
public Engine(FuelType f, double currentFuellevel, double maxFuellevel){
    this.f = f;
    this.currentFuellevel = currentFuellevel;
    this.maxFuellevel = maxFuellevel;



}
public FuelType getFuelType(){
    return this.f;
}
public double getMaxFuel(){
    return this.maxFuellevel;
}

public double getCurrentFuel(){
    return this.currentFuellevel;
}
public void refuel(){
    this.currentFuellevel = this.maxFuellevel;

}

public Boolean go(){
    if(this.currentFuellevel > 0){
        this.currentFuellevel -= 1; // each go reduces the fuel level by 1 unit
        System.out.println("Remaining fuel:" + this.currentFuellevel);
        return true; // return true if there is fuell still left
        }
        else{
            System.out.println("Out of fuel");
            return false; // return false if there is no fuel.
        }
}
// Overide toString to print the status of the engine
@Override
public String toString(){
    return ("Engine has fuel type:" + this.f + " current fuel level:" + this.currentFuellevel + "and max fuel level:" + this.maxFuellevel); 
}

//main method to test the Engine class

public static void main(String[] args){
    Engine myEngine = new Engine(FuelType.ELECTRIC,40.0,100.0);
    // simulate the engine running until it runs out of fuel
    while (myEngine.go()){
        System.out.println("Choo Choo");
}
        System.out.println("Out of fuel");
}
}