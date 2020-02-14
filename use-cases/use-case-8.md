#USE CASE: Delete an employee's details so that the company is compliant with data retention legislation.

##CHARACTERISTIC INFORMATION

####Goal in Context
As an HR advisor I want to delete an employee's details so that the company is compliant with data retention legislation.

####Scope
Company.

####Level
Primary task.

####Preconditions
We know the role. Database contains current employee data.

####Success End Condition
A deletion of employees data is available for HR.

####Failed End Condition
No report is produced.

####Primary Actor
HR Advisor.

####Trigger
A request for finance information is sent to HR.

##MAIN SUCCESS SCENARIO
Finance request salary information for a given role.
HR advisor captures name of the role to get salary information for.
HR advisor extracts current salary information of all employees of the given role.
HR advisor provides report to finance.

##EXTENSIONS
Role does not exist:
HR advisor informs finance no role exists.

##SUB-VARIATIONS
None.

##SCHEDULE
DUE DATE: Release 1.0