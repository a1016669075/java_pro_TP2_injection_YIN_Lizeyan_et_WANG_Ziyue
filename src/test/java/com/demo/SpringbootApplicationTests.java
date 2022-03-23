package com.demo;

import com.demo.entity.BookDetailA;
import com.demo.entity.BookLibrarise;
import com.demo.entity.BookLibrariseA;
import com.demo.entity.BookDetailB;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	BookLibrarise service;
	@Autowired
	BookLibrariseA newservice;


	@Autowired
	BookDetailA serviceDark;
	@Autowired
	BookDetailB newserviceRss;
	@Autowired
	AwesomeConteneur injector;

 	@BeforeEach
	 void createInjector() {
	 injector = new AwesomeConteneur();
	}

	@Test
	public void contextLoads() {
		injector.bind(service).to(serviceDark);
		injector.bind(newservice).to(newserviceRss);

		BookLibrariseA bookLibrariseA = (BookLibrariseA)injector.newInstance(newservice);
    assertTrue(bookLibrariseA.getHttpService() instanceof BookDetailA);

	}

}
