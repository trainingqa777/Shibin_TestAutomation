package ShibinHomework;

public class Weekdays {

	public static void main(String[] args) {
		Weekdays wd = new Weekdays();
		wd.WeekDay();
	}
	public void WeekDay () {
		String Day = "Sunday";
		if (Day=="Sunday") {System.out.println("The week is 7");
			}
		else if(Day=="Monday") {System.out.println("The week is 1");
		}
		else if(Day=="Tuesday") {System.out.println("The week is 2");
		}
		else if(Day=="Wednesday") {System.out.println("The week is 3");
		}
		else if(Day=="Thursday") {System.out.println("The week is 4");
		}
		else if(Day=="Friday") {System.out.println("The week is 5");
		}
		else if(Day=="Saturday") {System.out.println("The week is 6");
		}
		else {System.out.println("The input is invalid");
		}
	}
}


