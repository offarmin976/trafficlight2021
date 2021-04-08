package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

    public class yellow implements State {

        private final TrafficLightCtrl ctrl;

        public yellow(TrafficLightCtrl ctrl)
        {
            this.ctrl = ctrl;
        }

        public void nextState()
        {
            ctrl.setCurrentState(ctrl.getGreenState());

        }
        public TrafficLightColor getState(){
            return TrafficLightColor.YELLOW;
        }
    }
