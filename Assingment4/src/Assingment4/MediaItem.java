package Assingment4;

abstract class MediaItem extends Item{
		private int runTime;
		public MediaItem(int id, int copy, String name, int runTime) {
			super(runTime, runTime, name);
			this.runTime=runTime;
		}
		public void getRunTime() {
			System.out.println("Running Time : "+runTime);
		}
	}