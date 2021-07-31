package by.academy.lesson9;

import by.academy.lesson9.User.Query;

public class UserOne {
	private String login;
	private String password;
	
	static class Query {
		User u;
		public Query() {
			super();
		}
		public Query(User u) {
			this.u = u;
		}
		public void prinToLog() {
			System.out.println("Пользователь " + login + "отправил запрос");
		}
	}
public void createQuery() {
	Query q = new Query();
	q.prinToLog();
}
}

