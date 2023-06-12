package curs9;

public class Laptop extends Product{

	
	private int buyingPrice;
	private int vat;
	private int adaos;
	
	public Laptop(int buyingPrice,int vat,int adaos) {
		setVat(vat);
		setBuyingPrice(buyingPrice);
		setAdaos(adaos);
	}
	
	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return buyingPrice + vat+ adaos;
	}
	public int getBuyingPrice() {
		return buyingPrice;
	}
	private void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	public int getVat() {
		return vat;
	}
	private void setVat(int vat) {
		this.vat = vat;
	}
	public int getAdaos() {
		return adaos;
	}
	private void setAdaos(int adaos) {
		this.adaos = adaos;
	}
	
	
	

}
