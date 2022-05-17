package at.campus02.musikanten;

public class Hund extends Musikant{
	protected double bellLautstaerke;

	public Hund(int aB, Instrument i , double bellLautstaerke) {
		super(aB, i);
		this.bellLautstaerke = bellLautstaerke;
	}

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}

	@Override
	public int verscheucheRaeuber() {
		if(bellLautstaerke>=instrument.getLautstaerke()) {
			return (int) Math.floor(bellLautstaerke);
		}else return (int) Math.floor(instrument.getLautstaerke());
	}

	@Override
	public double speileMusik() {
		return (instrument.getLautstaerke()+bellLautstaerke)/2;
	}

	@Override
	public String toString() {
		return "Hund "+bellLautstaerke+": Verscheucht: "+ verscheucheRaeuber()+", Musiziert: "+speileMusik();
	}
}
