package c22.bridge;

public class HandsetBrandN extends HandsetBrand {
	private String brand = "N牌手機";
	@Override
	public void run() {
		System.out.print(brand+" ");
		soft.run();
	}

}
