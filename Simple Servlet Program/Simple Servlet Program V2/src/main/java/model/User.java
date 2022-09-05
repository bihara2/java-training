package model;

public class User {
	private String name;
	private String email;
	private String password;

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;

		} else if (obj instanceof User) {
			User user = (User) obj;
			return this.email.equalsIgnoreCase(user.email) && this.password.equals(user.password) && true || false;

		} else {
			return false;
		}
	}

}
