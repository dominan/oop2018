package week1;
import java.util.Scanner;
public class Student {

   private String name, group, email;
    private String id;
    public Student(){
        name= "Student";
        email="uet@vnu.edu.vn";
        id="000";
        group="INT2208";
    }

    public Student(String name_, String id_, String group_, String email_){
        name= name_;
        id=id_;
        group=group_;
        email=email_;
    }

    public Student(Student s){
        name=s.getname();
        id=s.getid();
        email=s.getemail();
        group=s.getgroup();
    }

    public String getname(){
        return name;
    }

    public void setname(String n){
        name = n;
    }

    public String getgroup(){
        return group;
    }

    public void setgroup(String g){
        group = g;
    }

    public String getid(){
        return id;
    }

    public void setid(String i){
        id = i;
    }

    public String getemail(){
        return email;
    }

    public void setemail(String e){
        email = e;
    }

    public void getInfo(){
        System.out.println("Name SV: " +name +"\nID: "+ id+"\nGroup: " + group+"\nEmail: "+email);
    }

}
