package model.subscribers;

/**
 * Created on 20.11.2016.
 */
public class ContainerSubscriber extends AbstractSubscriber {
	public ContainerSubscriber() {
		unloadType = 1;
	}

	@Override
	public String getName() {
		return "Container crane " + super.getName();
	}
}
