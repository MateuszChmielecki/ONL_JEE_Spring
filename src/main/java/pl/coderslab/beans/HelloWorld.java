package pl.coderslab.beans;

public class HelloWorld {
    private String message;


    public HelloWorld() {

    }

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
