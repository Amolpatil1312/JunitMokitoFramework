# JunitMokitoFramework
Q What is Junit?
J Unit an Open-source, Java Based Testing Framework.
It helps us to do test TDD (test Driven Development) means Test during development phase.
 It helps to get bug During development phase without required software go for Production.
It helps to reduce the time to debug any issues latter on.

Q what is Mockito and List out some Annotations?
Mockito is the open-source mocking software that allows the creation of test object that pretends the behavior of real-world objects.
its help archiving test-driven development.
Here we are giving Dummy input to the software where we will not be hitting the Data base unnecessarily and not persisting Data into the Data base.
Annotations:
1.	@SpringBootTest: 
•	Its is class level Annotation.
•	@Spring Boot Test create an application context and load full application context. 
•	@Spring Boot Test create an application context means we can @autowire any bean That’s picked up by component scanning into our test.

2.	@RunWith:
•	Its is used to keep the test clean and improve debugging.

3.	@Mock:
•	Spring Boot Provides @SpringBootTest Annotation for Integration testing.
•	This annotation creates an application context for and Loads full application context.
•	@Spring Boot Test create an application context means we can @autowire any bean That’s picked up by component scanning into our test.
4.	@Test:
•	It is the method level annotation which is Required when we are testing the method.

5.	@InjectMocks:
•	The @Inject Mocks annotation automatically inject mock object into class that is under test. It simplifies the process of setting up the test environment by automatically writing the mock object into the tested class.

6.	@spy:
•	The Mockito. Spy () method allows you to create a partial mock by wrapping an existing object. It retains the original behavior of the object while allowing you to stub or verify specific methods. 



J-Unit Mockito:
To Test our application before testing phase at development phase only i.e. test Driven Development (TDD).
@SpringBootTest: consider at class level as test.
@RunWith (springRunner.class) – A J-unit Runner is class that extends Junit abstract runner classes. The runner that should not be used to run a test can be used to Run a test is set as Run with Annotation.
When (): Method
	It should be used to when we want to mock to return specific values when the particular methods are called.
	In simple term when we want to find all Data from the database then return actual values, It is mostly used when we have some conditions to be Execute.
Verify () method:
	Verify method used to check whether some specific method is called or not.
	It validates certain behavior that Happens once in the Test.
Times () method:
	It is used to verify the No of time the invocation of the method
