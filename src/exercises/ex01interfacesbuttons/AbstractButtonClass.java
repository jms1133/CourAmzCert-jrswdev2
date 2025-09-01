package exercises.ex01interfacesbuttons;

abstract class AbstractButtonClass {
    String caption;

    // setCaption() and getCaption() methods are non-abstract (concrete), so they are reused in the subclasses without overriding.
    public void setCaption(String caption){
        this.caption = caption;
    }
    public String getCaption(){
        return this.caption;
    }

}
