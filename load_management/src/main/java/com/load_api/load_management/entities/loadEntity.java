package com.load_api.load_management.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mt_load")
public class loadEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "load_id")
	private long loadId;
	@Column(name = "loading_point")
	private String loadingPoint;
	@Column(name = "unloading_point")
	private String unloadingPoint;
	@Column(name = "product_type")
	private String productType;
	@Column(name = "truck_type")
	private String truckType;
	@Column(name = "no_of_trucks")
	private int noOfTrucks;
	@Column(name = "weight")
	private float weight;
	@Column(name = "comment")
	private String comment;
	@Column(name = "shipper_id")
	private long shipperId;
	@Column(name = "date")
	private String date;
	
	public loadEntity(long loadId, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, float weight, String comment, long shipperId, String date) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}
	
	public loadEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getLoadId() {
		return loadId;
	}
	public void setLoadId(long loadId) {
		this.loadId = loadId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "loadEntity [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date
				+ ", getLoadId()=" + getLoadId() + ", getLoadingPoint()=" + getLoadingPoint() + ", getUnloadingPoint()="
				+ getUnloadingPoint() + ", getProductType()=" + getProductType() + ", getTruckType()=" + getTruckType()
				+ ", getNoOfTrucks()=" + getNoOfTrucks() + ", getWeight()=" + getWeight() + ", getComment()="
				+ getComment() + ", getShipperId()=" + getShipperId() + ", getDate()=" + getDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
