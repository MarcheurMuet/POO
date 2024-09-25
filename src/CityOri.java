
public class CityOri {

		// TODO Auto-generated method stub
		String statut = "";
		String nameCity = "";
		
		public CityOri(String nameCity, String statut) {
			this.nameCity = nameCity;
			this.statut = statut;
		}
		
		public String getnameCity() {
			return nameCity;
		}
		
		public void setnameCity(String nameCity) {
			this.nameCity = nameCity;
		}
		
		public String getstatut() {
			return statut;
		}
		
		public void setstatut(String statut) {
			this.statut = statut;
		}
		
		public String toString() {
			return " [city = " + getnameCity() + ", statut = " + getstatut()+"]";
	}
}
