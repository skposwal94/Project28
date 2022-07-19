package thisProjectIsMajor;

import java.util.Random;

public class R2 extends Rocket {

	// scaling the probability on scale of 0-100 instead of 0-1

	public R2() {

		costofRocket = 120;
		weightofRocket = 18000;
		WeightAllowed = 29000;
		launchExplosionProbability = 0;
		landingCrashProbability = 0;
		WeightwithCargo = 18000;

	}

	public boolean launch() {

		Random rnd = new Random();

		this.launchExplosionProbability = 4 * ((this.WeightwithCargo - this.weightofRocket) / 11000);

		return launchExplosionProbability <= rnd.nextInt(101);

	}

	public boolean land() {

		Random rnd = new Random();

		this.landingCrashProbability = 8 * ((this.WeightwithCargo - this.weightofRocket) / 11000);

		return landingCrashProbability <= rnd.nextInt(101);

	}

}
