package BehaviourialPattern.Mediator;

public class Demo {
    public static void main(String[] args) {
        IATCMediator atcMediator=new ATCMediator();
        Flight flight=new Flight(atcMediator);
        Runway runway=new Runway(atcMediator);
        atcMediator.registerFlight(flight);
        atcMediator.registerRunway(runway);
        flight.getReady();
        runway.land();
        flight.land();
    }



}
