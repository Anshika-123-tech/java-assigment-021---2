java-assigment-021---1
 **Student Record Management System** 
The program demonstrates:
 a.Object-Oriented Programming concepts  
 b. Use of constructors, methods, and classes  
 c. Use of arrays for storing multiple student records  
 d. Input/output operations using `Scanner`  
 e.Conditional statements for grade calculation  
 f.Menu-driven program structure  

## 🎯 Objective
To design a class-based program that stores student records (roll number, name, course, marks, grade) and allows the user to:
- Add new student records  
- Display all stored students  
- Automatically calculate grades based on marks

## 🧱 Class Structure

### **1. Person Class**
- Base class containing the `name` field.

### **2. Student Class (extends Person)**
Fields:
1.int rollNo
2.String course
3.double marks
4.char grade

Methods:
1. inputDetails()
2.displayDetails()
3.calculateGrade()

### **3. StudentManagementSystem (Main Class)**

- Uses an **ArrayList<Student>** to store multiple student records
- Options:
  1. Add Student  
  2. Display Students  
  3. Exit
#screenshots of code#
1.Add a student
<img width="1003" height="493" alt="Screenshot 2025-11-15 134846" src="https://github.com/user-attachments/assets/6c662dac-262c-45c4-8f79-cdf7bcfbb69f" />
2.Display the student
<img width="896" height="534" alt="Screenshot 2025-11-15 134929" src="https://github.com/user-attachments/assets/c852cf9c-d310-4279-8cb8-6a6b76eb7323" />
3.Exit
<img width="764" height="176" alt="Screenshot 2025-11-15 134945" src="https://github.com/user-attachments/assets/0024d0cc-53c7-4ee0-baec-49be1e3be711" />





