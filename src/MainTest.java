
public class MainTest {
	public static void main(String []args){
		//��ӹ��� Television Ŭ������ WashingMachine Ŭ������ �޼ҵ带 �̿��� �� ��ǰ�� ������ ������ش�.
		//�������� �̿��Ͽ� Electric��ü �ȿ� Television�� WashingMachine��ü�� ������ �� �ִ�.
		//�θ� �迭�ȿ� ���� �ٸ� �ڽĹ迭�� ���������ν� ȿ������ �ڵ��� �̷�� ����.
		
		System.out.println("nnnnnnnnnndnnn");
		
		ControllIF product=new ControllDevice();
		product.insertProduct(new Television(3401,"LG ���TV", 2400000,76,"Full HD TV","HD",22));
		product.insertProduct(new Television(3402,"������ TV",1590000,123,"���� �ɼ��ִ� TV","HD",14));
		product.insertProduct(new Television(3403,"3D ��üTV",3000000,43,"��ü���� TV","LED",17));
		product.insertProduct(new Television(3404,"4D ������TV",4000000,45,"�˼����� TV","HD",32));
		product.insertProduct(new Television(3405,"LG �Ƴ��α�TV", 150000,86,"�ʱ� �÷� TV","�Ƴ��α�",13));
		
		product.insertProduct(new WashingMachine(4501,"������ �����",550000,163,"�޺����� ��ɼ�Ź��",50));
		product.insertProduct(new WashingMachine(4502,"�巳 ��Ź��",730000,35,"�巳�배�� ��Ź��",60));
		product.insertProduct(new WashingMachine(4503,"�ڿ����� ��Ź��",300000,322,"������ �ߵǴ� ��Ź��",55));
		product.insertProduct(new WashingMachine(4504,"������ ���� ��Ź��",1200000,353,"��������� �� ��Ź��",70));
		product.insertProduct(new WashingMachine(4505,"�� ���� ��Ź��",1700000,111,"���ȸԴ� ��Ź��",40));
		
		
		product.deleteProduct(3402);
		
		product.insertProduct(new WashingMachine(4506,"�� ���� ��Ź��",179999,99,"�ҸԴ� ��Ź��",40));
		
	    product.updateProduct(new WashingMachine(4502,"ǳ�� ��Ź��",63000,63,"ǳ�ݰ��� ��Ź��",63));
		
		System.out.println("****** ��� ���� ******");
		for(int i=0; i<product.size(); i++){
			System.out.println(product.getAllProduct().get(i).toString());
		}
		System.out.println("****** 3404 ���� ******");
	    System.out.println(product.getProduct(3404).toString());
	    
	    
	    
	}
}
