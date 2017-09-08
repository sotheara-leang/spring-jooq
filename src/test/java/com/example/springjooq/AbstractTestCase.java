package com.example.springjooq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:conf/context-root.xml")
public class AbstractTestCase {

	@Test
	public void doTest() {
		
	}
}
