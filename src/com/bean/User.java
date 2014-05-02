package com.bean;
// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
     private String email;
     private String password;


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String email) {
        this.email = email;
    }
    
    /** full constructor */
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
   








}