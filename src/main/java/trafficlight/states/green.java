package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

    public class green implements State {

        private final TrafficLightCtrl ctrl;

        public green(TrafficLightCtrl crtl)
        {
            this.ctrl = crtl;
        }

        public void nextState()
        {
            ctrl.setCurrentState(ctrl.getRedState());


        }
        public TrafficLightColor getState(){
            return TrafficLightColor.GREEN;
        }
    }

