public class MainDate{

	public static void main (String [ ] args) {

	try{
	Date dia1 = new Date (7,6,2005);
	}catch(DateException message)
		{
		System.err.println(message.toString());
		}


	}
}
