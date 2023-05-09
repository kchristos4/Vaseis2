package mye030.DBMS_data_visualization.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="studentregistration")
public class StudentRegistration {
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
	@Column(name= "projectgrade")
	private float projectgrade;
	@Column(name= "examgrade")
	private float examgrade;
	@Column(name= "finalgrade")
	private float finalgrade;
	@Column(name= "courseid")
	private Integer courseid;

	

	
	
	public StudentRegistration() {
		
	}
	
	public StudentRegistration(Integer id, String name, Integer year,Integer semester, String description,float finalgrade,float projectgrade,float examgrade,Integer courseid) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.semester = semester;
		this.description = description;
		this.finalgrade = finalgrade;
		this.projectgrade = projectgrade;
		this.examgrade = examgrade;
		this.courseid = courseid;
	}
	public StudentRegistration(String name, Integer year,Integer semester, String description,float finalgrade,float projectgrade,float examgrade,Integer courseid) {
		this.name = name;
		this.year = year;
		this.semester = semester;
		this.description = description;
		this.finalgrade = finalgrade;
		this.projectgrade = projectgrade;
		this.examgrade = examgrade;
		this.courseid = courseid;
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
	
	
	public float getProjectgrade() {
		return projectgrade;
	}
	public void setProjectgrade(float projectgrade) {
		this.projectgrade = projectgrade;
	}

	
	public float getExamgrade() {
		return examgrade;
	}
	public void setExamgrade(float examgrade) {
		this.examgrade = examgrade;
	}
	
	public float getFinalgrade() {
		return finalgrade;
	}
	public void setFinalgrade(float finalgrade) {
		this.finalgrade = finalgrade;
	}

	public Integer getCourseid() {
		return courseid;
	}
	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}
	

	
	@Override
	public String toString() {
		return "StudentRegistration [id ="+id+",name = "+name+", year= "+year+", semester = "+ semester+", description = "+description+"]";
	}
}