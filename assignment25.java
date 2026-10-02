Write a SQL queue for creating a students table which has roll no,name,age,date of birth,email ID,phone number and address and the primary keys are students ID,name,email ID and phone number should not be null and insert any three records into the table
  CREATE TABLE Students (
    Student_ID INT PRIMARY KEY,
    Roll_No INT,
    Name VARCHAR(50) UNIQUE,
    Age INT,
    Date_of_Birth DATE,
    Email_ID VARCHAR(100) UNIQUE,
    Phone_Number VARCHAR(15) UNIQUE NOT NULL,
    Address VARCHAR(200)
);

INSERT INTO Students
(Student_ID, Roll_No, Name, Age, Date_of_Birth, Email_ID, Phone_Number, Address)
VALUES
(1, 101, 'Rahul', 20, '2006-05-15', 'rahul@gmail.com', '9876543210', 'Bangalore');

INSERT INTO Students
(Student_ID, Roll_No, Name, Age, Date_of_Birth, Email_ID, Phone_Number, Address)
VALUES
(2, 102, 'Priya', 21, '2005-08-20', 'priya@gmail.com', '9876543211', 'Chennai');

INSERT INTO Students
(Student_ID, Roll_No, Name, Age, Date_of_Birth, Email_ID, Phone_Number, Address)
VALUES
(3, 103, 'Arun', 19, '2007-02-10', 'arun@gmail.com', '9876543212', 'Hyderabad');
