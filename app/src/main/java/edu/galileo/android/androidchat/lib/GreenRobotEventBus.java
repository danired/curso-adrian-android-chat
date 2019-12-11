package edu.galileo.android.androidchat.lib;

/**
 * Created by Dani on 20/06/2016.
 */
public class GreenRobotEventBus implements EventBus {

    private org.greenrobot.eventbus.EventBus eventBus;

    private static class SingletonHolder {
        private static final GreenRobotEventBus INSTANCE = new GreenRobotEventBus();
    }

    public static GreenRobotEventBus getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public GreenRobotEventBus() {
        this.eventBus = org.greenrobot.eventbus.EventBus.getDefault();
    }

    @Override
    public void register(Object subscriber) {
        this.eventBus.register(subscriber);
    }

    @Override
    public void unregister(Object subscriber) {
        this.eventBus.unregister(subscriber);
    }

    @Override
    public void post(Object event) {
        this.eventBus.post(event);
    }
}
