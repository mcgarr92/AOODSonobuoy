package state;

import comms.CommManagerFacade;
import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

class ActiveDeployedState implements State {

	@Override
	public void processMessage(Message nextMessage) {
		throw new UnsupportedOperationException("Active Deployed Process Message Not supported yet.");
	}

	@Override
	public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls, CommManagerFacade comms) {
		displayStateName();
		controls.generateSound();
		System.out.println("\t\tGenerating sound");
		if(sensors.listenForEcho())
                {
                    Message mess = new Message(sensors.getDepth(), sensors.getXPosition(), sensors.getYPosition(), sensors.getZPosition(),
                                            270, sensors.getWaterTemperature());
                    comms.sendMessage(mess);
                    System.out.println("\t\tMessage sent!");
                }
		System.out.println("\t\tListening for echo");
	}

	@Override
	public void displayStateName() {
		System.out.println("5. Active Deployed State");
	}
}
