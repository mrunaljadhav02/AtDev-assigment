# Run locally

- Clone the Repo

  ```
  git clone https://github.com/mrunaljadhav02/AtDev-assigment.git

  cd AtDev-assignment
  ```

# Mysql Database

create "studentsdb" named table in mysql using query browser or cmd and add following fields.

```
s_rollno
s_class
s_firstname
s_lastname
s_contactno
```

- Import project in Eclipse / Vs code / IntelliJ Idea and navigate to `main > java > com > mrunal > AtDev-Assignment > AtDevSssigmentApplication.java`

and run the project.

# Test RestAPI

use Postman for testing api

add new Student info in database use following endpoint

```
http://localhost:8080/students

```

method - POST

Json -

```
 {
        "s_rollno": "99",
        "s_class": "FY",
        "s_firstname": "Mangesh",
        "s_lastname": "sharma",
        "s_contactno": "4825402876"
}
```

## Fetch all students data

method - GET

```
http://localhost:8080/students

```

## update students data

method - PUT

```
http://localhost:8080/students

```

Json -
```
 {
        "s_rollno": "99",
        "s_class": "SYBSc",
        "s_firstname": "Mangesh",
        "s_lastname": "sharma",
        "s_contactno": "4825402876"
 }

```


## Delete Student by using by
method - DELETE

```
http://localhost:8080/students/99
```
