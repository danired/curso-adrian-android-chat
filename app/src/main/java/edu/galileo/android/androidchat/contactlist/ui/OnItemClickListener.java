package edu.galileo.android.androidchat.contactlist.ui;

import edu.galileo.android.androidchat.contactlist.entities.User;

/**
 * Created by Dani on 17/08/2016.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
