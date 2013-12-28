package recursive;

import java.util.HashSet;
import java.util.Set;

public class Bracket {
	public static void main(String[] args){
		Set<String> one = genBracket(3);
		for(String str: one){
			System.out.println(str);
		}
		
	}
	
	
	public static Set<String> genBracket(int remaining){
		Set<String> result = new HashSet<String>();
		if (remaining == 0){
			result.add("");
		}if(remaining == 1){
			result.add("()");
		}else {
			Set<String> previous = genBracket(remaining-1);
			for(String str: previous){
				for(int i=0; i< str.length(); i++){
					String newStr = insertAt(str, i);
					if(!result.contains(newStr)){
						result.add(newStr);
					}
				}
			}
		}
		return result;
	}
	
	public static String insertAt(String str, int index){
		String left = str.substring(0, index+1);
		String right = str.substring(index+1);
		return left + "()" + right;
	}
}
