package day2.assign2;

public class TwoWheeler {
	private static TwoWheeler obj1;

	public static void main(String[] args) {
	//obj created and called
		TwoWheeler.obj1 = new TwoWheeler();
		obj1.noOfWheels();
		obj1.noOfMirrors();
		boolean punctured = obj1.isPunctured(); 
		System.out.println(punctured);
		String bikeName2 = obj1.bikeName();
		System.out.println(bikeName2 +  "= Bike Name");
		obj1.runningKM();
		obj1.chassisNumber();
		
		
		
	
}
	

	public void noOfWheels() {
		//datatype variableName = value;
				int noOfWheels = 4;
				System.out.println(noOfWheels);
	}
	public void noOfMirrors() {
				short noOfMirrors = 4;
				System.out.println(noOfMirrors);
	}
				
        boolean isPunctured() {
					return false;
				}
		String bikeName() {
					String bname = "ZEEBULLET";
					return bname;
				
				}
	public void runningKM()
				{
					double runningKM = 567.679;
					System.out.println(runningKM);}
	public void chassisNumber() {
		        long chassisNumber = 26576868L;
		        System.out.println(chassisNumber);
	}
	}
