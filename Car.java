import java.util.ArrayList;

public class Car implements CarRequirements {
    private int capacity;
    private ArrayList<Passenger> passengers;

    // Constructor
    public Car(int capacity){
        this.capacity = capacity;
        this.passengers = new ArrayList<Passenger>();
    }
    // Get the capacity of the car
    public int getCapacity(){
        return this.capacity;
    }
    // Get the number of remaining people
    public int seatsRemaining(){
        return this.capacity - passengers.size();
    }

    //add passengers
    public Boolean addPassenger(Passenger p){
        if(seatsRemaining() > 0 && !passengers.contains(p)){
            passengers.add(p);
            return true;
        }
            return false;
        }
        //remove passengers
        public Boolean removePassenger(Passenger p){
            if(passengers.contains(p)){
                passengers.remove(p);
                return true;
            }
            return false;
        }
        // print list of passengers or manifest
        public void printManifest(){
            if(passengers.isEmpty()){
                System.out.println("No passengers in the car");
            }
            else{
                System.out.println("Passengers aboard");
                for(Passenger p: passengers){
                    System.out.println(p); 
        }}}
        //Test the Car class
        public static void main(String[] args){
            Car myTrain = new Car(4);
            Passenger p1 = new Passenger("Hadiya");
            Passenger p2 = new Passenger("Hibaaq");
            Passenger p3 = new Passenger("Fadxi");
            myTrain.addPassenger(p1);
            myTrain.addPassenger(p2);

            myTrain.printManifest();

            myTrain.addPassenger(p3);
            myTrain.removePassenger(p2);
            myTrain.printManifest();
    }
}

