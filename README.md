# DummyApi
Rest APIs using spring boot
#Dummy API for testing UI
#MyDummyApi #dummyapi #testapi

1.Download Zip file to clone.
API URL: 

Root api: https://mydummyapi.herokuapp.com/

End Point:
Add Employee: https://mydummyapi.herokuapp.com/api/employee/add
              payload=>
              {"employeeName":"fwerferf","age":22,"gender":"MALE","salary":34000,"imgUrl":"www.abcv.com"}
              
Delete Employee: https://mydummyapi.herokuapp.com/api/employee/delete/1
              playload=>
              employeeId in url
Get employee:  https://mydummyapi.herokuapp.com/api/employee/get
              no body
Update Employee: https://mydummyapi.herokuapp.com/api/employee/put/1
              payload=>
              {"employeeName":"tasaaahi","age":22,"gender":"MALE","salary":34000,"imgUrl":"www.abcv.com","id": 1}

Enjoy Coding....

Heroku deploy step.

1.heroku login
2.git add .
3.git push heroku master

//check log
heroku logs -t

//Get heroku application detail
heroku info
