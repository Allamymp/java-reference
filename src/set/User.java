package set;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class User {

	private String name;
	private LocalDateTime acessTime;
	private String formatedDate;

	public User(String name, LocalDateTime acessTime) {

		this.name = name;
		this.acessTime = acessTime;
		dateTimeFormatter(this.acessTime);
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

	public void dateTimeFormatter(LocalDateTime acessTime) {
		  DateTimeFormatter isoFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
		this.formatedDate = isoFormatter.format(acessTime);
	}

	public String getFormatedDate() {
		return formatedDate;
	}

}
