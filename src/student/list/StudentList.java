
package student.list;

import java.util.Scanner;

public class StudentList 

    
    public static void main(String[] args) {
        //hlo this is comment//this is rollback/revert commit
        Student s1=new Student(sname:"Sehaj",sID:"s1");
        Scanner input=new Scanner(source:System.in);
        Student[] studentList=new Student[3];
        studentList[0]=s1;
        studentList[1]=new Student(sname:"gurpriyal",sID:"s2");
        studentList[2]=new Student(sname:"ishika",sID:"S3");
        
        for(int i=0;i<studentList.length;i++){
            System.out.println(x:studentList[i].getSname());
        }
    }
    
}
