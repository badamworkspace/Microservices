# Microservices

FlightService
-------------
GET http://localhost:8082/api/v1.0/airlines----->SearchResult

POST http://localhost:8082/api/v1.0/airlines
Body:
{
    "flightNumber":1,
	"airline":"SpiceJet",
	"fromPlace":"Hyderabad",
	"toPlace":"Chennai",
	"startDate":"10-11-2021",
    "startTime":"10:00 AM",
	"endDate":"10-11-2021",
    "endTime":"11:00 AM",
	"instrumentUsed":"A320",
	"meal":"Veg",
    "status":"Active",
    "price":"1000"
}

GET http://localhost:8082/api/v1.0/airlines/{startDate}------>SearchResult

POST http://localhost:8082/api/v1.0/flight/search
Body:
{
    "fromPlace": "Hyderabad",
    "toPlace": "Chennai",
    "startDate": "10-11-2021"
}

GET http://localhost:8082/v2/api-docs/
***********************************************************
***********************************************************

UserService
-----------

POST http://localhost:8083/api/v1.0/flight/booking
Body:
{
    "flightNumber":1,
	"startDate":"10-11-2021",
	"startTime":"10:00",
	"fromPlace":"Hyderabad",
	"toPlace":"Chennai",
	"name":"Bhanuteja",
	"email":"bhanuteja@Gmail.com",
	"numberOfSeats":1,
	 "passenger":[{
        "name":"Bhanuteja",
        "gender":"male",
        "age":10
     }],
	"meal":"Veg"	
}

GET http://localhost:8083/api/v1.0/flight/ticket/{pnr}

GET http://localhost:8083/api/v1.0/flight/tickets/{email}

DELETE http://localhost:8083/api/v1.0/flight/cancel/{pnr}
******************************************************************
******************************************************************

Admin
------

POST http://localhost:8080/authenticate
Body:
{
    "username":"admin",
    "password":"password"
}

POST http://localhost:8080/airlines
Body:
{
    "flightNumber":3,
	"airline":"Jazz",
	"fromPlace":"Hyderabad",
	"toPlace":"Chennai",
	"startDate":"10-11-2021",
    "startTime":"10:00",
	"endDate":"10-11-2021",
    "endTime":"11:00",
	"instrumentUsed":"A320",
	"meal":"Veg",
    "status":"Active",
    "price":"1000"
}
