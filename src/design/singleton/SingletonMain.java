package design.singleton;

import design.singleton.AClazz;
import design.singleton.BClazz;
import design.singleton.SocketClient;

public class SingletonMain {

    public static void main(String[] args) {

        AClazz aClazz =  new AClazz();
        BClazz bClazz =  new BClazz();

        SocketClient clientA = aClazz.getSocketClient();
        SocketClient clientB = bClazz.getSocketClient();

        System.out.println(clientA == clientB);
        System.out.println(clientA);
        System.out.println(clientB);

    }
}
