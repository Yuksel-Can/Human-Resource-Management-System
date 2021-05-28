package com.kodlama.io.hrms.entities.concrete;

import java.time.LocalDate;

import javax.persistence.*;
import lombok.*;
import com.kodlama.io.hrms.entities.abstracts.User;


@Entity
@Table(name="candidates")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="id")
public class Candidate extends User{

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="birth_date")
	private LocalDate birthDate;
}
