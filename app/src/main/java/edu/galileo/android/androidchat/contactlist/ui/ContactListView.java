package edu.galileo.android.androidchat.contactlist.ui;

import edu.galileo.android.androidchat.contactlist.entities.User;

/**
 * Created by Dani on 16/08/2016.
 */
public interface ContactListView {
    public void onContactAdded(User user);
    public void onContactChanged(User user);
    public void onContactRemoved(User user);
}
