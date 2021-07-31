package by.academy.lesson6;

import java.io.Serializable;
import java.util.Objects;

import by.academy.lesson9.Animal;

public class Cat extends Animal implements Serializable {
	String nickname;
	int age;
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, nickname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return age == other.age && Objects.equals(nickname, other.nickname);
		
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cat [nickname=");
		builder.append(nickname);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	

}
