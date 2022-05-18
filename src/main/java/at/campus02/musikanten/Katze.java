package at.campus02.musikanten;

public class Katze extends Musikant{
	protected double kratzKraft;
	
	public Katze(int aB, Instrument i , double kratzKraft) {
		super(aB, i);
		this.kratzKraft = kratzKraft;

	}

	public double getKratzKraft() {
		return kratzKraft;
	}

	@Override
	public int verscheucheRaeuber() {
		int anzahlRaeuber=0;
		if(anzahlBeine==4){
			anzahlRaeuber= (int) Math.floor(kratzKraft);
		}else if(anzahlBeine==3){
			anzahlRaeuber= (int) Math.floor(kratzKraft/2);
		}else if(anzahlBeine<=2){
			anzahlRaeuber= 1;
		}
		return anzahlRaeuber;
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	@Override
	public String toString() {
		return "Katze "+kratzKraft+": Verscheucht: "+ verscheucheRaeuber()+", Musiziert: "+spieleMusik();
	}
}
