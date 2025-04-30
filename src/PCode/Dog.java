package PCode;

public class Dog extends Animal {

    @Override
    public void speak(String smg) {
        super.speak("Dog Speak: " + smg);
    }

    @Override
    public void color(String color) {
        super.color("Dog Color: " + color);
    }
}
