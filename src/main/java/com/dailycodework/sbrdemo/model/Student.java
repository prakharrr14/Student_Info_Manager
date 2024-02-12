package com.dailycodework.sbrdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

/**
 * @author Simpson Alfred
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @NaturalId(mutable = true)
    private String email;
    private String department;
//	public String getEmail() {
//		// TODO Auto-generated method stub
//		return email;
//	}
//	public Object getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(Object firstName2) {
//		
//		firstName= (String) firstName2;
//		
//	}
//	public Object getLastName() {
//		return lastName;
//	}
//	public void setLastName(Object lastName2) {
//		lastName = (String) lastName2;
//		
//	}
//	public void setEmail(String email2) {
//		email = email2;
//		
//	}
//	public Object getDepartment() {
//		return department;
//	}
//	public void setDepartment(Object department2) {
//		department = (String) department2; 
//	}
}
