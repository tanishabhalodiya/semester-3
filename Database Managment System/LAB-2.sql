--1. Retrieve all data from table DEPOSIT.
SELECT * FROM DEPOSITE

--2. Retrieve all data from table BORROW.
SELECT * FROM BORROW

--3. Retrieve all data from table CUSTOMERS. 
SELECT * FROM CUSTOMERS

--4. Display Account No, Customer Name & Amount from DEPOSIT.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE

--5. Display Loan No, Amount from BORROW.
SELECT LOANNO,AMOUNT FROM BORROW

--6. Display loan details of all customers who belongs to �ANDHERI� branch from borrow tablE
SELECT LOANNO FROM BORROW WHERE BNAME='ANDHERI'

--7. Give account no and amount of depositor, whose account no is equals to 106 from depoSITE TABLE
SELECT ACTNO,AMOUNT FROM DEPOSITE WHERE ACTNO=106

--8. Give name of borrowers having amount greater than 5000 from borrow table. 
SELECT BNAME FROM BORROW WHERE AMOUNT > 5000

--9. Give name of customers who opened account after date '1-12-96' from deposit table. 
SELECT CNAME FROM DEPOSITE WHERE ADATE > 1196-12-1

--10. Display name of customers whose account no is less than 105 from deposit table.
SELECT CNAME FROM DEPOSITE WHERE ACTNO < 105

--11. Display name of customer who belongs to either �NAGPUR� or �DELHI� from customer table. (OR & IN)
SELECT CNAME FROM CUSTOMERS WHERE CITY='NAGPUR' OR CITY='DELHI'

--11. Display name of customer who belongs to either �NAGPUR� or �DELHI� from customer table. (OR & IN)
SELECT CNAME FROM CUSTOMERS WHERE CITY IN('NAGPUR' , 'DELHI')

--12. Display name of customers with branch whose amount is greater than 4000 and account no is less than 105 from deposite table
SELECT CNAME,BNAME FROM DEPOSITE WHERE AMOUNT > 4000 AND ACTNO < 105

--13.Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow table. (AND & BETWEEN)
SELECT * FROM BORROW WHERE AMOUNT>=3000 AND AMOUNT<=8000

--13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow TABLE.
SELECT * FROM BORROW WHERE AMOUNT BETWEEN 3000 AND 8000

--14. Find all depositors who do not belongs to �ANDHERI� branch from deposit table.
SELECT * FROM DEPOSITE WHERE BNAME <> 'ANDHERI'

--15. Display Account No, Customer Name & Amount of such customers who belongs to �AJNI�, �KAROLBAGH�Or �M.G.ROAD� and Account No is less than 104 from deposit table.
SELECT ACTNO , CNAME, AMOUNT FROM DEPOSITE WHERE BNAME IN('AJNI','KAROLBAGH','M.G.ROAD') AND ACTNO < 104

----------------------PART-B------------------------

--1. Display all the details of first five customers from deposit table.
SELECT TOP 5 * FROM DEPOSITE

--2.Display all the details of first three depositors whose amount is greater than 1000
SELECT TOP 3 * FROM DEPOSITE WHERE AMOUNT>1000

--3. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to �ANDHERI� from borrow table.
SELECT TOP 5 LOANNO,CNAME FROM BORROW WHERE BNAME <> 'ANDHERI'

--4. Retrieve all unique cities using DISTINCT. 
SELECT DISTINCT CITY FROM CUSTOMERS

--5. Retrieve all unique branches using DISTINCT.
SELECT DISTINCT CITY FROM BRANCH

--------------------------PART - C---------------

--1.Retrieve top 50% record from table BORROW
SELECT TOP 50 PERCENT * FROM BORROW

--2. Display top 10% amount from table DEPOSIT
SELECT TOP 10 PERCENT AMOUNT FROM DEPOSITE

--3.Display top 25% customer who deposited more than 5000.
SELECT TOP 25 PERCENT CNAME FROM DEPOSITE WHERE AMOUNT > 5000

--4. Retrieve first 10% Loan Amounts.
SELECT TOP 25 PERCENT LOANNO FROM BORROW 

--5. Retrieve all unique customer names with city.
SELECT DISTINCT CNAME,CITY FROM CUSTOMERS
--6. Retrieve all Loan records with one more column in Loan Amount as 10% extra amount.
SELECT * 
--7. Retrieve all odd/even value loan number from Borrow table.
SELECT LOANNO FROM BORROW WHERE LOANNO%2 = 0
