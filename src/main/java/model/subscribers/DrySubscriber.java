package model.subscribers;

/**
 * Created on 20.11.2016.
 */
public class DrySubscriber extends AbstractSubscriber {

	public DrySubscriber() {
		unloadType = 2;
	}

	@Override
	public String getName() {
		return "Dry crane " + super.getName();
	}
}
