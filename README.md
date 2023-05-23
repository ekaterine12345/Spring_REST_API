# Spring_REST_API

POST http://localhost:8585/university/add
body -> raw -> JSON

{
  "name": "BTU",
  "address": "chvchavadze ave"
}

{
    "data": {
        "status": true
    },
    "errors": {}
}

GET http://localhost:8585/university 


{
    "data": {
        "universities": [
            {
                "id": 1,
                "name": "ILIA",
                "address": "chvchavadzee"
            },
            {
                "id": 2,
                "name": "BTU",
                "address": "chvchavadze ave"
            }
        ]
    },
    "errors": {}
}
