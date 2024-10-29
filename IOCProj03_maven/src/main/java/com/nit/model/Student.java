// follow the package name as mvc structure (model , view, controller) but you have to usew only model package that will contain only target class
// dependent class .
//main package only will contain main class(main method)
//config package will contain only configuration class that will scan all bean classes (target and dependent)
//always try to find which is the target class and which is the dependent class..
//example===============
// target class       dependent class
// student              course material
//  flipkart            Ekart,DTDC,dhl


package com.nit.model;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	//@Autowired
    @Qualifier("MathStudent")
    private ISubject subject;  //Field Injection    
    public Student()
    {                                                         
    	
    }
    
   // @Autowired
    public Student(ISubject subject)    //constructor injection
    {
    	this.subject=subject;
    }

	public ISubject getStudent() {
		return subject;
	}

	@Autowired
	public void setStudent(ISubject subject) //setter injection
	{
		this.subject = subject;
	}
    
    public void getDetails()
    {
    	subject.start();
    	subject.stop();
    }             
}
