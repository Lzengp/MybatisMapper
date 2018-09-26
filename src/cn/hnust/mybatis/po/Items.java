package cn.hnust.mybatis.po;

/**
 * 商品信息实体
 * @author 龙伟
 * 2018年9月26日
 */
public class Items {

	private int id;//商品id
	private String name;//商品名
	private String detail;//商品详情
	private String price;//商品价格
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
