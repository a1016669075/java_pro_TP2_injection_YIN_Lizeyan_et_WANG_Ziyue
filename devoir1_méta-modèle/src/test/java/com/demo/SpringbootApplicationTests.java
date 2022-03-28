package com.demo;

import com.demo.entity.DarkWebHttpService;
import com.demo.entity.HttpService;
import com.demo.entity.NewsService;
import com.demo.entity.RssNewsService;
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
	HttpService service;
	@Autowired
	NewsService newservice;


	@Autowired
	DarkWebHttpService serviceDark;
	@Autowired
	RssNewsService newserviceRss;
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

		NewsService newsService = (NewsService)injector.newInstance(newservice);
    assertTrue(newsService.getHttpService() instanceof DarkWebHttpService);

	}

}
