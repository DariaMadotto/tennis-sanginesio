package it.uniroma3.siw.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private LocalDateTime date;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Court court;
	
	private String guestName;
	
	private String guestTelephone;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Court getCourt() {
		return court;
	}

	public void setCourt(Court court) {
		this.court = court;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestTelephone() {
		return guestTelephone;
	}

	public void setGuestTelephone(String guestTelephone) {
		this.guestTelephone = guestTelephone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, court, date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(court, other.court) && Objects.equals(date, other.date);
	}
	
}
