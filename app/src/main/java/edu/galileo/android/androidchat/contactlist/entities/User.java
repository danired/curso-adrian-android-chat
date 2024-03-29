package edu.galileo.android.androidchat.contactlist.entities;

import java.util.Map;

/**
 * Created by Dani on 27/06/2016.
 */
public class User {
    private String email;
    private boolean online;
    private Map<String, Boolean> contacts;

    public final static boolean ONLINE = true;
    public final static boolean OFFLINE = false;

    public User() { }

    public User(String email, boolean online, Map<String, Boolean> contacts) {
        this.email = email;
        this.online = online;
        this.contacts = contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public Map<String, Boolean> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, Boolean> contacts) {
        this.contacts = contacts;
    }
}
