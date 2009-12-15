package org.jobs.web.gwt.client;

import com.extjs.gxt.ui.client.widget.Info;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class MainModule implements EntryPoint {

	public void onModuleLoad() {

		final Button button = new Button("Say Hello", new ClickHandler() {
			public void onClick(ClickEvent event) {
				Info.display("Title", "Message");
			}
		});
		RootPanel.get().add(button);
	}
}
