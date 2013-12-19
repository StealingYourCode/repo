drop table test1;

CREATE TABLE test1 
 (
  test_ID NUMBER(3) PRIMARY KEY,
  First_Name VARCHAR2(20),
  Last_Name VARCHAR2(20),
  Age NUMBER(3)
 );
 
  
INSERT INTO test1 (test_ID,First_Name, Last_Name, Age) VALUES (1,'Joe','Blogs',4);
INSERT INTO test1 (test_ID,First_Name, Last_Name, Age) VALUES (2,'Henry','Tudor',55);
INSERT INTO test1 (test_ID,First_Name, Last_Name, Age) VALUES (3,'Super','Man',67);
INSERT INTO test1 (test_ID,First_Name, Last_Name, Age) VALUES (4,'Mickey','Mouse',NULL);
INSERT INTO test1 (test_ID,First_Name, Last_Name, Age) VALUES (5,'William','Shakespear',400);
INSERT INTO test1 (test_ID,First_Name, Last_Name, Age) VALUES (6,'Johnny',null,21);

SELECT * FROM test1;
commit;

update test1 
set first_name='Super',last_name='Man'
where test_ID=3;

CREATE OR REPLACE FUNCTION get_average_age
RETURN test1.Age%type
AS
  l_average test1.age%type;
BEGIN
  SELECT avg(age) AS averageAge
     INTO l_average
  FROM test1;
  
  RETURN l_average;
  
END;
/

show errors function get_average_age;

select get_average_age() from dual;
