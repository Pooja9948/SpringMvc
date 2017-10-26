package com.bridgelabz.formvalidate;

//import org.springframework.beans.factory.annotation.Value;

public class EmployeeVO
{
    //private static final long serialVersionUID = 1L;
 
    //@Value("${id}")
    private Integer id;
    
    //@Value("${firstName}")
    private String firstName;
    
    //@Value("${lastName}")
    private String lastName;
    
    //@Value("${email}")
    private String email;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
 
    //Getters and Setters
 
    @Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
    }

}
