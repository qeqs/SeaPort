package model;

import model.entities.Entity;
import model.subscribers.Subscriber;

import java.sql.Date;
import java.util.Random;

/**
 * Created on 20.11.2016.
 */
enum Weather {
	clearSky, storm
}

public class EventProvider implements Subscriber {
	private static Weather weather = Weather.clearSky;
	private static Date currentDate = new Date(System.currentTimeMillis());

	public static Date getDate() {
		Random random = new Random();
		return new Date(currentDate.getTime() + random.nextInt(1000 * 24 * 3600 * 7) + 1000 * 24 * 3600 * 7);
	}

	private static Weather getWeather() {
		Random random = new Random();
		return (random.nextInt() % 2) == 0 ? Weather.clearSky : Weather.storm;
	}

	public static Weather getCurrentWeather() {
		return weather;
	}

	public static Date getCurrentDate() {
		return currentDate;
	}

	public void onNewDay() {
		weather = getWeather();
		currentDate.setTime(currentDate.getTime() + 1000 * 24 * 3600 * 7);
	}

	public int getProgress() {
		return 0;
	}

	public void set(Entity entity) {

	}

	public String getName() {
		return null;
	}
}
