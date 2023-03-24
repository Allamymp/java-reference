package set;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;


public class User {

	private String name;
	private LocalDateTime acessTime;
	private String formatedDate;
	private Date moment;
	public User(String name, LocalDateTime acessTime) {

		this.name = name;
		this.acessTime = acessTime;
		dateTimeFormatter(this.acessTime);
	}

	public User(String username, Date moment) {
		this.name = username;
		this.moment = moment;
	 
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

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	
	

}
