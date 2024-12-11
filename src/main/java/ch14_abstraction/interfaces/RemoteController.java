package ch14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private  ChannelUpButton channelUpButton;
    // 추가된 필드
    private  VolumeUpButton volumeUpButton;
    private  VolumeDownButton volumeDownButton; // 이 필드를 추가하는 순간 ALlArgsConstructor 가 아님.
    // 그렇기 때문에 밑에 있는 생성자들을 수정 할 필요가 있음.

    /*
        AllArgsConstructor 를 정의하시오.
     */

    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        // 소괄호 내에 매개변수를 수정했기 떄문에 이하의 코드가 필요함.
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
        // 마찬가지로 이걸 완성하는 순간 Main 클래스에서도 오류가 발생함. -> 아까전에는 Main 이 AllArgs를 만족했지만 이젠 아님.
    }

    // 메서드 정의
    // PowerButton 메서드 구현
    public void onPressedPowerButton(){
        powerButton.onPressed();    // 필드로 powerButton 객체를 지니고 있기 때문에 powerButton 클래스에서 정의했던 메서드를 호출 가능
    }

    //ChannelDownButton 의 메서드 구현

    // 채널 다운 버튼을 꾹 눌렀을 때 실행되는 메서드
    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }

    // 채널 한칸 내릴 때 실행되는 메서드
    public void onPressedDownButton(){
        channelDownButton.onPressed();
    }

    public void onUpChannelUpButton(){
        channelUpButton.onUp();
    }

    //ChannelUpButton 의 메서드 구현
    public void onPressedUpButton(){
        channelUpButton.onPressed();
    }

    public void onPressedUpVolume(){
        volumeUpButton.onPressed();
    }

    public void onUpVolumeButton(){
        volumeUpButton.onUp();
    }

    public void onPressedDownVolume(){
        volumeDownButton.onPressed();
    }

    public void onDownVolumeButton(){
        volumeDownButton.onDown();
    }

    // VolumeDownButton 매서드 구현 2개임.
    // VolumeUpButton 메서드 구현 2개임.
}
