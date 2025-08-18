package stringProgram;

public class DemoString {
	public static void main(String[] args) {
		String s ="hellohii";
		String a ="hello";
		//String i = s.concat(a);
		//System.out.println("string after cncatinating : "+i);
		StringBuilder b = new StringBuilder(s);
		StringBuilder bb = b.append("byee");
		System.out.println("after using append method it concat two string "+bb);
		
		StringBuffer sb = new StringBuffer(a);
		StringBuffer f = sb.append("Hello");
		System.out.println(f);
		System.out.println(s.compareTo(a));
		System.out.println(s.indexOf(s));
		System.out.println(s.equals(b));
	}

}
