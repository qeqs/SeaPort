package model.factories;

import model.EventProvider;
import model.entities.DryEntity;
import model.subscribers.DrySubscriber;

import java.sql.Date;
import java.util.Random;

/**
 * Created on 20.11.2016.
 */
public class DryFactory implements Factory {
	int i = 0;
	Random random;

	public DryEntity createEntity() {
		random = new Random();
		return new DryEntity(String.valueOf(i++), random.nextInt(4) + 5, EventProvider.getDate());
	}

	public DryEntity createEntity(String name, int weight, Date departure) {
		return new DryEntity(name, weight, departure);
	}

	public DrySubscriber createSubscriber() {
		return new DrySubscriber();
	}
}
