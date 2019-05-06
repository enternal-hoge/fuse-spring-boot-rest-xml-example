# fuse-spring-boot-rest-xml-example
Red Hat Fuse Spring Boot REST API Example

## Usage

```
mvn spring-boot:run
```

## Confirm

GET http://localhost:8080/hoge
```
[
    {
        "id": 123,
        "name": "first hoge"
    },
    {
        "id": 456,
        "name": "second hoge"
    },
    {
        "id": 789,
        "name": "third hoge"
    }
]
```

GET http://127.0.0.1:8080/hoge/123
```
{
    "id": 123,
    "name": "first hoge"
}
```

POST http://localhost:8080/hoge
```
{
    "id": 100,
	"name": "page"
}
```

GET http://127.0.0.1:8080/hoge/100
```
{
    "id": 100,
	"name": "page"
}
```

PUT http://localhost:8080/hoge
```
{
    "id": 100,
	"name": "foo"
}
```

GET http://127.0.0.1:8080/hoge/100
```
{
    "id": 100,
    "name": "foo"
}
```

DELETE http://127.0.0.1:8080/hoge/100
```
{
    "id": 100,
    "name": "foo"
}
```

GET http://localhost:8080/hoge
```
[
    {
        "id": 123,
        "name": "first hoge"
    },
    {
        "id": 456,
        "name": "second hoge"
    },
    {
        "id": 789,
        "name": "third hoge"
    }
]
```
