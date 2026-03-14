package DemoOnSpring.DemoOnSpring_S53;

public class Student {

int regno;
String sname;

Student(){          //default constructor
	
}
public Student(int regno, String sname) {
    this.regno = regno;
    this.sname = sname;
}

public int getRegno() {
  return regno;
}
public void setRegno(int regno) {
  this.regno = regno;
}
public String getName() {
  return sname;
}
public void setName(String name) {
  this.sname = name;
}

@Override
public String toString() {
  //return "Student [regno=" + regno + ", sname=" + sname + "]";
  return "Register No is: " + regno + "\n"+ "Student Name: "+sname;
}



}