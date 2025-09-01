package exercises.ex01interfacesbuttons;

public class ForwardButtonClass extends AbstractButtonClass implements ButtonPress{
    String forwardTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.printf("Forwarding %s to %s\n", message, forwardTo);
    }

    @Override
    public void onButtonHover() {
        System.out.printf("Hover over %s button.\n", getCaption());
    }

    public void setForwardTo(String forwardTo){
        this.forwardTo = forwardTo;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
