import trafficlight.ctrl.TrafficLightCtrl;


public class MCP {
    public static void main(String[] args) {
        TrafficLightCtrl ctrl =  TrafficLightCtrl.getInstance();        //Singelton Umwandlung
        ctrl.run();
    }
}