package by.academy.lesson9;

import by.academy.lesson9.User.Query;

public class UserDemoOne {
	public static void main(String... args) {
		User user1 = new User();
		UserOne.Query q1 = new UserOne.Query();
		q1.prinToLog();
		UserOne.Query q2 = new UserOne.Query();
		q2.prinToLog();
	}
}
