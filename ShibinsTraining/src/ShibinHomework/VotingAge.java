package ShibinHomework;

public class VotingAge {

	public static void main(String[] args) {
		VotingAge va = new VotingAge();
		va.VotAge();
	}
	public void VotAge() {
		int x=18;
		if (x>=18) {
			System.out.println("The person is eligible to vote");
		}
		else {
			System.out.println("The person is not eligible to vote");
		}
	}
}
