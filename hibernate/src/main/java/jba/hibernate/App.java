package jba.hibernate;


/**
A. Insert a record into table 
B. Find a particular row data specific to a id from student table
C. Find all the students data.
D. Update a particular row with the given id.
E. Delete a row with the given id.
 *
 */
public class App  {
public static void main(String[] args) {
	  CRUDOperations crudOperations = new CRUDOperations();
	  crudOperations.insertEntity();
	  crudOperations.findEntity();
	  crudOperations.updateEntity();
	  crudOperations.removeEntity();
	 }
	}