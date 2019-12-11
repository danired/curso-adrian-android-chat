package edu.galileo.android.androidchat.contactlist;

import edu.galileo.android.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by Dani on 16/08/2016.
 */
public interface ContactListPresenter {
    public void onPause();
    public void onResume();
    public void onCreate();
    public void onDestroy();

    public void signOff();
    public String getCurrentUserEmail();
    public void removeContact(String email);
    public void onEventMainThread(ContactListEvent event);
}
