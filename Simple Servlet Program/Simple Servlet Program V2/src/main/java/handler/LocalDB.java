package handler;

import java.util.HashMap;
import java.util.Map;

import model.User;

public class LocalDB {

	private static volatile LocalDB db;
	private static Map<String, User> users = new HashMap<>();	
	
	public static LocalDB getSingletonObj (){

		if (db == null) {
			synchronized (LocalDB.class) {
				if (db == null) {
					db = new LocalDB();
				}
			}
		}
        return db;
    }

	// get user from the list
	public User getUser(String email) {
		if (users.containsKey(email)) {
			return (User) users.get(email);
		}
		return null;
	}

	// add user to the list
	public void addUser(User user) {
		
		if (!users.containsKey(user.getEmail())) {			
			users.put(user.getEmail(), user);
			System.out.println("user added successfully!!");
		}else {
			System.out.println("This user is already registered!!");
		}		
	}

}
