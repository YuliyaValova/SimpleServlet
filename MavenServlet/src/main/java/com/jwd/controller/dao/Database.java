package com.jwd.controller.dao;

import com.jwd.controller.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, User> database = new HashMap<>();

    public void putToMap (String login, User user){
        this.database.put(login, user);
    }

    public boolean containsLogin(String login){
        return this.database.containsKey(login);
    }

    @Override
    public String toString() {
        String output ="Database: ";
        ArrayList<User> elements = new ArrayList<User>(database.values());
        for (User el:elements) {
            output+=el.getId()+"["+el.getLogin()+"]"+"   ";
        }
        return output;
        }
}
