package no.bouvet.p2pcommunication.listener.multicast;

public interface MulticastMessageReceivedListener {

    void onMulticastMessageReceived(String receivedMessage, String senderIpAddress);
}
