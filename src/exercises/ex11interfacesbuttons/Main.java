package exercises.ex11interfacesbuttons;

public class Main {
    public static void main(String[] args) {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send");
        sendButton.setSendTo("test@example.com");
        sendButton.setMessage("This is a test message");
        sendButton.onButtonHover();
        sendButton.buttonPress();

        ForwardButtonClass forwardButton = new ForwardButtonClass();
        forwardButton.setCaption("Forward");
        forwardButton.setForwardTo("x@y.com");
        forwardButton.setMessage("Hello World!");
        forwardButton.onButtonHover();
        forwardButton.buttonPress();
    }
}
