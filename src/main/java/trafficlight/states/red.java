package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class red implements State {

    private final TrafficLightCtrl ctrl;

    public red(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void nextState()
    {
        ctrl.setCurrentState(ctrl.getYellowState());

    }
    public TrafficLightColor getState(){
        return TrafficLightColor.RED;
    }
}
