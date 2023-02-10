package 네트워크예제1번;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("내컴퓨터의 IP 주소 : "+local.getHostAddress());

         InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
         for(InetAddress remote : iaArr){
             System.out.println("네이버 IP 주소 : "+remote.getHostAddress());
         }
    }
}
