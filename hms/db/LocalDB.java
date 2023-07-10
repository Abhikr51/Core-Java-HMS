package hms.db;

import java.util.HashMap;

public class LocalDB {
    // private static HashMap<String,Object> db = new HashMap<>();
    private static String auth = null;
    public static String getAuth(){
        return auth;
    }
    public static boolean setAuth(String email , String password){

        return false;
    }

}
