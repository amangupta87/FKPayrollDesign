# FKPayrollDesign

First Go to SourceCode dircetory.
Then compile any file(file_name.java) with the following command

```
javac -cp json-simple-1.1.jar file_name.java
```
Then run with the following command

```
java -cp .:json-simple-1.1.jar file_name
```

This is because of external json.simple library. It did not add properly to classpath, hence this modification is done in compiling and running.

## Assumptions

1. I am taking input of all the functionalities from user from command line and hence I am expecting that the user will be in the exact format(for e.g. in capitals) for the questions asked.
2. To run any functionality you need to run specific file with above commands. I have assumed that we are manually running PayRoll every day.
3. I am paying FLAT salary type employees on last working day of each month and HOURLY salary type employees are paid extra compensation on each Friday and SALES type employees are paid basic monthly salary on last working day of month and commission based on their sales is credited into their account each Friday.
