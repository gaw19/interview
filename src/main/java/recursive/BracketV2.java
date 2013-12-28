package recursive;

import java.util.ArrayList;
import java.util.List;

public class BracketV2 {
	public static void main(String[] args) {
		List<String> allBrackets = generateBracket(3);
	
		for(String string: allBrackets){
			System.out.println(string);
		}
	}
	
	public static void addBracket(List<String> list, String string,int leftReminder, int rightReminder){
		String str = string.substring(0);
		//make a copy of string
		if(leftReminder < 0 || rightReminder < 0){
			return;
		}
		if(leftReminder == 0 && rightReminder == 0){
			list.add(str);
		}
		
		if(leftReminder > 0 ){
			addBracket(list, str+"(", leftReminder-1, rightReminder);
		}
		
		if(rightReminder >0 && leftReminder < rightReminder){
			addBracket(list,  str+")", leftReminder, rightReminder-1);
		}
	}
	
	
	public static List<String> generateBracket(int count){
		List<String> result = new ArrayList<String>();		
		addBracket(result, "", count, count);
		return result;
		
	}
}
