package Remove_A;

public class Remove_First_A {

	public String Replace(String string) {
		String ReplaceString="";
		if(string.charAt(0)=='A'&&string.charAt(1)=='A')
		{
			 ReplaceString=string.substring(2,string.length());
		}
		else if(string.charAt(0)!='A'&&string.charAt(1)=='A')
		{
			
			ReplaceString=string.charAt(0)+string.substring(2,string.length());
		}
		else if(string.charAt(0)=='A'&&string.charAt(1)!='A')
		{
			ReplaceString=string.substring(1,string.length());
		}
		else
			ReplaceString=string;
		return ReplaceString;
	}

}
