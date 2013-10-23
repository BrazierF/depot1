
public class Student {
private final int id ; 
private String firstName ;
private String lastName ;
public final String getFirstName() {
	return firstName;
}
public final void setFirstName(String firstName) {
	this.firstName = firstName;
}
public final String getLastName() {
	return lastName;
}
public final void setLastName(String lastName) {
	this.lastName = lastName;
}
public final int getId() {
	return id;
}
public Student(int id, String firstName, String lastName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
}
@Override
public String toString() {
	return  firstName +
			" "+ lastName + " ("+id+")";
}}
