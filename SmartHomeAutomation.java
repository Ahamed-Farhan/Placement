import java.util.*;

class SmartHome {

    final static class Device {
        final static int MAX_DEVICES = 50;
        int ID;
        String Name;

        final void getDeviceInfo() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Device ID: ");
            this.ID = in.nextInt();
            in.nextLine();
            System.out.print("Enter Device Name: ");
            this.Name = in.nextLine();
            System.out.println("Device ID: " + ID + "\nDevice Name: " + Name);
        }
    }

    final static class Configuration {
        final static int MAX_POWER_LIMIT = 5000;
    }

    abstract static class DeviceType {
        abstract void getDeviceCategory();
    }

    final static class LightDevice extends DeviceType {
        void getDeviceCategory() {
            System.out.println("Category: Light Device");
        }
    }

    final static class FanDevice extends DeviceType {
        void getDeviceCategory() {
            System.out.println("Category: Fan Device");
        }
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SmartHome.Device device = new SmartHome.Device();
        device.getDeviceInfo();

        System.out.println("Max Power Limit: " + SmartHome.Configuration.MAX_POWER_LIMIT);
        if(device.ID==1){
            SmartHome.LightDevice light = new SmartHome.LightDevice();
            light.getDeviceCategory();
        }
        else if(device.ID==2){
            SmartHome.FanDevice fan = new SmartHome.FanDevice();
            fan.getDeviceCategory();
        }
        else{
            System.out.println("Invalid Device ID. Please enter 1 for Light or 2 for Fan.");
        }
    }
}
