package thisProjectIsMajor;

public interface SpaceShip {
	
	// spaceship interface with abstract methods

	boolean launch();

	boolean land();

	boolean canCarry(Item item);

	double carry(Item item);

}
