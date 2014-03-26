
public class MainTest {
	public static void main(String []args){
		//상속받은 Television 클래스와 WashingMachine 클래스의 메소드를 이용해 각 제품의 정보를 출력해준다.
		//다형성을 이용하여 Electric객체 안에 Television와 WashingMachine객체를 생성할 수 있다.
		//부모 배열안에 서로 다른 자식배열을 생성함으로써 효율적인 코딩이 이루어 진다.
		
		System.out.println("nnnnnnnnnndnnn");
		
		ControllIF product=new ControllDevice();
		product.insertProduct(new Television(3401,"LG 평면TV", 2400000,76,"Full HD TV","HD",22));
		product.insertProduct(new Television(3402,"벽걸이 TV",1590000,123,"벽에 걸수있는 TV","HD",14));
		product.insertProduct(new Television(3403,"3D 입체TV",3000000,43,"입체적인 TV","LED",17));
		product.insertProduct(new Television(3404,"4D 사차원TV",4000000,45,"알수없는 TV","HD",32));
		product.insertProduct(new Television(3405,"LG 아날로그TV", 150000,86,"초기 컬러 TV","아날로그",13));
		
		product.insertProduct(new WashingMachine(4501,"보보스 썬샤인",550000,163,"햇빛건조 기능세탁기",50));
		product.insertProduct(new WashingMachine(4502,"드럼 세탁기",730000,35,"드럼통같은 세탁기",60));
		product.insertProduct(new WashingMachine(4503,"자연건조 세탁기",300000,322,"건조가 잘되는 세탁기",55));
		product.insertProduct(new WashingMachine(4504,"에너지 절약 세탁기",1200000,353,"에너지등급 상 세탁기",70));
		product.insertProduct(new WashingMachine(4505,"물 절약 세탁기",1700000,111,"물안먹는 세탁기",40));
		
		
		product.deleteProduct(3402);
		
		product.insertProduct(new WashingMachine(4506,"불 절약 세탁기",179999,99,"불먹는 세탁기",40));
		
	    product.updateProduct(new WashingMachine(4502,"풍금 세탁기",63000,63,"풍금같은 세탁기",63));
		
		System.out.println("****** 모든 정보 ******");
		for(int i=0; i<product.size(); i++){
			System.out.println(product.getAllProduct().get(i).toString());
		}
		System.out.println("****** 3404 정보 ******");
	    System.out.println(product.getProduct(3404).toString());
	    
	    
	    
	}
}
