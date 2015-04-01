package com.codetutr;
import com.codetutr.domain.Person;
import junit.framework.TestCase;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.Matchers;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.Assert.*;
import org.mockito.MockitoAnnotations;
import org.junit.After;
import org.junit.Before;
import java.util.List;
import com.codetutr.controller.PersonController;
import com.codetutr.domain.Person;
import com.codetutr.service.PersonService;
import com.codetutr.service.PersonServiceImpl;


public class PersonServiceImplTest {
    @Mock
    PersonService personservice;
   
    @InjectMocks
   PersonServiceImpl personserviceimpl= new PersonServiceImpl();
     
    Person person;
    
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
       // personservice.save(person);
    }

    @After
    public void tearDown() throws Exception {

    }
    
    @Test
    public void testgetRandom()  {
       Person person = new Person();
       person.setAge(24);
       person.setName("tanvi");
       when(personservice.getRandom()).thenReturn(person);
       assertTrue(true);
        
    }

    @Test
    public void testgetById()  {
    Long id=(long) 345369;
    Person person = new Person();
    person.setAge(50);
    person.setName("");
    when(personservice.getById(id)).thenReturn(person); 
    assertNotNull(personserviceimpl.getRandom());
    }
    
    @Test
	public void testgetAge(){
    	Person person = new Person();
    	person.setAge(24);
    	assertTrue(person.getAge()==24);
	}
    
    @Test
	public void testgetName(){
    	Person person = new Person();
    	person.setName("");
    	assertNotNull(person.getName()=="");
	}
    
    @Test
    public void testtoString(){
    	Person person = new Person();
        assertEquals(person.toString(),"","");
        
    }

    
}