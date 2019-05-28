import org.greenrobot.eventbus.EventBus;

/*
* this class provides Event-Bus for subscribers. We make sure that it is singleton and only
* one provider is available for subscribers
* */
class EventBusFactory {
    private static EventBus eventBus = EventBus.getDefault();

    static EventBus getEventBus() {
        return eventBus;
    }
}
