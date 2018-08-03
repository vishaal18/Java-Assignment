package Controller;

import java.util.Hashtable;

public class Helper {
    public static Hashtable users = new Hashtable();
    public static void setData(String name, String password)
    {
        users.put(name, password);
    }
    public static Object check(String key) {
        return users.get(key);
    }

    public static boolean passwordchange(String name, String oldPass, String newPass)
    {
        if(users.containsKey(name)){
            users.replace(name, oldPass, newPass);
            return true;
        }
        else {
            return false;
        }
        }
    }


