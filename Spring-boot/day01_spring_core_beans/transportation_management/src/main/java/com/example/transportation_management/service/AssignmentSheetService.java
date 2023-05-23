package com.example.transportation_management.service;

import com.example.transportation_management.entity.AssignmentSheet;
import com.example.transportation_management.entity.Driver;
import com.example.transportation_management.entity.Route;
import com.example.transportation_management.model.AssignmentSheetModel;
import com.example.transportation_management.model.DriverModel;
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
public class AssignmentSheetService {
    ObjectMapper objectMapper;
    DriverService driverService;
    RouteService routeService;
    List<AssignmentSheet> assignmentSheets = new ArrayList<>();
    private static int AUTO_ID = 1;

    public List<AssignmentSheetModel> getAllAssignment() {
        List<AssignmentSheetModel> rs = new ArrayList<>();
        assignmentSheets.forEach(assignmentSheet -> {
            AssignmentSheetModel assignmentSheetModel = AssignmentSheetModel.builder()
                    .id(assignmentSheet.getId())
                    .driverId(assignmentSheet.getDriver().getId())
                    .driverName(assignmentSheet.getDriver().getName())
                    .routeId(assignmentSheet.getRoute().getId())
                    .numberOfTurns(assignmentSheet.getNumberOfTurns())
                    .date(assignmentSheet.getDate())
                    .build();
            rs.add(assignmentSheetModel);
        });
        return rs;
    }

    public void saveAssignment(AssignmentSheetModel assignmentSheetModel) {
        if (assignmentSheetModel == null) return;

        Integer driverId = assignmentSheetModel.getDriverId();
        DriverModel driverModel = driverService.findById(driverId);
        Driver driver = objectMapper.convertValue(driverModel, Driver.class);
        if (driver == null) return;

        Integer routeId = assignmentSheetModel.getRouteId();
        RouteModel routeModel = routeService.findById(routeId);
        Route route = objectMapper.convertValue(routeModel, Route.class);
        if (route == null) return;

        AssignmentSheet assignmentSheet = AssignmentSheet.builder()
                .driver(driver)
                .route(route)
                .numberOfTurns(assignmentSheetModel.getNumberOfTurns())
                .date(assignmentSheetModel.getDate())
                .build();

        assignmentSheet.setId(AUTO_ID);
        assignmentSheets.add(assignmentSheet);
        AUTO_ID++;
    }

    public AssignmentSheetModel findById(int id) {
        for (AssignmentSheet a: assignmentSheets) {
            if (a.getId() == id) {
                return AssignmentSheetModel.builder()
                        .id(a.getId())
                        .driverId(a.getDriver().getId())
                        .driverName(a.getDriver().getName())
                        .routeId(a.getRoute().getId())
                        .numberOfTurns(a.getNumberOfTurns())
                        .date(a.getDate())
                        .build();
            }
        }
        return null;
    }

    public void updateAssignmentSheet(AssignmentSheetModel assignmentSheetModel) {
        assignmentSheets.forEach(assignmentSheet -> {
            if (assignmentSheet.getId() != assignmentSheetModel.getId()) {
                return;
            }
            DriverModel driverModel = driverService.findById(assignmentSheetModel.getDriverId());
            Driver driver = objectMapper.convertValue(driverModel, Driver.class);

            RouteModel routeModel = routeService.findById(assignmentSheetModel.getRouteId());
            Route route = objectMapper.convertValue(routeModel, Route.class);

            assignmentSheet.setDriver(driver);
            assignmentSheet.setRoute(route);
            assignmentSheet.setNumberOfTurns(assignmentSheetModel.getNumberOfTurns());
            assignmentSheet.setDate(assignmentSheetModel.getDate());
        });
    }
}
