package gambling;

public class GamblerStimulator {
     int stakes=100;
     int wins=0;
     int loose=0;
     int dailyBets=1;
     //creating method
public void GamblerUC1() {
	int choice=0;
	int bet= (int)Math.floor(Math.random() *10 % 2);
	if(dailyBets==bet) {
		System.out.println("The person has won:");
	}
	else
		System.out.println("The person has lost");
}
	public static void main(String[] args) {
		GamblerStimulator gamblerStimulator = new GamblerStimulator();
		gamblerStimulator.GamblerUC1();

	}

}
