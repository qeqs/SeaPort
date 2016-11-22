package model.factories;

import model.EventProvider;
import model.entities.ContainerEntity;
import model.subscribers.ContainerSubscriber;

import java.sql.Date;
import java.util.EventListener;
import java.util.Random;

/**
 * Created on 20.11.2016.
 */
public class ContainerFactory implements Factory {
	int i = 0;
	Random random;

	public ContainerEntity createEntity() {
		random = new Random();
		return new ContainerEntity(String.valueOf(i++), random.nextInt(4) + 5, EventProvider.getDate());
	}

	public ContainerEntity createEntity(String name, int weight, Date departure) {
		return new ContainerEntity(name, weight, departure);
	}

	public ContainerSubscriber createSubscriber() {
		return new ContainerSubscriber();
	}
}
