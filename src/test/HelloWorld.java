package test;


public class HelloWorld {

	public static void main(String[] agrs)
	{
		System.out.println("Hello World!");
		int i=2;
		System.out.println(i);
		int j= i<<3;  //����λ��3λ���൱��2��3�η�
		System.out.println(j);
		int h=RSHash("abc");
		System.out.println(RSHash("abc"));
		System.out.println(RSHash("abcd"));
		System.out.println(-2 & 0x7FFFFFFF);
		System.out.println(-10 & 0x7FFFFFFF);
		System.out.println(0x7FFFFFFF);
		int c=0xFFFFFFFE;//-2 �����뷽ʽ�洢����������:����ֵ��λȡ�����1)
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
			return (hash & 0x7FFFFFFF);  //&λ���㣬ȥ������
	}


}
