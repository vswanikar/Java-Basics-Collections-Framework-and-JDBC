/*. Create an enum call House that contains four constants namely Palash, Gulmohar, Kachnar and 
Amaltas. These houses have their own colours Palash – Orange, Gulmohar – Red, Kachnar – Purple 
and Amaltas – Yellow. Create another enum called Gender that store two constants Male and 
Female. Create a class called Student that stores his enrollmentNo, Name, Gender, class, section, 
and house. Write constructors, behaviour, operations to accept and display, and also override 
toString, equals and hashCode.
*/
package question2;
import java.util.Scanner;
public enum House {
	 Palash("Orange"),Gulmohar("Red"),Kachnar("Purple"),Amaltas("Yello");
		 House(String Colour){
			 this.Colour=Colour;
		 }
		 String Colour;
		 
		 public static House acceptData() {
			 Scanner in = new Scanner(System.in);
			 String house = in.nextLine();
			 if(house.equalsIgnoreCase("Palash")) {
				 return Palash;
			 }
			 else if(house.equalsIgnoreCase("Gulmohar")) {
				 return Gulmohar;
			 }
			 else if(house.equalsIgnoreCase("Kachnar")) {
				 return Kachnar;
			 }
			 else
				 return Amaltas;
				 
	 }



}
