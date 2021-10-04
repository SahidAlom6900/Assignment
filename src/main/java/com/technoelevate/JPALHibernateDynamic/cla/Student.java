package com.technoelevate.JPALHibernateDynamic.cla;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rollNo;
	private String name;
	private String address;
	private long phone;

	public Student(String name, String address, long phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

//		updateStudent(args[0],args[1],Integer.parseInt(args[2]));
//	Student student = selectStudent(Integer.parseInt(args[0]));
//	int rs = deleteStudent(Integer.parseInt(args[0]));
//	System.out.println("Delete : " + rs);
//	System.out.println("Student : " + student);
}
