package inner_classes;

public class Main {

	public static void main(String[] args) {
		Gearbox corvette = new Gearbox(6);
		corvette.addGear(1, 5.3);
		corvette.addGear(2, 10.6);
		corvette.addGear(3, 15.9);
		corvette.operateClutch(true);
		corvette.changeGear(1);
		corvette.operateClutch(true);
		System.out.println(corvette.wheelSpeed(1000));
		corvette.operateClutch(true);
		corvette.changeGear(2);
		corvette.operateClutch(false);
		System.out.println(corvette.wheelSpeed(3000));
	}

}
