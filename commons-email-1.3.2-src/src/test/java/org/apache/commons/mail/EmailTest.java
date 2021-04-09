package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import junit.framework.Assert;



public class EmailTest {

private static final String[] TEST_EMAILS = { "ab@bc.com", "a.b@c.org", "abcdefghijklmnopqrst@abcdefghijklmnopqrst.com.bd" };

private String[] testValidChars = {" ", "a", "A", "\uc5ec", "0123456789", "012345678901234567890", "\n"};

private EmailConcrete email;

@Before
public void setUpEmailTest() throws Exception{
	email = new EmailConcrete();
}

@After
public void tearDownEmailTest() throws Exception{

}//closes tearDownEmailTest
//Makes sure that addBcc works
@Test
public void testAddBcc() throws Exception
{
	email.addBcc(TEST_EMAILS);
	assertEquals(3, email.getBccAddresses().size());

}

}//closes EmailTest
