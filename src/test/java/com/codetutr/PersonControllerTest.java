package com.codetutr;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.codetutr.controller.PersonController;
import com.codetutr.domain.Person;
import com.codetutr.service.PersonService;
import com.codetutr.service.PersonServiceImpl;

public class PersonControllerTest {
	 @Mock
	    PersonService personservice;
	    Person person=new Person();
	    @InjectMocks
	    PersonController personController=new PersonController(personservice);
	    @Before
	    public void setUp() {
	    	
	    
	    	MockitoAnnotations.initMocks(this);
	    	
	    }
  
	    @After
	    public void tearDown() throws Exception {

	    }
	    
	    
	   @Test
	   public void testGetByIdFromParam()
	   {
		   Long id=(long) 105 ;
		   person.setAge(24);
		    person.setName("Tanvi");
		   when(personservice.getById(id)).thenReturn(person);
		   assertEquals("Tanvi",personController.getByIdFromParam(id).getName());
	   }
	   @Test
	   public void testgetById()
	   {
		   Long id=(long) 2356;
		   person.setAge(12);
		   person.setName("Sanika");
		   when(personservice.getById(id)).thenReturn(person);
		   assertEquals("Sanika",personController.getById(id).getName());
	   }
	   @Test
	   public void testrandomPerson()
	   {
		   person.setAge(22);
		   person.setName("");
		   when(personservice.getRandom()).thenReturn(person);
		   assertEquals("",personController.randomPerson().getName());
	   }
	  
	   
	     
}
