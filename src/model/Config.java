package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Config {
	
	@Id
	private String id;
	@Column
	private String value;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	
	
}
