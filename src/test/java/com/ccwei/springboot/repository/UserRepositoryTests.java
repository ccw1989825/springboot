package com.ccwei.springboot.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void test() {
//		Timestamp timestamp = new Timestamp(new Date().getTime());
//		userRepository.save(new User("changchw", "123456", "changchw@yonyou.com", "常成伟", timestamp));
//		userRepository.save(new User("chengwbc", "123456", "chengwbc@yonyou.com", null, timestamp));
		userRepository.findByUserName("changchw");
		
	}
	
}
