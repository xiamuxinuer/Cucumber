package com.vytrack.step_definitions;

import com.vytrack.pages.fleet.VehiclesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

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
        System.out.println("user enters new car information");

        vehiclesPage.setLicencePlateInput(dataTable.get(0).get("License Plate"));
        vehiclesPage.setDriverInput(dataTable.get(0).get("Driver"));
        vehiclesPage.setLocationInput(dataTable.get(0).get("Location"));
        vehiclesPage.setModelYear(dataTable.get(0).get("Model Year"));
        vehiclesPage.setColor(dataTable.get(0).get("Color"));
        vehiclesPage.submit();
        System.out.println("click save and close");
    }

//    |License Plate|Driver|Location|Model Year|Color|
//    |sdet         |pro race|Rome  |2020      |red  |

    @Then("user verifies that car info is displayed")
    public void user_verifies_that_car_info_is_displayed(List<Map<String,String>> dataTable) {
       // Assert.assertEquals(vehiclesPage.getCarGeneralInfo("License Plate"),dataTable.get(0).get("License Plate"));
        for(Map<String, String> row: dataTable){
            Assert.assertEquals(row.get("License Plate"), vehiclesPage.getCarGeneralInfo("License Plate"));
            Assert.assertEquals(row.get("Driver"), vehiclesPage.getCarGeneralInfo("Driver"));
            Assert.assertEquals(row.get("Location"), vehiclesPage.getCarGeneralInfo("Location"));
            Assert.assertEquals(row.get("Model Year"), vehiclesPage.getCarGeneralInfo("Model Year"));
            Assert.assertEquals(row.get("Color"), vehiclesPage.getCarGeneralInfo("Color"));
        }



    }




}
