package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class sample {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://dhscqalcari01bl.asp.dhisco.com:8080/");
		selenium.start();
	}

	@Test
	public void testSample() throws Exception {
		selenium.open("/ClientPortal/");
		selenium.click("id=button-1043-btnInnerEl");
		selenium.click("id=button-1090-btnEl");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
