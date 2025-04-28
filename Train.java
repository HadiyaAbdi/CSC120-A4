import java.util.ArrayList;
public class Train implements TrainRequirements {
    private FuelType fuelType;
    private Engine engine;
    private ArrayList<Car> cars;

    // constructer to start the train, the cars and the engine
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.fuelType = fuelType; // <-- THIS is the missing line
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList<Car>();
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
        // starting the cars

        /*
 * for the Code below  i had an issue with "i < Cars" and assistance was provided by ChatGPT, an AI language model developed by OpenAI.
 * For more information, visit https://openai.com/chatgpt.
 */
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
        for(Car c: cars){
           c.printManifest();
            if(c.seatsRemaining() < c.getCapacity()){
            isEmpty = false;
            } 
            }
        if(isEmpty){
            System.out.println("No passengers in the train");
        }
    }

    public static void main(String[] args) {
        // Creates a new Train
        Train myTrain = new Train(FuelType.ELECTRIC, 50.0, 100.0, 3, 5);
    
        // Print some basic informations
        System.out.println("Max capacity of train: " + myTrain.getMaxCapacity());
        System.out.println("Seats remaining: " + myTrain.seatsRemaining());
    
        // Print empty manifest
        myTrain.printManifest();
    }}
    
