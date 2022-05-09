package Book81;
import java.util.*;

public class Test4 {
		public void create(Calendar cal){
			cal.set(2021,8,1);
			int temp = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			for(int i = 1; i <= temp; i++ ){
				System.out.print("\t");
			}
			for(int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++){
				System.out.print(i + "\t");
				if((i+temp)%7 == 0){
					System.out.println();
				}
			}
		}
		public static void main(String[] args) {
			Calendar cal = Calendar.getInstance();
			new Test4().create(cal);
		}
	}