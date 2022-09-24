package com.sevitha.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//This class is used for not directly exposing the 
//data members of our program instead of using the POJO class
//objects we can use data objects of UserDto class

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	@NotEmpty
	@Size(min=3,message="Username name must has minimum of 4 characters.")
	private String name;
	@Email(message="Invalid Email address!")
	private String email;
	@NotEmpty
	@Size(min=3,max=10,message="Password must be min of 3 characters amd max of 10 characters.")
	//if needed pattern of password can be set using @Pattern(regexp = "")
	private String password;
	@NotNull
	private String about;
	
	
}
