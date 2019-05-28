/**
 * In this project I will use EventBus architecture
 *      - An EventBus is a mechanism that allows different components to communicate with each other
 *      without knowing about each other.
 *      A component can send an Event to the EventBus without knowing who will pick it up or how many
 *      others will pick it up
 *
 * This project will simulate a payment system that sends a receipt to both sellers and customers
 * when payment process is done.
 * */
public class EventBusDemo {

    public static void main(String[] args) {
        new Seller(EventBusFactory.getEventBus());
        new Customer(EventBusFactory.getEventBus());
        EventBusFactory.getEventBus().post(new Payment("Payment successful receipt is sent"));
    }

}
