package trafficlight.ctrl;

import trafficlight.gui.TrafficLightGui;
import trafficlight.states.State;
import trafficlight.states.green;
import trafficlight.states.red;
import trafficlight.states.yellow;

public class TrafficLightCtrl {

    private State greenState;

    private State redState;

    private State yellowState;

    private State currentState;

    private State previousState;

    private TrafficLightGui gui;

    private static TrafficLightCtrl instance = new TrafficLightCtrl();        //Singelton Umwandlung

    public static TrafficLightCtrl getInstance()            //Singelton Umwandlung
    {
        return instance;
    }

    private TrafficLightCtrl()  {                           //Singelton Umwandlung
        super();
        initStates();
        gui = new TrafficLightGui(this);
        gui.setVisible(true);
    }

    private void initStates() {
        //TODO create the states and set current and previous states

        this.redState = new red(this);
        this.yellowState = new yellow(this);
        this.greenState = new green(this);


        setCurrentState(redState);
        setPreviousState(greenState);

    }

    public State getGreenState() {
        return greenState;
    }

    public State getRedState() {
        return redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }

    public void run() {
        gui.run();
    }

    public void nextState() {

        getCurrentState().nextState();
        gui.setLight(getCurrentState().getState());



    }
}