package ch14_abstraction.interfaces;

public class Main2 {
    public static void main(String[] args) {
        AirConditionerController airConditionerController = new AirConditionerController(new PowerButton(), new TemperatureUpButton(), new TemperatureDownBuntton());

        airConditionerController.onPressedPowerButton();

        System.out.println();

        airConditionerController.onPressedTemperatureButton();
        airConditionerController.onUpTemperatureButton();

        System.out.println();

        airConditionerController.onPressedTemperatureDown();
        airConditionerController.onDownTemperatureButton();

        System.out.println();

        airConditionerController.onPressedPowerButton();
    }

}
