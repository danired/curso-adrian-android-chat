package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Dani on 16/08/2016.
 */
public interface ContactListInteractor {
    public void subscribeForContactEvents();
    public void unsubscribeForContactEvents();
    public void destroyContactListListener();
    public void removeContact(String email);
}
