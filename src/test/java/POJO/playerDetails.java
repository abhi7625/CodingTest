package POJO;

import java.util.List;

public class playerDetails {
	private String name;
	private String location;
	private List<POJO.player> player;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<player> getPlayer() {
		return player;
	}
	public void setPlayer(List<POJO.player> player) {
		this.player = player;
	}
}
