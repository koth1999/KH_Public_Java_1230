package TV상속;

public class ProtoTypeTV {
    protected boolean isPower; // 전원에 대한 설정값 저장
    protected int channel;
    protected int volume;

    ProtoTypeTV(){
        isPower = false;
        channel = 10;
        volume = 10;
    }

    ProtoTypeTV(boolean isPower, int channel, int volume){
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    void setChannel(int cnl){
        if(cnl>0 && cnl<1000){
            channel = cnl;
        } else{
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
}
