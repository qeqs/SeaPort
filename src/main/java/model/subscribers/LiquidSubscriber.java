package model.subscribers;

/**
 * Created on 20.11.2016.
 */
public class LiquidSubscriber extends AbstractSubscriber {
	public LiquidSubscriber() {
		unloadType = 4;
	}

	@Override
	public String getName() {
		return "Liquid crane " + super.getName();
	}
}
