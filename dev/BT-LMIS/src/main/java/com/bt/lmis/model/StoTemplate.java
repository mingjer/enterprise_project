package com.bt.lmis.model;

/**
* @ClassName: StoTemplate
* @Description: TODO(StoTemplate)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class StoTemplate {
	
	
	private String bat_id;			//批次号
	
		return bat_id;
	}
	public void setBat_id(String bat_id) {
		this.bat_id = bat_id;
	}
	public Integer getId() {
	public StoTemplate(String[] row,String bath_id) {
		this.bat_id = bath_id;
//		this.express_bill = row[0];
//		this.transport_product_type = row[1];
//		this.transport_direction = row[2];
//		this.deliver_date = row[3];
//		this.transport_time = row[4];
//		this.express_number = row[5];
//		this.store = row[6];
//		this.order_number = row[7];
//		this.orign = row[8];
//		this.province_dest = row[9];
//		this.city_dest = row[10];
//		this.weight = row[11];
//		this.sku_number = row[12];
//		this.length = row[13];
//		this.width = row[14];
//		this.higth = row[15];
//		this.volumn = row[16];
//		this.order_amount = row[17];
//		this.firstWeigthPrice = row[18];
//		this.addedWeightPrice = row[19];
//		this.discount = row[20];
//		this.standard_freight = row[21];
//		this.afterDiscount_freight = row[22];
//		this.insurance = row[23];
//		this.other = row[24];
//		this.total_fee = row[25];
//		this.remark = row[26];

		this.transport_product_type = row[0];
		this.transport_direction = row[1];
		this.deliver_date = row[2];
		this.transport_time = row[3];
		this.express_number = row[4];
		this.store = row[5];
		this.order_number = row[6];
		this.orign = row[7];
		this.province_dest = row[8];
		this.city_dest = row[9];
		this.weight = row[10];
		this.sku_number = row[11];
		this.length = row[12];
		this.width = row[13];
		this.higth = row[14];
		this.volumn = row[15];
		this.order_amount = row[16];
		this.firstWeigthPrice = row[17];
		this.addedWeightPrice = row[18];
		this.discount = row[19];
		this.standard_freight = row[20];
		this.afterDiscount_freight = row[21];
		this.insurance = row[22];
		this.other = row[23];
		this.total_fee = row[24];
		this.remark = row[25];
	}
	
}