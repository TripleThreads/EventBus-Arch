import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Customer {
    Customer(EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPayment(Payment payment) {
        System.out.println("Customer: " + payment.getReceipt());
    }
}
