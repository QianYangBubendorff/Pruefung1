package at.campus02.musikanten;

import java.util.*;

public class Quartett {
	ArrayList <Musikant> musikants;

	public Quartett() {
		musikants = new ArrayList<>();
	}

	public void add(Musikant m) {
		musikants.add(m);
	}

	public boolean istQuartett()
	{
		if(musikants.size()==4) {
			return true;
		}return false;
	}
	
	public int gemeinsamRaeuberVerscheucht()
	{	int total=0;
		for(Musikant m: musikants){
			total= total + m.verscheucheRaeuber();
		}
		return total;
	}

	public double durchschnittlicheLautstaerke()
	{	double sumMusic = 0;
		for(Musikant m: musikants){
			sumMusic+= m.speileMusik();
		}
		return sumMusic/musikants.size();
	}
	
	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis)
	{
		ArrayList<Musikant> musikantList = new ArrayList<>();
		for(Musikant m: musikants){
			if(m.speileMusik()>=von && m.speileMusik() <=bis){
				musikantList.add(m);
			}
		}
		return musikantList;
	}

	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	{
		int count=1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(Musikant m: musikants){
			if(!map.containsKey(m.anzahlBeine)){
				map.put(m.anzahlBeine, count);
			}else{
				map.put(m.anzahlBeine, ++count);
			}
		}
		return map;
	}

	public void printLautStaerkeAbsteigend() {
		Collections.sort(musikants, new LautstaerkeComparator());
		System.out.println(musikants);

	}


}
