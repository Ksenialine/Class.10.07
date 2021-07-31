package by.academy.lesson9;

public class UserDemo {
public static void main(String... args) {
	User user1 = new User();
	User.Query q1 = new User().new Query();
	q1.prinToLog();
	User.Query q2 = user1.new Query();
	q2.prinToLog();
}
}
