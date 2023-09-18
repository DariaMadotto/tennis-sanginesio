package it.uniroma3.siw.repository;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.uniroma3.siw.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {  //
	
	public List<Booking> findByOrderByDateAsc();
	
	public List<Booking> findByUserIdOrderByDateAsc(Long userId);
	
	public Booking findOneByDate(LocalDateTime date);
	
	public List<Booking> findByDateBefore(LocalDateTime today);
	
}
