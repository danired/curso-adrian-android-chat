package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Dani on 21/08/2016.
 */
public class ContactListSessionInteractorImpl implements ContactListSessionInteractor {

    private ContactListRepository contactListRepository;

    public ContactListSessionInteractorImpl() {
        this.contactListRepository = new ContactListRepositoryImpl();
    }

    @Override
    public void signOff() {
        contactListRepository.signOff();
    }

    @Override
    public String getCurrentUserEmail() {
        return contactListRepository.getCurrentEmail();
    }

    @Override
    public void changeConnectionStatus(boolean online) {
        contactListRepository.changeUserConnectionStatus(online);
    }
}
