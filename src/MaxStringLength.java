import java.util.*;
public class MaxStringLength{
	
	public static void maxStringLength(String str){

		String newstr[] = str.split(" ");
		
//		Map<String, Integer> map = new HashMap<>();
//		int length=1;
//		for(String s:newstr) {
//			length = s.length();
//			map.put(s, length);
//		}
//	
//	int result=1;
//	String s="";
//	for(Map.Entry<String, Integer> entry:map.entrySet())
//	{
//		if (result < entry.getValue()) {
//			result = entry.getValue();
//			s=entry.getKey();
//			
//		}
//	}
//	System.out.print(s);


	
		String s="";
		int maxlength=1;
	for(int i = 0;i<newstr.length;i++){
		if(maxlength<newstr[i].length()) {
			maxlength= newstr[i].length();
			s=newstr[i];
		}
}
	System.out.print(s);
	}

public static void main(String args[]) {
	String str= "I loveeeeeeeeeeeeeee a javaaaaaa programming";
	maxStringLength(str);
}
}
