package dec10;

import java.io.CharArrayReader;

public class Example2 {

	public static void main(String[] args) {
		
		String obj="abcdef";
		int length=obj.length();
		char[] c=new char[length];
		//obj.getChars(srcBegin, srcEnd, dst, dstBegin);
		obj.getChars(0, length, c, 0);
		CharArrayReader io_1= new CharArrayReader(c);
		//CharArrayReader io_2= new CharArrayReader(buf, offset, length)
		CharArrayReader io_2= new CharArrayReader(c,0,3);
		int i;
		try {
			while ((i=io_1.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
