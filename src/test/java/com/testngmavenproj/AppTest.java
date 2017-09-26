package com.testngmavenproj;

import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void senaMail()
	{
	   System.out.println("*********In send mail test*********");
	}
	
}
//1. run the test as testng test --> we get test executed in console

//2. to run the tests at command prompt (maven ) we did add a plugin called
// maven surefire plugin in pom.xml

//3. Now at prompt mvn compile, mvn  eclipse:eclipse  then give below command

/*4. Give below commands at prompt to run the tests 

--   mvn test  ---> this command will execute the tests as per the tests in testng.xml
--   mvn test site --> this command will execute the tests(project) and also generate 
                    some apache reports
  
--   mvn surefire-report:report---> this command at prompt will execute tests and 
                                   also generate surefire reports
                               
--> Surefire reports are generated after refreshing project and under 
 the target folder (inside site folder) in project location.                              

*/

