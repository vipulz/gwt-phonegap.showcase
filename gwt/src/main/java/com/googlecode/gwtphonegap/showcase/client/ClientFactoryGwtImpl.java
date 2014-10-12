package com.googlecode.gwtphonegap.showcase.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.showcase.client.device.DeviceDisplay;
import com.googlecode.gwtphonegap.showcase.client.device.DeviceDisplayGwtImpl;
import com.googlecode.gwtphonegap.showcase.client.event.EventDisplay;
import com.googlecode.gwtphonegap.showcase.client.event.EventDisplayGwtImpl;
import com.googlecode.gwtphonegap.showcase.client.file.FileDisplay;
import com.googlecode.gwtphonegap.showcase.client.file.FileDisplayGwtImpl;
import com.googlecode.gwtphonegap.showcase.client.geolocation.GeolocationDisplay;
import com.googlecode.gwtphonegap.showcase.client.geolocation.GeolocationDisplayGwtImpl;
import com.googlecode.gwtphonegap.showcase.client.inappbrowser.InAppBrowserDisplay;
import com.googlecode.gwtphonegap.showcase.client.inappbrowser.InAppBrowserDisplayGwtImpl;
import com.googlecode.gwtphonegap.showcase.client.media.MediaDisplay;
import com.googlecode.gwtphonegap.showcase.client.media.MediaDisplayGwtImpl;
import com.googlecode.gwtphonegap.showcase.client.notification.NotificationDisplay;
import com.googlecode.gwtphonegap.showcase.client.notification.NotificationDisplayGwtImpl;

public class ClientFactoryGwtImpl implements ClientFactory {

	private PhoneGap phoneGap;
	private SimpleEventBus eventBus;
	private PlaceController placeController;
	private OverviewDisplay overviewDisplay;
	private DeviceDisplay deviceDisplay;
	private EventDisplay eventDisplay;
	private GeolocationDisplay geolocationDisplay;
	private MediaDisplay mediaDisplay;
	private NotificationDisplay notificationDisplay;
	private InAppBrowserDisplay childBrowserDisplay;
	private FileDisplay fileDisplay;

	public ClientFactoryGwtImpl() {
		eventBus = new SimpleEventBus();

		placeController = new PlaceController(eventBus);
	}

	public void setPhoneGap(PhoneGap phoneGap) {
		this.phoneGap = phoneGap;
	}

	@Override
	public PhoneGap getPhoneGap() {
		return phoneGap;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public OverviewDisplay getOverviewDisplay() {
		if (overviewDisplay == null) {
			overviewDisplay = new OverviewDisplayGwtImpl();
		}
		return overviewDisplay;
	}

	@Override
	public DeviceDisplay getDeviceDisplay() {
		if (deviceDisplay == null) {
			deviceDisplay = new DeviceDisplayGwtImpl();
		}
		return deviceDisplay;
	}

	@Override
	public EventDisplay getEventDisplay() {
		if (eventDisplay == null) {
			eventDisplay = new EventDisplayGwtImpl();
		}
		return eventDisplay;
	}

	@Override
	public GeolocationDisplay getGeolocationDisplay() {
		if (geolocationDisplay == null) {
			geolocationDisplay = new GeolocationDisplayGwtImpl();
		}
		return geolocationDisplay;
	}

	@Override
	public MediaDisplay getMediaDisplay() {
		if (mediaDisplay == null) {
			mediaDisplay = new MediaDisplayGwtImpl();
		}
		return mediaDisplay;
	}

	@Override
	public NotificationDisplay getNotificationDisplay() {
		if (notificationDisplay == null) {
			notificationDisplay = new NotificationDisplayGwtImpl();
		}
		return notificationDisplay;
	}

	@Override
	public InAppBrowserDisplay getChildBrowserDisplay() {
		if (childBrowserDisplay == null) {
			childBrowserDisplay = new InAppBrowserDisplayGwtImpl();
		}
		return childBrowserDisplay;
	}

	@Override
	public FileDisplay getFileDisplay() {
		if (fileDisplay == null) {
			fileDisplay = new FileDisplayGwtImpl();
		}
		return fileDisplay;
	}
}
