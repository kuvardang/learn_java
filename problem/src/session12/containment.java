package session12;

public class containment {

	int x,y;


//can replace array with three dots and pass the numbers to add them
//compiler gives default values and consttructore give default value 

  containment(){
	x=7;
	y=7;
} //its a constructor bro and it will be called first
 
  containment(int x, int y) {
   this.x =x;
   this.y =y;
  } //parameterised constructor 
}

//we can access property of class in object but we cannot access property of object in class
