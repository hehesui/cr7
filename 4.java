import java.sql.*;  
public class MySQLdatabase {  
    public static void main(String[] args) {  
        try {  
            Class.forName("com.mysql.jdbc.Driver"); //load mysql drivers in our application
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "test");                                                                   //connect our application to MySQL Database  
            Statement s = con.createStatement();  
            //s.execute("create table student ( stud_id integer,stud_name varchar(20),stud_address varchar(30) )"); // create a table  
            s.execute("insert into student values(001,'ARman','Delhi')"); // insert first row into the table   
            s.execute("insert into student values(002,'Robert','Canada')"); // insert second row into the table   
            s.execute("insert into student values(003,'Ahuja','Karnal')"); // insert third row into the table   
            ResultSet rs = s.executeQuery("select * from student");  //retrive data, *means all columns
           
                while (rs.next()) // By this line we will step through our data row-by-row  
            {  
                System.out.println("________________________________________");  
                System.out.println("Id of the student: " + rs.getString(1));  
                System.out.println("Name of student: " + rs.getString(2));  
                System.out.println("Address of student: " + rs.getString(3));  
                System.out.println("________________________________________");  
            }  
            s.close(); // close the Statement to let the database know we're done with it  
            con.close(); // close the Connection to let the database know we're done with it  
        } catch (Exception err) {  
            System.out.println("ERROR: " + err);  
        }  
    }  
}  

//EXP 4 Steps

create mysql database steps as follow:
>mysql -u root -p
>password= test
>create database demo;
>use database demo
>create table student values (id varchar2(20),password varchar2(20))
>press "Control+C" to exit from database.
>type "exit"

commands to run the program:-
>set CLASSPATH=./;MYSQL-CONNECTOR-JAVA-8.0.13.jar
>javac MySQLdatabase.java
>java MySQLdatabase

OUTPUT should be display in tables.
if the tables in output are repeated more than 1 time then we need to add a command in database as follow:
>mysql -u root -p
>password= test
>use database demo
>truncate table student;
>press "Control+C" to exit from database.
>type "exit"

then again set classpath compile and run the code.