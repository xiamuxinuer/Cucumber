package com.vytrack.step_definitions;

import com.vytrack.pages.fleet.VehiclesPage;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinition {
  VehiclesPage vehiclesPage=new VehiclesPage();


    @Then("user clicks on create a car button")
    public void user_clicks_on_create_a_car_button() {
        System.out.println("user clicks on create a car button");
        vehiclesPage.clickToCreateCar();
    }

    @Then("user creates a car with following info:")
    public void user_creates_a_car_with_following_info(List<Map<String,String>> dataTable) {



    }





}
