package musikAufgabe;

public class Proberaum {
  public static void main(String[] args) {
    Musiker saenger = new Saenger();
    Musiker gitarrist = new Gitarrist();
    Musiker bassist = new Drummer();
    machtMusik(saenger, gitarrist, bassist);
  }
  
  public static void machtMusik(Musiker... gruppe) {
      for(Musiker musiker : gruppe) {
        musiker.musizieren();
      }
    }

}
