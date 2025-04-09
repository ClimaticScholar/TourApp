package com.wbtourism.tourapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tours")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Double price;

    @Column(length = 500)
    private String description;
    @Column(name = "image_url")
    private String imageUrl;

    
	public Tour() {
	}

	public Tour(int id, String location, Double price, String description,String imageUrl) {
		super();
		this.id = id;
		this.location = location;
		this.price = price;
		this.description = description;
		this.imageUrl= imageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", location=" + location + ", price=" + price + ", description=" + description
				+ ", imageUrl=" + imageUrl + "]";
	}


	
    
    
}
