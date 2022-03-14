package com.playground.charge.ui;

import com.playground.charge.model.User;
import com.playground.charge.repository.UserRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class LandingPage extends VerticalLayout {

	private UserRepository repo;
	private Grid grid;

	public LandingPage() {
		add(new Button("Click me", e -> Notification.show("Hello, Spring+Vaadin user!")));
	}

	public LandingPage(UserRepository repo) {
		this.repo = repo;
		this.grid = new Grid<>(User.class);
		add(grid);
		listCustomers();
	}

	private void listCustomers() {
		grid.setItems(repo.findAll());
	}

}
