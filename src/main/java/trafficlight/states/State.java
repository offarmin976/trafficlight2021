package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public interface State {

    void nextState();
    public TrafficLightColor getState();



}