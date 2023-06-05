public class test {

		public static void main(String args[])
	    {
	        String inputStr ="aabb";
	        boolean flag = true;

	        for(char i :inputStr.toCharArray())
	        {
	            // if current character is the last occurrence in the string
	            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
	            {
	                System.out.println("First non-repeating character is: "+ i);
	                System.out.println("First non-repeating character index is: "+ inputStr.indexOf(i));
	                flag = false;
	                break;
	            }
	        }

	        if(flag)
	            System.out.println("-1");
	    }
	}
