package day01;
/*
 * 13����һ���ַ�����0����ѭ��ʮ�Ρ�(ʹ��stringBuilder�������δ�������)
��һ�Σ���01��
�ڶ���: ��012��
�����Σ���0123��
��������������
��ʮ�Σ���012345678910��

ע��������ս�����ַ���
 */
public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="0";
		StringBuilder sBuilder=new StringBuilder(s);
		for (int i = 0; i < 10; i++) {
			sBuilder.append(i+1);
			System.out.println("��"+(i+1)+"��:"+"\""+sBuilder.toString()+"\"");
		}
	}

}
