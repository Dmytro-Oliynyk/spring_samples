package com.dmytro.pdp.spring;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dmytro_Olijnyk on 5/15/2015.
 */
public class UserManager {
    private Set<User> users ;
    private Messenger messenger;

    public UserManager() {
    }

    public void addToLine(User user) {
        if (user != null) {
            initIfNotExist();
            users.add(user);
        }
    }

    public void addListOfUsersToLine(Collection<User> users) {
        initIfNotExist();
        users.stream().forEach(user->this.users.add(user));
    }

    private void initIfNotExist() {
        if (users == null) {
            this.users = new HashSet<User>();
        }
    }

    public void setUsers(Set<User> users) {
        addListOfUsersToLine(users);
    }

    public void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    public Set<User> getUsers() {
        return users;
    }

    public String printInfo(){
        StringBuffer buffer = new StringBuffer();
         getUsers().stream().forEach(user -> {
           buffer.append(user.toString());
             buffer.append("\n");
       });
        buffer.append(messenger.printFinalMessage());
      return buffer.toString();
    }
}
