package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-----Starting Code---------");
		
//		User user=new User();
//		user.setFirstName("Hemant");
//		user.setLastName("Thakur");
//		user.setEmail("nikhilt919@gmail.com");
//		user.setUsername("nikhilt919");
//		user.setPassword("nik");
//		user.setPhone("8219072620");
//		user.setProfile("default.png");
//		
//		Role role1=new Role();
//		role1.setRoleId(11L);
//		role1.setRoleName("Admin");
//		
//		Set<UserRole> urs=new HashSet<>();
//		UserRole ur=new UserRole();
//		ur.setRole(role1);
//		ur.setUser(user);
//		
//		urs.add(ur);
//		
//		User user1=this.userService.createUser(user, urs);
//		System.out.println(user1.getUsername());
	}

}
