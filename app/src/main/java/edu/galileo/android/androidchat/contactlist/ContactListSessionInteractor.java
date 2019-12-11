package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Dani on 16/08/2016.
 */
public interface ContactListSessionInteractor {
    public void signOff();
    public String getCurrentUserEmail();
    public void changeConnectionStatus(boolean online);
}
