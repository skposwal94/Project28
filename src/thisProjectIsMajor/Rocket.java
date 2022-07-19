package thisProjectIsMajor;

public class Rocket implements SpaceShip {
	
	// rocket class with variables and methods 

	int costofRocket;
	int weightofRocket;
	int WeightAllowed;
	double launchExplosionProbability;
	double landingCrashProbability;
	int WeightwithCargo;

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		return (item.weight + WeightwithCargo <= WeightAllowed);
	}

	@Override
	public double carry(Item item) {

		return (WeightwithCargo += item.weight);
	}

}
