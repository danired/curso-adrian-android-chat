package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Dani on 16/08/2016.
 */
public interface ContactListRepository {
    public void signOff();
    public String getCurrentEmail();
    public void removeContact(String email);
    public void destroyContactListListener();
    public void subscribeForContactListUpdates();
    public void unsubscribeForContactListUpdates();
    public void changeUserConnectionStatus(boolean online);
}
