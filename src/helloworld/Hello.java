package helloworld;

public class Hello implements HelloMBean {

    private String message = null;

    public Hello() {
        message = "hello, world";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void sayHello() {
        System.out.println(message);
    }

}
