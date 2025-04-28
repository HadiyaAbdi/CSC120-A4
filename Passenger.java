public class Passenger implements PassengerRequirements {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    // add passenger to the car
    public void boardCar(Car c){
        if(c.addPassenger(this)){
            System.out.println(this.name + " boarded the car");
        }
        else{
            System.out.println("No room, Car is full");
        }}
        // remove passenger from the car
        
        public void getOffCar(Car c){
            if(c.removePassenger(this)){
                System.out.println(name + " got off the car");
            }
            else{
                System.out.println(name + "wasnt onboard and couldnt get off");
            }
        }
        // overide to print passenger's name
        @Override
        public String toString(){
            return name;

    }
}
