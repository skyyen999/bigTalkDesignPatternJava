package c22.bridge;

public class HandsetBrandM extends HandsetBrand {
	private String brand = "M牌手機";
	@Override
	public void run() {
		System.out.print(brand+" ");
		soft.run();
	}

}
