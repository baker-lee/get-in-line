package com.example.getinline.controller.api;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.URI;
import java.util.List;

import static org.springframework.web.servlet.function.ServerResponse.created;
import static org.springframework.web.servlet.function.ServerResponse.ok;

@Component
public class ApiPlaceHandler {

    public ServerResponse getPlaces(ServerRequest request){
        return ok().body(List.of("place1", "place2"));
    }
    public ServerResponse CreatePlace(ServerRequest request){
        return created(URI.create("/api/places/1")).body(true); //TODO:
    }
    public ServerResponse getPlace(ServerRequest request){
        return ok().body("place " + request.pathVariable("placeId"));
    }
    public ServerResponse modifyPlaces(ServerRequest request){
        return ok().body(true);
    }
    public ServerResponse removePlaces(ServerRequest request){
        return ok().body(true);
    }
}
