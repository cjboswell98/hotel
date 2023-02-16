package co.grandcircus.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String hotel_name;
	private String city;
	private String price_per_night;

	public Hotel() {
	}

	public Hotel(Long id, String name, String city, String price) {
		super();
		this.id = id;
		this.hotel_name = name;
		this.city = city;
		this.price_per_night = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return hotel_name;
	}

	public void setName(String name) {
		this.hotel_name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPrice() {
		return price_per_night;
	}

	public void setAvailable(String price) {
		this.price_per_night = price;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + hotel_name + ", maxCapacity="
				+ city + ", available=" + price_per_night + "]";
	}

}
