package org.jobs.web.gwt.client;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.CenterLayout;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class MainModule implements EntryPoint {

	public void onModuleLoad() {

		final FormPanel simple = new FormPanel();
		simple.setHeading("Login Form");
		simple.setFrame(true);

		simple.setWidth(350);

		final TextField<String> login = new TextField<String>();
		login.setFieldLabel("Login");
		simple.add(login);

		final TextField<String> password = new TextField<String>();
		password.setFieldLabel("Password");
		password.setPassword(true);
		simple.add(password);

		final Button button = new Button("Login");
		button.addSelectionListener(new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				if (!simple.isValid()) {
					return;
				}
				Info.display("Login", "Hello " + login.getValue() + "!");
			}
		});
		simple.add(button);

		RootPanel.get().add(simple);
		simple.setLayout(new CenterLayout());
	}
}
