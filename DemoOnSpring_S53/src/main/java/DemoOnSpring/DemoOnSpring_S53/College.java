package DemoOnSpring.DemoOnSpring_S53;

public class College {
  
String cname;
Student stud;

College(){     //default constructor
  
}


public College(String cname, Student stud) {
  super();
  this.cname = cname;
  this.stud = stud;
}

public String getCname() {
  return cname;
}

public void setCname(String cname) {
  this.cname = cname;
}
public Student getStud() {
  return stud;
}
public void setStud(Student stud) {
  this.stud = stud;
}

@Override
public String toString() {
  //return "College [cname=" + cname + ", stud=" + stud + "]";
  return "College Name = "+cname+"\n"+ stud;

}

}