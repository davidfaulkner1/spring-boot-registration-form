/**
 * 
 */
package com.davidfaulkner.registration.spring_boot_registration_form.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author david
 *
 */

@Entity
@Table(name = "customer_data")
public class CustomerData {

	// Instance variables for each field in table
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
	private LocalDateTime registered;

    @Column(nullable = false, unique = true, length = 255)
    @Email(message = "Invalid email format")
    private String emailAddress;

    @Column(nullable = false, length = 5)
    private String title;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(name = "address_line_1", nullable = false, length = 255)
    @NotEmpty(message = "Address line 1 is required") // Added validation constraint
    private String addressLine1;

    @Column(length = 255)
    private String addressLine2;

    @Column(length = 255)
    private String city;

    @Column(nullable = false, length = 10)
    private String postcode;

    @Column(length = 20)
    private String phoneNumber;
    
    
	// Constructors
	// No-argument constructor (this is required by JPA)
	public CustomerData() {
	}
	
	// Constructor with all fields
	public CustomerData(LocalDateTime registered, String emailAddress,
			String title, String firstName, String lastName, String addressLine1, String addressLine2, String city,
			String postcode, String phoneNumber) {
		this.registered = registered;
		this.emailAddress = emailAddress;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.postcode = postcode;
		this.phoneNumber = phoneNumber;
	}

	
    // Getters and setters for each instance variable
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getRegistered() {
		return registered;
	}

	public void setRegistered(LocalDateTime registered) {
		this.registered = registered;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

   
	// method checking if email address is repeated
	public boolean isSameAddress(CustomerData other) {
        if (other == null) {
            return false;
        }
        return Objects.equals(this.addressLine1, other.addressLine1) &&
               Objects.equals(this.addressLine2, other.addressLine2) &&
               Objects.equals(this.city, other.city) &&
               Objects.equals(this.postcode, other.postcode);
    }
}
