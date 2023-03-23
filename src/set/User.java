package set;

import java.time.LocalDateTime;

public class User {

	private String name;
	private LocalDateTime acessTime;

	public User(String name, LocalDateTime acessTime) {

		this.name = name;
		this.acessTime = acessTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getAcessTime() {
		return acessTime;
	}

	public void setAcessTime(LocalDateTime acessTime) {
		this.acessTime = acessTime;
	}

}
