package interfaces_challenge;

import java.util.ArrayList;

public class Monster implements ISavable {
	private String name;
	private int hitPoints;
	private int strength;
	public Monster(String name, int hitPoints, int strength) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}
	public String getName() {
		return name;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public int getStrength() {
		return strength;
	}
	@Override
	public ArrayList<String> write() {
		ArrayList<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.hitPoints);
		values.add(2, "" + this.strength);
		return values;
	}
	@Override
	public void read(ArrayList<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0) {
			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}
	}
	@Override
	public String toString() {
		return "Monster [name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "]";
	}

	
}
