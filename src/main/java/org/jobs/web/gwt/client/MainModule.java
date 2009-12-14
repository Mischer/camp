package org.jobs.web.gwt.client;

import org.gwt.mosaic.ui.client.InfoPanel;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class MainModule implements EntryPoint {

	public void onModuleLoad() {

		final Button button = new Button("Say Hello", new ClickHandler() {
			public void onClick(ClickEvent event) {
				InfoPanel.show(((Button) event.getSource()).getText(), "Text sample from resources");
			}
		});

		RootPanel.get().add(button);
	}
}
