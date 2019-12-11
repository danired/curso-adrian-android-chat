package edu.galileo.android.androidchat.lib;

/**
 * Created by Dani on 20/06/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
