import java.util.Vector;

public class MedincineRoom {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
Vector ban = new Vector();

 Medicine m1=new Medicine("�����",99,100,0);
ban.add(m1);
Medicine m2=new Medicine("������",9,100,0);
ban.add(m2);
//	medicine[0].setMdname("�����");
//	medicine[0].setPrice(99);
//	medicine[0].setStore(100);
//	medicine[0].setProfit(0);
//	medicine[1].setMdname("������");
//	medicine[1].setPrice(9);
//	medicine[1].setStore(100);
//	medicine[1].setProfit(0);
//	medicine[2].setMdname("��ð��");
//	medicine[2].setPrice(10);
//	medicine[2].setStore(100);
//	medicine[2].setProfit(0);
//	medicine[3].setMdname("����ҩ");
//	medicine[3].setPrice(16);
//	medicine[3].setStore(100);
//	medicine[3].setProfit(0);
//	medicine[4].setMdname("ֹʹҩ");
//	medicine[4].setPrice(15);
//	medicine[4].setStore(100);
//	medicine[4].setProfit(0);
//	medicine[5].setMdname("к��ͣ");
//	medicine[5].setPrice(6);
//	medicine[5].setStore(100);
//	medicine[5].setProfit(0);
m1.TakeMedicine(2);
m1.display();	
m2.TakeMedicine(2);
m2.display();	
	}	

	public static class Medicine{
		protected static String mdname;
		protected static double price;
		protected static int store;
		protected static double profit;
		public static double getProfit() {
			return profit;
		}
		public static void setProfit(double profit) {
			Medicine.profit = profit;
		}
		public static String getMdname() {
			return mdname;
		}
		public static void setMdname(String mdname) {
			Medicine.mdname = mdname;
		}
		public static double getPrice() {
			return price;
		}
		public static void setPrice(double price) {
			Medicine.price = price;
		}
		public static int getStore() {
			return store;
		}
		public static void setStore(int store) {
			Medicine.store = store;
		}

		@SuppressWarnings("static-access")
		public Medicine(String name,double pri,int sto,double pro){
			this.mdname=name;
			this.price=pri;
			this.store=sto;
			this.profit=pro;
		}
		
		public void TakeMedicine( int num) {
			// TODO Auto-generated method stub
         store-=num;
         profit+=num*price;
         System.out.println("ҩƷ���ƣ�"+getMdname()+"\t��������"+num+"\t��ҩƷ������"+getProfit());
		}		
		public void display(){
			System.out.println("ҩƷ���ƣ�"+getMdname()+"\t�۸�"+getPrice()+"\t���"+getStore());
		}
		public void show(){
			
		}
		
	}
	
	
	
}
