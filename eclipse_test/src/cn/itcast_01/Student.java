package cn.itcast_01;

/*
 * @author luoyu
 * @version v12
 * ѡ������ 
 * ��0������ʼ�����κͺ���Ԫ�رȣ�С����ǰ�� 
 */
public class Student  {

	public static void main(String[] args) {
		int[] a = { 3, 1, 4, 2 };
		int temp = 0;
		for (int i = 0; i < 3; i++)
			for (int j = i + 1; j < 4; j++) {
				if (a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		for(int k = 0;k < 4;k++)
			System.out.println(a[k]);
			
		
	    }

	
}
