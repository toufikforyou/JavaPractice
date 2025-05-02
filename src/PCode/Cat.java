package PCode;

public class Cat extends Animal {

    @Override
    public void speak(String smg) {
        super.speak("Cat Speak: " + smg);
    }

    @Override
    public void color(String color) {
        super.color("Cat Color: " + color);
    }
}
