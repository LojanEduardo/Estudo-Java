package entities;

import java.util.Date;

public class Cliente {
	private String name;
	private String email;
	private Date dataAniver;
	
	public Cliente() {
		
	}
	
	public Cliente(String name, String email, Date dataAniver){
		this.name = name;
		this.email = email;
		this.dataAniver = dataAniver;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAniver() {
		return dataAniver;
	}

	public void setDataAniver(Date dataAniver) {
		this.dataAniver = dataAniver;
	}

}
