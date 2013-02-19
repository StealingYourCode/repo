DROP TABLE example_users CASCADE CONSTRAINTS;
CREATE TABLE example_users (
  username VARCHAR2(100) PRIMARY KEY,
  address VARCHAR2(250)
);
INSERT INTO example_users VALUES(
  'aPerson',
  'My Address'
);
INSERT INTO example_users VALUES(
  'aNormalPerson',
  'My Address as well'
);
COMMIT;
DROP TABLE tomcat_users;
DROP TABLE tomcat_user_roles;
CREATE TABLE tomcat_users (
  user_name VARCHAR2(15) NOT NULL PRIMARY KEY,
  user_pass VARCHAR2(15) NOT NULL
);
CREATE TABLE tomcat_user_roles (
  user_name VARCHAR2(15) NOT NULL,
  role_name VARCHAR2(15) NOT NULL,
  PRIMARY KEY(user_name, role_name)
);
INSERT INTO tomcat_users (
  user_name,
  user_pass
) VALUES (
  'aPerson',
  'javaROX!'
);
INSERT INTO tomcat_users (
  user_name,
  user_pass
) VALUES (
  'aNormalPerson',
  'javaROX!'
);
INSERT INTO tomcat_user_roles (
  user_name,
  role_name
) VALUES (
  'aPerson',
  'admin'
);
INSERT INTO tomcat_user_roles (
  user_name,
  role_name
) VALUES (
  'aPerson',
  'user'
);
INSERT INTO tomcat_user_roles (
  user_name,
  role_name
) VALUES (
  'aNormalPerson',
  'user'
);
COMMIT;