TAXI 24 is an API based software that provides solutions to Taxi24 in Kigali

it is a RESTFul based API

1. to get all drivers send a GET request to
     http:localhost:9090/api/drivers/all
     
2. to get one driver send a GET request to with Id
     http:localhost:9090/api/drivers/{id}
    
3. to get all riders send a GET request to
        http:localhost:9090/api/riders/all
      
4. to get one rider by id send a GET request to this where id is rider's ID
        http:localhost:9090/api/find/{id}
        
5. to create a trip send a POST request containing riders ID and drivers's Id
        http:localhost:9090/api/trips/create/{riderId}/{driverId}
        
6. to get all active trips send a GET request to
        http:localhost:9090/api/trips/active
        
7. to complete a trip send a PUT request to
        http:localhost:9090/api/trip/complete/{tripId}               
        

