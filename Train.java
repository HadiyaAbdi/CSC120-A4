import java.util.ArrayList;
public class Train implements TrainRequirements {
    private FuelType fuelType;
    private Engine engine;
    private ArrayList<Car> cars;

    // constructer to start the train, the cars and the engine
    public Train(FuelType fueltType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        // starting the engine
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        // starting the cars

        /*
 * for the Code below  i had an issue with "i < Cars" and assistance was provided by ChatGPT, an AI language model developed by OpenAI.
 * For more information, visit https://openai.com/chatgpt.
 */
        this.cars = new ArrayList<Car>();
        for(int i = 0; i < nCars; i++){
            this.cars.add(new Car(passengerCapacity));
        }
    }
    
    // Accessor methods
    @Override
    public Engine getEngine(){
        return this.engine;
    }
    @Override
    public Car getCar(int i){
            return cars.get(i);
    } 
    //returns the car's maximum capacity
    @Override
    public int getMaxCapacity(){
        int total = 0;
        for(Car c: cars){
            total += c.getCapacity();
        }
        return total;
    }  

    //returns the number of seats remaining in all of the cars
    @Override
    public int seatsRemaining(){
        int remainingSeats = 0;
        for(Car c: cars){
            remainingSeats += c.seatsRemaining();
        }
        return remainingSeats;
    }
    //print the manifest of all passengers in the train
    @Override
    public void printManifest(){
        boolean isEmpty = true;
        System.out.println("Train manifest");
        //ArrayList<Passenger> all = new ArrayList<Passenger>();

        for(Car c: cars){
           c.printManifest();
            if(c.seatsRemaining() < c.getCapacity()){
            isEmpty = false;
            } 
            //for (Passenger p: c.getPassengers()){
                //all.add(p);
            }
        if(isEmpty){
            System.out.println("No passengers in the train");
        }
       //if(!all.isEmpty()){
           // for(Passenger p: all){
            //    System.out.println(p);
          //  }} else{
           // System.out.println("No passengers in the train");
        }
    }

    
