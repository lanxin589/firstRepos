package day08;

public class test09_Container {
	double capacity;//容量(ml)
	String material;//材料
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test09_Container[] containers=new test09_Container[5];
		test09_Container container1=new test09_Container();
		test09_Container container2=new test09_Container();
		test09_Container container3=new test09_Container();
		test09_Container container4=new test09_Container();
		test09_Container container5=new test09_Container();
		container1.capacity=500;
		container1.material="纸";
		container2.capacity=700;
		container2.material="玻璃";
		container3.capacity=600;
		container3.material="瓷";
		container4.capacity=800;
		container4.material="塑料";
		container5.capacity=1000;
		container5.material="不锈钢";
		containers[0]=container1;
		containers[1]=container2;
		containers[2]=container3;
		containers[3]=container4;
		containers[4]=container5;
		for (int i = 0; i < containers.length; i++) {
			System.out.println(containers[i].capacity+","+containers[i].material);
		}
	}

}
