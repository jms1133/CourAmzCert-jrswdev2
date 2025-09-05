package exercises.ex11interfacesbuttons;

// Create classes for each button
public class SendButtonClass extends AbstractButtonClass implements ButtonPress {
    String sendTo;
    String message;

    @Override
    public void buttonPress(){
        System.out.printf("Sending %s to %s\n", message, sendTo);
    }

    @Override
    public void onButtonHover() {
        System.out.printf("Hover over %s button.\n", getCaption());
    }


    public void setSendTo(String sendTo){
        this.sendTo = sendTo;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
