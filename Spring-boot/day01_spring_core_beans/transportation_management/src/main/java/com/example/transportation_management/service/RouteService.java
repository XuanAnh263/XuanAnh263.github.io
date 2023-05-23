package com.example.transportation_management.service;

import com.example.transportation_management.entity.Route;
import com.example.transportation_management.model.RouteModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RouteService {
    ObjectMapper objectMapper;
    List<Route> routes = new ArrayList<>();
    private static int AUTO_ID = 100;

    public List<RouteModel> getAllRoutes() {
        List<RouteModel> rs = new ArrayList<>();
        for (int i = 0; i < routes.size(); i++) {
            Route route = routes.get(i);

            RouteModel routeModel = objectMapper.convertValue(route, RouteModel.class);
            rs.add(routeModel);
        }
        return rs;
    }

    public void saveRoute(RouteModel routeModel){
        Route route = objectMapper.convertValue(routeModel, Route.class);
        route.setId(AUTO_ID);
        routes.add(route);
        AUTO_ID++;
    }

    public RouteModel findById(int id) {
        Optional<Route> routeOptional = routes
                .stream()
                .filter(route -> route.getId() == id)
                .findFirst();

        if (routeOptional.isEmpty()) return null;
        Route route = routeOptional.get();
        return objectMapper.convertValue(route,RouteModel.class);
    }

    public void updateRoute(RouteModel routeModel) {
        routes.forEach(route -> {
            if (route.getId() != routeModel.getId()) return;
            route.setDistance(routeModel.getDistance());
            route.setStopPoint(routeModel.getStopPoint());
        });
    }

    public void deleted(int id) {
        routes.removeIf(route -> route.getId() == id);
    }
}
