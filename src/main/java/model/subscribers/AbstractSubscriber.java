package model.subscribers;

import model.entities.Entity;

/**
 * Created on 22.11.2016.
 */
public abstract class AbstractSubscriber implements Subscriber {
	protected Entity workingEntity;
	protected int currentProgress = 0;
	protected int weight;
	private int unloaded;
	protected int unloadType;

	public void onNewDay() {
		if (weight == 0) {
			workingEntity = null;
			return;
		}
		if (unloaded++ <= unloadType) {return;}//наполняем цистерны
		unloaded = 0;
		weight--;
		currentProgress = 10 * (weight / (workingEntity.getValue()));
	}

	public int getProgress() {
		return currentProgress;
	}

	public void set(Entity entity) {
		workingEntity = entity;
		weight = workingEntity.getValue();
	}
}
