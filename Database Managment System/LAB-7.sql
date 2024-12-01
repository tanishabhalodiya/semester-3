------------------------lab-7--------------------------------------
------------------------part-a-------------------------------------

CREATE TABLE EMP(
EID INT,
ENAME VARCHAR(50),
DEPARTMENT VARCHAR(50),
SALARY INT,
JOININGDATE DATE,
CITY VARCHAR(50)
)

INSERT INTO EMP VALUES
(101 ,'Rahul', 'Admin',56000 ,'1-Jan-90','Rajkot'),
(102 ,'Hardik', 'IT',18000, '25-Sep-90', 'Ahmedabad'),
(103 ,'Bhavin', 'HR', 25000, '14-May-91' ,'Baroda'),
(104 ,'Bhoomi', 'Admin', 39000, '8-Feb-91', 'Rajkot'),
(105 ,'Rohit', 'IT', 17000, '23-Jul-90', 'Jamnagar'),
(106 ,'Priya', 'IT', 9000, '18-Oct-90','Ahmedabad'),
(107 ,'Bhoomi', 'HR', 34000, '25-Dec-91', 'Rajkot');

SELECT * FROM EMP





--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
SELECT MIN(SALARY) AS MINIMUM,MAX(SALARY) AS MAXIMUM FROM EMP

--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,respectively.
SELECT SUM(SALARY) AS TOTAL_SALARY,AVG(SALARY) AS AVERAGE_SALARY FROM EMP

--3. Find total number of employees of EMPLOYEE table.
SELECT COUNT(*) AS TOATL_EMPLYEE FROM EMP

--4. Find highest salary from Rajkot city.
SELECT MAX(SALARY) AS HIGHEST_SALARY  FROM EMP WHERE CITY='RAJKOT'

--5. Give maximum salary from IT department.
SELECT MAX(SALARY) AS HIGHEST_SALARY FROM EMP WHERE DEPARTMENT='IT'

--6. Count employee whose joining date is after 8-feb-91.
SELECT COUNT(*) AS TOTAL FROM EMP WHERE JOININGDATE >'1991-FEB-8'

--7. Display average salary of Admin department.
SELECT AVG(SALARY) AS AVERAGE_SALARY FROM EMP WHERE DEPARTMENT='HR'

--8. Display total salary of HR department.
SELECT SUM(SALARY) AS TOTAL_SALARY FROM EMP WHERE DEPARTMENT='HR'

--9. Count total number of cities of employee without duplication.
SELECT COUNT(DISTINCT CITY) AS TOTAL_CITY FROM EMP

--10. Count unique departments.
SELECT COUNT(DISTINCT DEPARTMENT) AS TOATL_DEPARTMENT FROM EMP

--11. Give minimum salary of employee who belongs to Ahmedabad.
SELECT MIN(SALARY) AS MINIMUM_SALARY FROM EMP WHERE CITY='AHMEDABAD' 

--12. Find city wise highest salary.
SELECT CITY,MAX(SALARY) AS HIGHEST_SALARY FROM EMP GROUP BY CITY 

--13. Find department wise lowest salary.
SELECT DEPARTMENT,MIN(SALARY) AS LOWEST_SALARY FROM EMP GROUP BY DEPARTMENT

--14. Display city with the total number of employees belonging to each city.
SELECT CITY,COUNT(EID) AS TOTAL_EMP FROM EMP GROUP BY CITY

--15. Give total salary of each department of EMP table.
SELECT DEPARTMENT,SUM(SALARY) AS TOTAL_SALARY FROM EMP GROUP BY DEPARTMENT

--16. Give average salary of each department of EMP table without displaying the respective departmentname
SELECT DEPARTMENT,AVG(SALARY) AS AVERAGE_SALARY FROM EMP GROUP BY DEPARTMENT



-------------------------------------PART-B--------------------------------
--1. Count the number of employees living in Rajkot.
SELECT COUNT(ENAME) AS TOATL_EMPLOYEE FROM EMP WHERE CITY='RAJKOT'

--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.SELECT MIN(SALARY) AS LOWEST_SALARY,MAX(SALARY) AS HIGHEST_SALARY FROM EMP--3. Display the total number of employees hired before 1st January, 1991.SELECT COUNT(ENAME) AS TOTAL_EMPLYEE FROM EMP WHERE JOININGDATE<'1991-JAN-1' GROUP BY DEPARTMENT-----------------------------------PART-C----------------1. Count the number of employees living in Rajkot or Baroda.
SELECT COUNT(ENAME) AS TOTAL_EMP FROM EMP WHERE CITY IN ('RAJKOT','BARODA')

--2. Display the total number of employees hired before 1st January, 1991 in IT department.
SELECT COUNT(ENAME) AS TOTAL_EMP FROM EMP WHERE DEPARTMENT='IT' AND JOININGDATE<'1991-JAN-1'

--3. Find the Joining Date wise Total Salaries.
SELECT JOININGDATE,SUM(SALARY) AS TOTAL_SALARY FROM EMP GROUP BY JOININGDATE

--4. Find the Maximum salary department & city wise in which city name starts with ‘R’
SELECT CITY,DEPARTMENT,MAX(SALARY) AS MAXIMUM_SALARY FROM EMP WHERE CITY LIKE 'R%' GROUP BY CITY,DEPARTMENT

--FIND DEPARTMENT WISE HIGHEST PAID EMPLYEE NAME
SELECT DEPARTMENT,
		ENAME AS HIGHEST_PAID_EMPLOYEE,
		SALARY AS HIGHEST_SALARY
FROM EMP
WHERE SALARY IN(
	SELECT MAX(SALARY)
	FROM EMP
	GROUP BY DEPARTMENT);
