package K_OOPS_Programs;

import java.util.ArrayList;
import java.util.Scanner;

class Student_pojo {

    private int id;
    private String Student_name;
    private String Father_name;
    private String Mother_name;
    private String Gender;

    public Student_pojo(int i, String s_name, String F_name, String M_name, String G) {
        id = i;
        Student_name = s_name;
        Father_name = F_name;
        Mother_name = M_name;
        Gender = G;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getFather_name() {
        return Father_name;
    }

    public void setFather_name(String father_name) {
        Father_name = father_name;
    }

    public String getMother_name() {
        return Mother_name;
    }

    public void setMother_name(String mother_name) {
        Mother_name = mother_name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Student_pojo{" +
                "id=" + id +
                ", Student_name='" + Student_name + '\'' +
                ", Father_name='" + Father_name + '\'' +
                ", Mother_name='" + Mother_name + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student_pojo> Student_Register = new ArrayList<>();

        System.out.print("Please Enter Your Name :");
        String user_name = sc.nextLine();
        System.out.println("      Hello " + user_name + "\n      Welcome to Student Management System");
        boolean check = true;

        while (check) {
            System.out.println("********************************************************************************************");
            System.out.println("Press \n 1 -To Register new Student \n 2-Get All Student \n 3-Search Student \n 4-Update Student \n 5-Delete Student \n 0-Exit from Student Management System");
            int operation = sc.nextInt();
            switch (operation) {

                //Create -Register new Student
                case 1:
                    System.out.print("Enter Student Name :");
                    String sname = sc.next();
                    System.out.print("Enter Father Name  :");
                    String fname = sc.next();
                    System.out.print("Enter Mother Name :");
                    String mname = sc.next();
                    System.out.print("Enter Gender M/F  :");
                    String gender = sc.next();
                    Student_pojo student1 = new Student_pojo((Student_Register.size() + 1), sname, fname, mname, gender);
                    Student_Register.add(student1);
                    System.out.println("Student added successfully");
                    break;

                // Read -Get All Student
                case 2:
                    for (Student_pojo student2 : Student_Register) {
                        System.out.println(student2);
                    }
                    break;

                //Search
                case 3:
                    System.out.print("Enter Student Name :");
                    String s2name = sc.next();
                    boolean check2 = false;
                    for (Student_pojo student2 : Student_Register) {
                        if (student2.getStudent_name().equals(s2name)) {
                            System.out.println("Student is present \n details are :");
                            System.out.println(student2);
                            check2 = true;
                        }
                    }
                    if (check2 == false) {
                        System.out.println("Student is not present.");
                    }
                    break;

                //Update-Update Student
                case 4:
                    System.out.print("Enter Student Name :");
                    String s3name = sc.next();
                    boolean check3 = false;
                    for (Student_pojo student3 : Student_Register) {
                        if (student3.getStudent_name().equals(s3name)) {
                            System.out.print("Update Student name :");
                            student3.setStudent_name(sc.nextLine());
                            System.out.print("Update Father name :");
                            student3.setFather_name(sc.nextLine());
                            System.out.print("Update Mother name :");
                            student3.setMother_name(sc.nextLine());
                            System.out.print("Update Student name :");
                            student3.setStudent_name(sc.nextLine());
                            check3 = true;
                            break;
                        }
                    }
                    if (check3) {
                        System.out.println("Student is updated successfully.");
                    } else {
                        System.out.println("Student is not present.");
                    }
                    break;

                //Delete-Delete Student
                case 5:
                    System.out.print("Enter Student Name :");
                    String s4name = sc.next();
                    boolean check4 = false;
                    for (Student_pojo student4 : Student_Register) {
                        if (student4.getStudent_name().equals(s4name)) {
                            Student_Register.remove(student4);
                            check4 = true;
                            break;
                        }
                    }
                    if (check4) {
                        System.out.println("Student is deleted successfully.");
                    } else {
                        System.out.println("Student is not present.");
                    }
                    break;

                //Exit from Student Management System
                case 0:
                    System.out.println("Thanks for using Student Management System.");
                    System.out.println("*************************************************************************************");
                    check = false;
                    break;

                default:
                    System.out.println("Please enter valid option.");
            }
        }
    }
}
