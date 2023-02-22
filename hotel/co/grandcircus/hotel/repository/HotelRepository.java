package co.grandcircus.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.hotel.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

			public static final int neededCapacity = 0;

	List<Hotel> findByAvailableIsTrue();

	List<Hotel> findByMaxCapacityGreaterThanEqual(int neededCapacity);

}
