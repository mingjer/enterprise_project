package com.bt.lmis.model;

import java.util.List;

/**
* @ClassName: CollectionMaster
* @Description: TODO(CollectionMaster)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class CollectionMaster {
	
	
	private List<CollectionDetail> details;//从表
	
		return details;
	}
	public void setDetails(List<CollectionDetail> details) {
		this.details = details;
	}
	public Integer getId() {
	@Override
	public String toString() {
		return "CollectionMaster [id=" + id + ", create_time=" + create_time + ", create_user=" + create_user
				+ ", update_time=" + update_time + ", update_user=" + update_user + ", cost_center=" + cost_center
				+ ", store_code=" + store_code + ", warehouse_code=" + warehouse_code + ", insurance_fee="
				+ insurance_fee + ", service_fee=" + service_fee + ", total=" + total + ", master_id=" + master_id
				+ ", details=" + details + "]";
	}
	
}