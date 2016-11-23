package model;

import model.entities.Entity;
import model.subscribers.Subscriber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * Created on 20.11.2016.
 */
public class Statistics implements Subscriber {
	private int penalty;
	private int penaltyPerDay = 2000;
	private int goodWeatherDays;
	private int badWeatherDays;
	private static int avarageUnLoadTime;

	//region listeners
	List<ActionListener> listeners = new ArrayList<ActionListener>();

	private void fireEvent() {
		for (ActionListener listener : listeners) {
			listener.actionPerformed(null);
		}
	}

	public void addListener(ActionListener listener) {
		listeners.add(listener);
	}
	//endregion

	public int getPenalty() {
		return penalty;
	}

	private void incrPenalty() {
		this.penalty += penaltyPerDay;

	}

	public int getPercentGoodWeatherDays() {
		return 100 * (goodWeatherDays / (badWeatherDays + goodWeatherDays));
	}

	public void onNewDay(List<Entity> entityList) {
		if (EventProvider.getCurrentWeather().equals(Weather.clearSky)) goodWeatherDays++;
		else badWeatherDays++;

		for (Entity entity : entityList) {
			if (entity.getDate().after(EventProvider.getCurrentDate())) incrPenalty();
		}
	}

	public int getAvarageUnLoadTime() {
		return avarageUnLoadTime;
	}

	public static void setUnLoadTime(int unLoadTime) {
		avarageUnLoadTime = avarageUnLoadTime > 0 ? (avarageUnLoadTime + unLoadTime) / 2 : unLoadTime;

	}
}
