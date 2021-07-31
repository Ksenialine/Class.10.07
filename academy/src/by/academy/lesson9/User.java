package by.academy.lesson9;

public class User {
	private String login;
	private String password;
	
	class Query {
		public void prinToLog() {
			System.out.println("Пользователь " + login + "отправил запрос");
		}
	}
public void createQuery() {
	Query q = new Query();
	q.prinToLog();
}
}
