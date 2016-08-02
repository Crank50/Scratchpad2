CREATE TABLE Teacher
      (TeacherId int(255) NOT NULL ,
      FirstName varchar(255),
      LastName varchar(255),
      Age int(255),
      Salary double);

CREATE TABLE Student
      (studentId int(255) NOT NULL ,
      firstName varchar(255),
      lastName varchar(255),
      grade int,
      gpa double);

CREATE TABLE Class
      (classId int,
      name varchar(255),
      description varchar(255),
      TeacherId int);

CREATE TABLE ClassStudent
      (classStudentId int,
      classId int,
     studentId int);

Insert Into Teacher Values (1, 'Pamela', 'Irving', 61, 86123.13);
Insert Into Teacher Values (2, 'Johnny', 'Irving', 20, 21523.23);
Insert Into Teacher Values (3, 'Sarah', 'Irving', 25, 981234.56);

Insert Into Class Values (1, 'Math', 'Trigonometry', 1);
Insert Into Class Values (2, 'Math', 'Calculus', 1);

Insert Into Class Values (3, 'Science', 'Physics', 2);
Insert Into Class Values (4, 'Science', 'Astronomy', 2);

Insert Into Class Values (5, 'English', 'Poetry', 3);
Insert Into Class Values (6, 'English', 'American Literature', 3);

Insert Into Student VALUES (1,'Justin','Irving',1,2.1);
Insert Into Student VALUES (2,'Tobias','Irving',9,3.3);
Insert Into Student VALUES (3,'Coron','Irving',5,4.0);
Insert Into Student VALUES (4,'Spencer','Smith',5,2.7);
Insert Into Student VALUES (5,'Derek','Hamilton',10,.9);
Insert Into Student VALUES (6,'Brock','Dehart',7,4.6);
Insert Into Student VALUES (7,'Yun','Jung',6,6.6);
Insert Into Student VALUES (8,'Sunny','Jung',17,3.14);
Insert Into Student VALUES (9,'J-Sik','Jung',1,1.11111111);
Insert Into Student VALUES (10,'Eunny','Jung',4,2.1);

Insert Into ClassStudent VALUES (1,1,1);
Insert Into ClassStudent VALUES (1,2,1);
Insert Into ClassStudent VALUES (1,3,1);

Insert Into ClassStudent VALUES (2,1,2);
Insert Into ClassStudent VALUES (2,2,2);
Insert Into ClassStudent VALUES (2,3,2);

Insert Into ClassStudent VALUES (3,1,3);
Insert Into ClassStudent VALUES (3,2,3);
Insert Into ClassStudent VALUES (3,3,3);

Insert Into ClassStudent VALUES (4,1,4);
Insert Into ClassStudent VALUES (4,2,4);
Insert Into ClassStudent VALUES (4,3,4);

Insert Into ClassStudent VALUES (5,1,5);
Insert Into ClassStudent VALUES (5,2,5);
Insert Into ClassStudent VALUES (5,3,5);

Insert Into ClassStudent VALUES (6,1,6);
Insert Into ClassStudent VALUES (6,2,6);
Insert Into ClassStudent VALUES (6,3,6);

Insert Into ClassStudent VALUES (7,1,7);
Insert Into ClassStudent VALUES (7,2,7);
Insert Into ClassStudent VALUES (7,3,7);

Insert Into ClassStudent VALUES (8,1,8);
Insert Into ClassStudent VALUES (8,2,8);
Insert Into ClassStudent VALUES (8,3,8);

Insert Into ClassStudent VALUES (9,1,9);
Insert Into ClassStudent VALUES (9,2,9);
Insert Into ClassStudent VALUES (9,3,9);

Insert Into ClassStudent VALUES (10,1,10);
Insert Into ClassStudent VALUES (10,2,10);
Insert Into ClassStudent VALUES (10,3,10);

SELECT Teacher.firstName, Teacher.lastName,
      Class.Name From Teacher, Class
Where Teacher.TeacherId = Class.TeacherId;