drop table test1;

CREATE TABLE test1 
 (First_Name VARCHAR2(20) PRIMARY KEY,
  Last_Name VARCHAR2(20),
  Age NUMBER(3)
 );
 
  I
INSERT INTO test1 (First_Name, Last_Name, Age) VALUES ('Joe','Blogs',4);
INSERT INTO test1 (First_Name, Last_Name, Age) VALUES ('Henry','Tudor',55);
INSERT INTO test1 (First_Name, Last_Name, Age) VALUES ('Super','Man',67);
INSERT INTO test1 (First_Name, Last_Name, Age) VALUES ('Mickey','Mouse',NULL);
INSERT INTO test1 (First_Name, Last_Name, Age) VALUES ('William','Shakespear',400);
INSERT INTO test1 (First_Name, Last_Name, Age) VALUES ('Johnny',null,21);

SELECT * FROM test1;
commit;

CREATE OR REPLACE FUNCTION get_avg_age()
RETURN averageAge%type
AS
BEGIN
  SELECT avg(age) as averageAge
  FROM test1
END;

show errors function get_avg_age;

call get_avg_age;
--UPDATE test1 SET first_name = 'Super',last_name = 'Man' WHERE first_name = 'jane' AND last_name = 'smith';