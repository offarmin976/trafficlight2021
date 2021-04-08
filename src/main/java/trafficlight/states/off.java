package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class off implements State{

    @Override
    public void nextState() {

    }

    @Override
    public TrafficLightColor getState() {
        return null;
    }
}
