/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Student {
   private String sname;
   private String sID;
//this has been edited on github.com to show fetch+merge
   //some comments at 9:46
    public Student(String sname, String sID) {
        this.sname = sname;
        this.sID = sID;
    }
   //this is our 3rd class of software design
   //hey everyone!
   

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }
   

    public String getSname() {
        return sname;
    }

    public String getsID() {
        return sID;
    }
   
}
