package day07_test;

import java.util.Scanner;

public class OrderingMgr {
	static final int MAX = 4;
	static String names[]=new String[MAX];//订单人姓名
	static String[] dishMegs=new String[MAX];//订餐信息，菜名，份数
	static int[] times=new int[MAX];//送餐时间
	static String[] addresses=new String[MAX];//送餐地址
	static int[] states=new int[MAX];//订单状态:0表示预订，1表示已订
	static double[] totalPrices=new double[MAX];//订单总金额
	static String[] dishNames=new String[]{"红烧带鱼","鱼香肉丝","时令鲜蔬"};
	static double[] prices=new double[]{38.0,20.0,10.0};
	static int[] praiseNums=new int[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int chosen;
		do {
			menu();
			chosen = scanner.nextInt();
			switch (chosen) {
			case 1:
				OrderMeal();
				break;
			case 2:
				CheckBag();
				break;
			case 3:
				SignForOrder();
				break;
			case 4:
				DeleteOrder();
				break;
			case 5:
				ThumbsUp();
				break;
			case 6:
				System.out.println("谢谢使用，欢迎下次光临!");
				return;
			default:
				System.out.println("输入错误，请重新输入!");
				break;
			}
		} while (true);
	}
	public static void menu(){
		System.out.println("欢迎使用\"吃货联盟订餐系统\"");
		System.out.println("****************************");
		System.out.println("1、我要订餐");
		System.out.println("2、查看餐袋");
		System.out.println("3、签收订单");
		System.out.println("4、删除订单");
		System.out.println("5、我要点赞");
		System.out.println("6、退出系统");
		System.out.println("****************************");
		System.out.print("请选择:");
	}
	public static void OrderMeal(){
		System.out.println("*** 我要订餐 ***");
		boolean flag=false;//标记是否能订餐，false表示没空位
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i < names.length; i++) {//遍历餐袋,找空位
			if (names[i]==null) {//找到第一个空位，判断第5次之后的订餐
				flag=true;//标记找到空位
				System.out.print("请输入订餐人姓名:");
				String name=scanner.next();
				System.out.println("序号\t"+"菜名\t\t"+"单价\t"+"点赞数");
				for (int j = 0; j < dishNames.length; j++) {//3个菜名
					String praiseNum=null;
					String price=prices[j]+"元";//单价
					if (praiseNums[j]>0) {
						praiseNum=praiseNums[j]+"个赞";
					}else{
						praiseNum="0";
					}
					System.out.println((j+1)+"\t"+dishNames[j]+"\t"+price+" \t"+praiseNum);
				}
				//用户点菜
				System.out.print("请选择菜品编号:");
				int dishNo=scanner.nextInt();
				System.out.print("请输入份数:");
				int number=scanner.nextInt();
				String dishMeg=dishNames[dishNo-1]+number+"份";//订餐信息
				//总餐费
				double totalPrice=prices[dishNo-1]*number;
				//满50，免收送餐5
				double sendPrice;
				if (totalPrice>=50) {
					sendPrice=0.0;
				}else {
					sendPrice=5.0;
				}
				System.out.print("请输入送餐时间(10~20整点):");
				int time=0;
				do {
					time=scanner.nextInt();
					if (time<10||time>20) {
						System.out.println("输入错误，请重新输入10-20间的整数!");
					}
				} while (time<10||time>20);
				System.out.print("请输入送餐地址:");
				String address=scanner.next();
				System.out.println("订餐成功!");
				System.out.println("您订的是:"+dishMeg);
				System.out.println("送餐时间"+time+"点");
				System.out.println("餐费:"+totalPrice+"元,送餐费"+
				sendPrice+"元,总计:"+(totalPrice+sendPrice)+"元。");
				//添加回数组
				names[i]=name;
				dishMegs[i]=dishMeg;
				times[i]=time;
				addresses[i]=address;
				totalPrices[i]=totalPrice+sendPrice;//订餐费和送餐费
				break;//找到一个位置操作完后就跳出循环,不再继续找
			}
			if (!flag) {//如果没有位置
				System.out.println("很抱歉，没有位置了!");
			}
		}
		
	}
	public static void CheckBag(){
		System.out.println("*** 查看餐袋 ***");
		boolean flag=false;//标记餐袋是否为空
		System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t总金额\t\t订单状态");
		for (int i = 0; i < names.length; i++) {//遍历餐袋
			if (names[i]!=null) {//如果有人订餐
				flag=true;
				String state="";
				String time=times[i]+"点";
				String addr=addresses[i];
				String totalPrice=totalPrices[i]+"元";
				if (states[i]==0) {
					state="已预订";
				}else {
					state="已完成";
				}
				System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t\t"+time+"\t\t"+addr+"\t\t"+totalPrice+"\t\t"+state);
			}
		}
		if (!flag) {
			System.out.println("餐袋为空!");
		}
	}
	public static void SignForOrder(){
		System.out.println("*** 签收订单 ***");
		System.out.print("请选择要签收的订单序号:");
		Scanner scanner=new Scanner(System.in);
		boolean flag=false;//标记是否找到订单，false表示没找到,订单号在1-4中就表示能找到
		int id=scanner.nextInt();
		for (int i = 0; i < names.length; i++) {
			if ((id==i+1)&&(states[i]==0)&&(names[i]!=null)) {//有人订餐,订单号在1-4之内且状态为已预订
				states[i]=1;//状态改为已完成
				System.out.println("订单签收成功!");
				flag=true;//找到订单
			}else if ((id==i+1)&&(states[i]==1)&&(names[i]!=null)) {
				System.out.println("此订单已完成签收!");
				flag=true;//找到订单
			}
		}
		if(!flag){//找不到
			System.out.println("找不到您选择的订单");
		}
	}
	public static void DeleteOrder(){
		System.out.println("*** 删除订单 ***");
		boolean flag=false;//标记是否找到订单
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入要删除的订单序号:");
		int num=scanner.nextInt();
		for (int i = 0; i < names.length; i++) {
			if ((names[i]!=null)&&(num==i+1)&&(states[i]==0)) {//有人订餐，订单序号在1-4且状态为已预订时不可删除
				System.out.println("您选择的订单有人预定且未签收，不能删除!");
				flag=true;
				break;
			}else if ((names[i]!=null)&&(num==i+1)&&(states[i]==1)) {//有人订餐，订单序号在1-4且状态为已完成时可删除
				for (int j = num-1; j < names.length-1;j++) {
					names[j]=names[j+1];
					dishMegs[j]=dishMegs[j+1];
					times[j]=times[j+1];
					addresses[j]=addresses[j+1];
					totalPrices[j]=totalPrices[j+1];
					states[j]=states[j+1];
				}
				//清空最后个元素
				names[names.length-1]=null;
				dishMegs[names.length-1]=null;
				times[names.length-1]=0;
				addresses[names.length-1]=null;
				totalPrices[names.length-1]=0.0;
				states[names.length-1]=0;
				System.out.println("删除成功!");
				flag=true;
			}
		}
		if (!flag) {//如果没有找到订单
			System.out.println("没有找到您要删除的订单!");
		}
	}
	public static void ThumbsUp(){
		System.out.println("*** 我要点赞 ***");
		Scanner scanner=new Scanner(System.in);
		System.out.println("序号\t"+"菜名\t\t"+"单价\t"+"点赞数");
		for (int i = 0; i < dishNames.length; i++) {
			String price=prices[i]+"元";//单价
			String praiseNum="";//点赞数
			if (praiseNums[i]>0) {
				praiseNum=praiseNums[i]+"赞";
			}else {
				praiseNum="";
			}
			System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+praiseNum);
		}
		System.out.print("请输入您要点赞的菜品序号:");
		int num=scanner.nextInt();
		praiseNums[num-1]++;//对应序号的点赞数+1
		System.out.println("点赞成功!");
	}
}
