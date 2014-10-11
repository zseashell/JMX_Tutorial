package helloworld;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import javax.management.MBeanServer;
import javax.management.ObjectName;

public class SimpleAgent {

    private MBeanServer mbs = null;

    public SimpleAgent() {
        // get the platform MBeanServer
        mbs = ManagementFactory.getPlatformMBeanServer();

        // register MBean
        Hello helloBean = new Hello();
        ObjectName helloName = null;

        try {
            helloName = new ObjectName("Foo:name=HelloBean");
            mbs.registerMBean(helloBean, helloName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private  void waitForEnterPressed() {
        System.out.println("Press enter button to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SimpleAgent agent = new SimpleAgent();
        System.out.println("Simple agent is running...");
        agent.waitForEnterPressed();
    }
}
