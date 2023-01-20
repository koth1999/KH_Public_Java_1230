package 중첩인터페이스;

public class Button {
    OnClickListener listener; // 외부에서 생성된 객체의 주소가 대입

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }
}
