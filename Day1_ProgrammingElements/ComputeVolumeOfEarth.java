
public class ComputeVolumeOfEarth {

	public static void main(String[] args) {
		double radius = 6378.0;
		double volumekm3 = (4.0 /3.0 ) * (Math.PI) * Math.pow(radius, 3);
		double radiusMiles = radius * 0.621371;
		 double volumeMiles3 = (4.0 / 3.0) * (Math.PI) * Math.pow(radiusMiles, 3);
         System.out.println("The volume is earth in cubic kilometers is "+ volumekm3 +" and cubic miles is "+ volumeMiles3);
	}

}
