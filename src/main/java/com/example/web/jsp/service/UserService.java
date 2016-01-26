package com.example.web.jsp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.web.jsp.model.User;

@Component
public class UserService {
	private List<User> users = new ArrayList<>();
	private long maxID;

	public UserService() {

		saveUser("Müller", "Max", "heerstr. 8 12209");
		saveUser("Seide", "Ina", "karl 108");
		setMaxID();
	}

	public long setMaxID() {
		return maxID = users.get(users.size() - 1).getId();
	}

	public List<User> getUsers() {
		return users;
	}

	public User getUser(long userId) {

		for (User user : users) {
			if (user.getId() == userId) {
				return user;
			}
		}

		return null;
	}

	public void updateUser(long id, String firstname, String lastname, String address) {
		User currentUser = getUser(id);

		currentUser.setFirstname(firstname);
		currentUser.setLastname(lastname);
		currentUser.setAddress(address);

	}

	public void saveUser(String firstname, String lastname, String address) {

		User newUser = new User(maxID + 1, firstname, lastname, address);
		users.add(newUser);
		setMaxID();

	}

	public boolean deleteUser(long id) {
		boolean deleted = false;
		User user = getUser(id);
		if (user != null) {
			users.remove(getUser(id));
			deleted = true;
		}
		return deleted;
	}

}
