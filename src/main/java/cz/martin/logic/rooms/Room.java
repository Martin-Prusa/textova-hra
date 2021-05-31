package cz.martin.logic.rooms;

public class Room {
    private String name;
    private String text;
    private String buttonText1;
    private String buttonText2;
    private String buttonText3;

    public Room(String title, String text, String btn1Text, String btn2Text, String btn3Text) {
        this.text = text;
        this.name = title;
        this.buttonText1 = btn1Text;
        this.buttonText2 = btn2Text;
        this.buttonText3 = btn3Text;
    }

    public Room choose1() {
        return new Room("x", "x", "x", "x", "x");
    }

    public Room choose2() {
        return new Room("a", "b", "c", "d", "e");
    }

    public Room choose3() {
        return new Room("a", "b", "c", "d", "e");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getButtonText1() {
        return buttonText1;
    }

    public void setButtonText1(String buttonText1) {
        this.buttonText1 = buttonText1;
    }

    public String getButtonText2() {
        return buttonText2;
    }

    public void setButtonText2(String buttonText2) {
        this.buttonText2 = buttonText2;
    }

    public String getButtonText3() {
        return buttonText3;
    }

    public void setButtonText3(String buttonText3) {
        this.buttonText3 = buttonText3;
    }
}
