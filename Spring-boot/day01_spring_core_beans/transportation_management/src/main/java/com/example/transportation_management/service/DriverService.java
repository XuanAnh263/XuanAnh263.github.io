package com.example.transportation_management.service;

import com.example.transportation_management.entity.Driver;
import com.example.transportation_management.model.DriverModel;
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
public class DriverService {
    ObjectMapper objectMapper;

    List<Driver> drivers = new ArrayList<>();
    private static int AUTO_ID = 10000;
    public List<DriverModel> getAllDrivers() {
        List<DriverModel> rs = new ArrayList<>();
        for (int i = 0; i < drivers.size(); i++) {
            Driver driver = drivers.get(i);
            //convert entity --> model
            DriverModel driverModel = objectMapper.convertValue(driver, DriverModel.class);
            rs.add(driverModel);
        }
        return rs;
    }

    public void  saveDriver(DriverModel driverModel) {
        //convert từ model --> entity
        Driver driver = objectMapper.convertValue(driverModel, Driver.class);
        driver.setId(AUTO_ID);
        drivers.add(driver);
        AUTO_ID++;
    }

    public DriverModel findById(int id) {
        Optional<Driver> driverOptional  = drivers
                .stream()
                .filter(driver -> driver.getId() == id)
                .findFirst();
        if (driverOptional.isEmpty()) return null;

        Driver driver = driverOptional.get();
        return objectMapper.convertValue(driver, DriverModel.class);
    }

    public void updateDriver(DriverModel driverModel) {
        drivers.forEach(driver -> {
            if (driver.getId() != driverModel.getId()) return;
            driver.setName(driverModel.getName());
            driver.setAddress(driverModel.getAddress());
            driver.setPhone(driverModel.getPhone());
            driver.setDriverLevel(driverModel.getDriverLevel());
        });
    }

    public void deleted(int id) {
        drivers.removeIf(driver -> driver.getId() == id);
    }

}
