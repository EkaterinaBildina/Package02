package client;

public interface IView {
        void sendMessage(String message);
        void connectedToServer();
        void disconnectedFromServer();
}