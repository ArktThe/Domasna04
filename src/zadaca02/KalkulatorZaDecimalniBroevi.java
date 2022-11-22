package zadaca02;

public class KalkulatorZaDecimalniBroevi {

	@Override
	public double odzemanje(double x, double y) implements IMatematickiOperaciiVrzDecimalniBroevi {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public double sobiranje(double x, double y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public double mnozenje(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double delenje(double x, double y) {
		// TODO Auto-generated method stub
		return x/y;
	}

	@Override
	public double ostatok(double x, double y) {
		// TODO Auto-generated method stub
		return x%y;
	}

	@Override
	public double stepenuvanje(double x, double y) {
		// TODO Auto-generated method stub
		return Math.pow(x, y);
	}

}