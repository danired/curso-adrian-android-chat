package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Dani on 21/08/2016.
 */
public class ContactListInteractorImpl implements ContactListInteractor {

    private ContactListRepositoryImpl contactListRepository;

    public ContactListInteractorImpl() {
        this.contactListRepository = new ContactListRepositoryImpl();
    }

    @Override
    public void subscribeForContactEvents() {
        contactListRepository.subscribeForContactListUpdates();
    }

    @Override
    public void unsubscribeForContactEvents() {
        contactListRepository.unsubscribeForContactListUpdates();
    }

    @Override
    public void destroyContactListListener() {
        contactListRepository.destroyContactListListener();
    }

    @Override
    public void removeContact(String email) {
        contactListRepository.removeContact(email);
    }
}
