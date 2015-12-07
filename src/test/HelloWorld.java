package test;


public class HelloWorld {

	public static void main(String[] agrs)
	{
		System.out.println("Hello World!");
		int i=2;
		System.out.println(i);
		int j= i<<3;  //往左位移3位，相当于2的3次方
		System.out.println(j);
		int h=RSHash("abc");
		System.out.println(RSHash("abc"));
		System.out.println(RSHash("abcd"));
		System.out.println(-2 & 0x7FFFFFFF);
		System.out.println(-10 & 0x7FFFFFFF);
		System.out.println(0x7FFFFFFF);
		int c=0xFFFFFFFE;//-2 按补码方式存储负数（补码:绝对值按位取反后加1)
		System.out.println(c);
	}
	
	public static int RSHash(String str)
	{
		int b = 378551;
		int a = 63689;
		int hash = 0;

		for(int i = 0; i < str.length(); i++)
		{
			hash = hash * a + str.charAt(i);
			a = a * b;
			}
			return (hash & 0x7FFFFFFF);  //&位运算，去除符号
	}


}
