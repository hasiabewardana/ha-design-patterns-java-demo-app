package org.example.solid.singleresponsibility.compliance;

public class UserPersistenceService {
    private static Store store = new Store();

    public void saveUser(User user){
        store.store(user);
    }
}
