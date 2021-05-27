package Entities.Concrete;

import Entities.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String gameName; 
	private double price;
	private String description;
	
	public Game() { }
	
	public Game(int id, String gameName, double price, String description) {
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
