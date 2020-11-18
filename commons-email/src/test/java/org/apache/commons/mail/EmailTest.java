package org.apache.commons.mail;
import org.junit.Before;
import org.junit.Test;

//import java.sql.SQLException;
//import java.util.Date;

//import javax.mail.Address;
//import javax.mail.internet.MimeMessage;
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.After;


public class EmailTest {
	public static final String[] TEST_EMAILS = {"ab@bc.com", "a.b@c.org", "abgfrtbv@srvvb.com.bd" };
	public static final String TEST_EM = "ab@bc.com";
	public static final String TEST_EM1 = null;
	public static final String TEST_VNAME = "Sumaiya";
	public static final String TEST_VNAME1 = null;

	
	
	
	/* Concrete Email Class for testing */
	private EmailConcrete email;
	//private EmailConcrete em;
	@Before
	public void setUpEmailTest() throws Exception{
		
		email = new EmailConcrete();
		
	}
	
	@After
	public void tearDownEmailTest() throws Exception{
		
	}
	
	/* 
	 * Test addBcc(String email) function
	 */
	@Test
	public void testAddBcc() throws Exception {
		
		email.addBcc(TEST_EMAILS);
		assertEquals(3, email.getBccAddresses().size());
	}
	
	/* 
	 * Test addCc(String email) function
	 */
	@Test
	public void testAddCc() throws Exception {
		
		email.addCc(TEST_EMAILS);
		assertEquals(3, email.getCcAddresses().size());
	}
	
	/*
	 * Test addReplyTo(String email, String name(value)) function
	 */
	@Test
	public void testaddReplyTo() throws Exception {
		
		email.addReplyTo(TEST_EM, TEST_VNAME );
		assertEquals(1, email.getReplyToAddresses().size());
	}
	
	/*
	 * addHeader(String name, String value)
	 */

	 @Test
	 public void testaddHeader() throws Exception{
			
		 	email.addHeader(TEST_EM, TEST_VNAME );
		 	//email.addHeader(TEST_EM1, TEST_VNAME);
		
	 }
	 @Test(expected=IllegalArgumentException.class)
	 public void testaddHeaderEmpty() throws Exception{
			
		 	//email.addHeader(TEST_EM, TEST_VNAME );
		 	email.addHeader(TEST_EM1, TEST_VNAME);
		
	 }
		
}
