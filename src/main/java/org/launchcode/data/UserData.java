package org.launchcode.data;

import org.launchcode.models.User;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    //add, getAll, getById
    private static Map<Integer, User> users = new HashMap<>();

    public static User getById(int id) { return users.get(id);}

    public static void add(User user){
        users.put(user.getId(), user);
        }


}
