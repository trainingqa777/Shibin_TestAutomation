package basics;

public class ConditionStatement {

	String Day = "Monday";
	
    public static void main(String[] args) {
    	ConditionStatement cs = new ConditionStatement();
    	cs.Switch_Statement();
	}

	public void If_statement() {
		
		if(Day.equals("Sunday")) {
			System.out.println("Today is Sunday");
		}
		else if(Day.equals("Sat")) {
			System.out.println("Today is Sat");
		}
		else if(Day.equals("Mon")) {
			System.out.println("Today is Mon");
		}
		else {
			System.out.println("Invalid");
		}

	}
	
	public void Switch_Statement() {
		
		//String Day = "Monday";
		switch(Day){
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		case "Thursday":
			System.out.println("Today is Thursday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
			break;
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Invalid Input");
			break;
				}
	}
	
}
