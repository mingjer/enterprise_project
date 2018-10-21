package com.bt.orderPlatform.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;

/**
* @ClassName: WaybilMasterDetail
* @Description: TODO(WaybilMasterDetail)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class BaoZunWaybilMasterDetail {
	
    public static void main(String[] args){
        try{
            System.out.println(new BigDecimal(new DecimalFormat().parse("13 000.23".replaceAll(" ", "")).doubleValue()));
        }catch (ParseException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
 
        }
    }
    
	private String flag;			//标记是否有误
	private String view_area_address;			//标记是否有误
	private String view_area_fromaddress;			//标记是否有误
	private Date print_time;			//标记是否有误
	private String amount_flag;			//标记是否有误
	private String sendcode;			//标记是否有误
	private String is_docall;			//是否需要上门打印面单
	private Integer new_source;			//新增来源
	private  String custid;   //月结卡号
	private  String pay_path;   //支付方式
	private  String cost_center;   //成本中心
	private  String store_code;   //成本中心
	private  java.math.BigDecimal insured;   //成本中心
	private int ordinal; //同一批次序列号

    public int getOrdinal(){
        return ordinal;
    }
    
    public void setOrdinal(int ordinal){
        this.ordinal = ordinal;
    }
    public String getStore_code() {
		return store_code;
	}
	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}
	public java.math.BigDecimal getInsured() {
		return insured;
	}
	public void setInsured(java.math.BigDecimal insured) {
		this.insured = insured;
	}
	public String getPay_path() {
		return pay_path;
	}
	public void setPay_path(String pay_path) {
		this.pay_path = pay_path;
	}
	public String getCost_center() {
		return cost_center;
	}
	public void setCost_center(String cost_center) {
		this.cost_center = cost_center;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public Integer getNew_source() {
		return new_source;
	}
	public void setNew_source(Integer new_source) {
		this.new_source = new_source;
	}
	public String getIs_docall() {
		return is_docall;
	}
	public void setIs_docall(String is_docall) {
		this.is_docall = is_docall;
	}
	public String getSendcode() {
		return sendcode;
	}
	public void setSendcode(String sendcode) {
		this.sendcode = sendcode;
	}
	public String getAmount_flag() {
		return amount_flag;
	}
	public void setAmount_flag(String amount_flag) {
		this.amount_flag = amount_flag;
	}
	public Date getPrint_time() {
		return print_time;
	}
	public void setPrint_time(Date print_time) {
		this.print_time = print_time;
	}
	public String getView_area_fromaddress() {
		return view_area_fromaddress;
	}
	public void setView_area_fromaddress(String view_area_fromaddress) {
		this.view_area_fromaddress = view_area_fromaddress;
	}
	public String getView_area_address() {
		return view_area_address;
	}
	public void setView_area_address(String view_area_address) {
		this.view_area_address = view_area_address;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getId() {
	
	public BaoZunWaybilMasterDetail(){
		
	}
	
	public  BaoZunWaybilMasterDetail(String[] row) {
		this.cost_center = row[0];
		this.from_contacts = row[1];
		this.from_phone = row[2];
		this.from_province = row[3];
		this.from_city=row[4];
		this.from_state = row[5];
		this.from_address = row[6];
		this.to_orgnization = row[7];
		this.to_contacts = row[8];
		this.to_phone = row[9];
		this.to_province = row[10];
		this.to_city = row[11];
		this.to_state = row[12];
		this.to_address = row[13];
		this.express_name = row[14];
		this.producttype_name = row[15];
		this.pay_path = row[16];
		this.amount_flag = row[17];
		if(row[18]!=null){
		    try{    
		        this.insured = new BigDecimal(new DecimalFormat().parse(row[18].replaceAll(" ", "")).doubleValue());
		    }catch (ParseException e){
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		        this.flag ="2";
		        this.remark="导入金额数据类型错误;";
		    }
		}
		this.memo = row[19];
		this.sku_code = row[20];
		this.sku_name = row[21];
		if(row[22]!=null){
		    try{
                this.qty = new DecimalFormat().parse(row[22]).intValue();
                this.total_qty = this.qty ;
            }catch (ParseException e){
                // TODO Auto-generated catch block
                e.printStackTrace();
                this.flag ="2";
                if(remark==null){
                    this.remark="导入件数数据类型错误;";
                }else{
                    this.remark="导入件数数据类型错误;"+remark;
                }
            }
		}else{
			this.qty =0;
		}
		if(row[23]!=null){ 
             try{
                    this.weight = new BigDecimal(new DecimalFormat().parse(row[23]).doubleValue());
                    this.total_weight = this.weight ;
                }catch (ParseException e){
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    this.flag ="2";
                    if(remark==null){
                        this.remark="导入重量数据类型错误;";
                    }else{
                        this.remark="导入重量数据类型错误;"+remark;
                    }
                }
		}
		if(row[24]!=null){			    
		    try{
                this.volumn = new BigDecimal(new DecimalFormat().parse(row[24]).doubleValue());
                this.total_volumn = this.volumn ;
            }catch (ParseException e){
                // TODO Auto-generated catch block
                e.printStackTrace();
                this.flag ="2";
                if(remark==null){
                    this.remark="导入体积数据类型错误;";
                }else{
                    this.remark="导入体积数据类型错误;"+remark;
                }
            }
		}
	}
}