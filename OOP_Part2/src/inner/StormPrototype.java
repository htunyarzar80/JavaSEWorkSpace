package inner;

public class StormPrototype {

	static void stormReport(boolean storm, double mph) {
		if (storm) {

			if (mph <= 30) {
				System.out.println("No Objects get destroyed");
			} else if (mph > 30 && mph <= 60) {

				Destroyable tree1 = new Destroyable() {

					@Override
					public void Destory() {
						// TODO Auto-generated method stub
						System.out.println("Tree1 get destroyed");
					}
				};
				tree1.Destory();

				Destroyable tree2 = new Destroyable() {

					@Override
					public void Destory() {
						// TODO Auto-generated method stub
						System.out.println("Tree2 get destroyed");
					}
				};
				tree2.Destory();
			} else {
				Destroyable vehicle1 = new Destroyable() {

					@Override
					public void Destory() {
						// TODO Auto-generated method stub
						System.out.println("Vechile1 get destroyed");
					}
				};
				vehicle1.Destory();

				Destroyable vechile2 = new Destroyable() {

					@Override
					public void Destory() {
						// TODO Auto-generated method stub
						System.out.println("Vechile get destroyed");
					}
				};
				vechile2.Destory();

				Destroyable human1 = new Destroyable() {

					@Override
					public void Destory() {
						// TODO Auto-generated method stub
						System.out.println("Human1 get destroyed");
					}
				};
				human1.Destory();

				Destroyable human2 = new Destroyable() {

					@Override
					public void Destory() {
						// TODO Auto-generated method stub
						System.out.println("Human2 get destroyed");
					}
				};
				human2.Destory();

			}

		} else {
			System.out.println("Nice weather no storm today");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stormReport(true, 80);
	}

}
