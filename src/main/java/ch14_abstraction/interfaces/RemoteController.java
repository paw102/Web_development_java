package ch14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private  ChannelUpButton channelUpButton;
    private  VolumeUpButton volumeUpButton;
    private  VolumeDownButton volumeDownButton;

    /*
        AllArgsConstructor 를 정의하시오.
     */

    public RemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    // 메서드 정의
    // PowerButton 메서드 구현
    public void onPressedPowerButton(){
        powerButton.onPressed();    // 필드로 powerButton 객체를 지니고 있기 때문에 powerButton 클래스에서 정의했던 메서드를 호출 가능
    }

    //ChannelDownButton 의 메서드 구현

    // 채널 한칸 내릴 때 실행되는 메서드
    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }

    // 채널 다운 버튼을 꾹 눌렀을 때 실행되는 메서드
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
}
