package ch14_abstraction.interfaces;

public class AirConditionerController {
    private PowerButton powerButton;
    private TemperatureUpButton temperatureUpButton;
    private TemperatureDownBuntton temperatureDownBuntton;


    public AirConditionerController(PowerButton powerButton, TemperatureUpButton temperatureUpButton,TemperatureDownBuntton temperatureDownBuntton) {
        this.powerButton = powerButton;
        this.temperatureUpButton = temperatureUpButton;
        this.temperatureDownBuntton = temperatureDownBuntton;
    }

    public void onPressedPowerButton(){
        powerButton.onPressed();
    }

    public void onPressedTemperatureButton(){
        temperatureUpButton.onPressed();
    }

    public void onUpTemperatureButton(){
        temperatureUpButton.onUp();
    }

    public void onPressedTemperatureDown(){
        temperatureDownBuntton.onPressed();
    }

    public void onDownTemperatureButton(){
        temperatureDownBuntton.onDown();
    }
}
