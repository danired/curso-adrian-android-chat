package edu.galileo.android.androidchat.login;

/**
 * Created by Dani on 13/06/2016.
 */
public interface LoginRepository {
    void signUp(String email, String password);
    void signIn(String email, String password);
    void checkSession();
}
