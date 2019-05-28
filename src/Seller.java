import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Seller {


    Seller(EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPayment(Payment message) {
        System.out.println("Seller: " + message.getReceipt());
    }
}
