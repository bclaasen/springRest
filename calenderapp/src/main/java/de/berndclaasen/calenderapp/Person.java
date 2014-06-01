package de.berndclaasen.calenderapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
 
@Entity
@Table(name = "PERSON")
public class Person {
 
    @Id
    @Column(name = "ID", nullable = false, unique=true)
    @GeneratedValue(generator="person_seq")
    @SequenceGenerator(name="person_seq",sequenceName="person_seq", allocationSize=1,initialValue=10)
    private int id;
 
    @Column(name = "VORNAME", nullable = false)
    private String vorname;
 
    @Column(name = "NACHNAME", nullable = false)
    private String nachname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
    
    
}