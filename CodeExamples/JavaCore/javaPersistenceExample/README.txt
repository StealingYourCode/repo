inside META-INF directory there is a file called 
persistence.xml. This file contains information about the 
database and other things, if you want to test the application
(if we can call it an application as it contains 2 classes!)
 then you need to add your database details there.

Also, don't worry about creating the tables in the database
they will be automatically created by the following line of 
code in persistence.xml.

<property name="hibernate.hbm2ddl.auto" value="create" />

Thanks,

Hernan