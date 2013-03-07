Welcome to Kata!

A)
-The pom.xml of this project is set up so you should be able to start coding straight away.

B)
-You can run the project from any workspace you desire, but switching workspaces will require
 you to re-download the template.

C)
-Re-initialise the project:
 Right click the project name 'kataTemplate' go to 'Maven' -> 'Update Project Configuration...' -> 'Ok'
 If you are still receiving red errors, ensure that Maven is configured for your workspace (step F). 

D)
-Create a new package with the same name as the specific Kata you are doing and perform all of your implementation/
 tests in there. (In 'src/main/java' and 'src/test/java', see 'com.fdmgroup.sampleKata' for an example)

E)
-Required imports for jUnit, Mockito and log4j are in 'SampleTest.java'

F)  
-Configure Maven for use with a new workspace:
	1. From the toolbar select 'Window' -> 'Preferences'
	2. Expand 'Maven' on the left hand side
	3. Select 'Installations'
	4. 'Add'
	5. Navigate through 'My Computer' -> C: -> Select 'apache-maven-3.0.3' (the folder) -> Ok
	6. 'Apply'
	7. Select 'User Settings' from the right hand side
	8. The top box on the right hand side should contain 'C:\apache-maven-3.0.3\conf\settings.xml'
	9. Click 'Update Settings'
	10. 'Apply'
 Finally check the version of the SDK you are using
	1. Still in 'Window' -> 'Preferences'
	2. Expand 'Java'
	3. Click 'Installed JREs'
	4. 'jdk1.6.x_xx' should be installed (this likely will not need changing)
	5. Click 'Ok'
 Re-initialise the project once again (step C).	
 
 NOTE:
 You should know how to perform all of part F) for yourself, if you do not, take some time to familiarise
 yourself with the process after the Kata.