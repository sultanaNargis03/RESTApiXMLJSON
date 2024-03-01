package com.telusko.pojo;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course 
{
	private Integer  cid;
	private String cname;
	private Double price;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + "]";
	}
	
}
