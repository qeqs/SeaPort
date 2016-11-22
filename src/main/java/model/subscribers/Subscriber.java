package model.subscribers;

import model.entities.Entity;

/**
 * Created on 20.11.2016.
 */
public interface Subscriber {
	void onNewDay();

	int getProgress();

	void set(Entity entity);
}
