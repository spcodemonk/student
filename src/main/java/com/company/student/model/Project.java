package com.company.student.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "project")
@ApiModel(description = "project details ")
public class Project implements Serializable {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "pid")
    @ApiModelProperty(notes = "The database generated project ID")
	private String pid;

	@ApiModelProperty(notes="The project name")
	private String pname;
	
	@ApiModelProperty(notes="completion date")
	private LocalDate cdate;

	@ManyToMany(mappedBy = "projects")
	private Set<Student> students = new HashSet<>();;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public LocalDate getCdate() {
		return cdate;
	}

	public void setCdate(LocalDate cdate) {
		this.cdate = cdate;
	}

	public String getPid() {
		return pid;
	}

}
