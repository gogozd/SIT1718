// U ovom zadatku radit ćete sa sučeljima. Pretpostavimo da imate dvije klase i to klasu Robot, te drugu Person koje nisu iz iste
// porodice. Robot i Person imaju neka ponašanja koja su slična, ali istovremeno bitno različita → talk(), walk(), think(), calculate().
// Kao što očekujete imaju neke metode koje su različite i njih ćemo istaknuti u prikazu dijagrama klasa. Sva ponašanja potebno je
// realizirati korištenjem sučelja CommonActions.


public interface CommonActions {

	public void walk(String str, int i);
	public void talk(String str);
	public void think(String str);
	public void calculate(int i);
}
