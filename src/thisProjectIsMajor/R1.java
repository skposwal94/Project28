package thisProjectIsMajor;

import java.util.Random;

public class R1 extends Rocket {

	// scaling the probability on scale of 0-100 instead of 0-1

	public R1() {

		costofRocket = 100;
		weightofRocket = 10000;
		WeightAllowed = 18000;
		launchExplosionProbability = 0;
		landingCrashProbability = 0;
		WeightwithCargo = 10000;

	}

	public boolean launch() {

		Random rnd = new Random();

		launchExplosionProbability = 5 * ((this.WeightwithCargo - this.weightofRocket) / 8000);

		return launchExplosionProbability <= rnd.nextInt(101);

	}

	public boolean land() {

		Random rnd = new Random();

		landingCrashProbability = 1 * ((this.WeightwithCargo - this.weightofRocket) / 8000);

		return landingCrashProbability <= rnd.nextInt(101);

	}

}
