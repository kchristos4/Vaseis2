package mye030.DBMS_data_visualization.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	@Column(name= "year")
	private Integer year;
	@Column(name= "semester")
	private Integer semester;
	@Column(name="description")
	private String description;

	
	
	public Course() {
		
	}
	
	public Course(Integer id, String name, Integer year,Integer semester, String description) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.semester = semester;
		this.description = description;
	}
	public Course(String name, Integer year,Integer semester, String description) {
		this.name = name;
		this.year = year;
		this.semester = semester;
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	public Integer getSemester() {
		return semester;
	}
	public void setSemester(Integer semester) {
		this.semester = semester;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Course [id ="+id+",name = "+name+", year= "+year+", semester = "+ semester+", description = "+description+"]";
	}
}