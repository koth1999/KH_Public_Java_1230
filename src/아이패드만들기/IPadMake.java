package 아이패드만들기;

public class IPadMake {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            IPadPro iPad = new IPadPro("IPad Pro");
            if(!iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNumber();
            iPad.inProductionPad();
            iPad.viewProductPad();
        }
    }
}
