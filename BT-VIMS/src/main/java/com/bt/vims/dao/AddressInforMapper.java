package com.bt.vims.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bt.vims.model.AddressInfor;
import com.bt.vims.page.QueryParameter;

/**
 * 地址信息仓库
 * @author liuqingqiang
 * @date 2018-05-11
 * @version V1.0
 *
 */
@Repository
public interface AddressInforMapper {
	/**
	 * 查询库中所有的地址信息(分页查询)
	 * @return （所有地址信息实例集合）
	 */
	public List<AddressInfor> getDetailInfo(QueryParameter queryParameter);
	public Integer getDetailInfoCount(QueryParameter queryParameter);
	
	/**
	 *查询所有地址信息
	 * @param map (只查询isDelectd为0的数据)
	 * @return (地址信息集合）
	 */
	public List<AddressInfor> getAllAddressInfor(Map<String, Object> map);
	
	/**
	 * 根据具体的地址信息ID查找一条信息
	 * @param id （查找具体某条信息id）
	 * @return （地址信息实体对象）
	 */
	public AddressInfor findSingleAddressInfor(Map<String, Integer> map); 
	
	/**
	 * 修改地址信息
	 * @param newInfor （新地址信息实例）
	 */
	public void updateAddressInfor(AddressInfor newInfor);
	
	/**
	 * 新增地址信息
	 * @param addressInfor （新增信息实例）
	 */
	public void insertAddressInfor(AddressInfor addressInfor);
	
	/**
	 * 删除地址信息(物理删除)
	 * @param idLists （所勾选删除id的集合）
	 */
	public void phyDeleteAddressInfor(List<String> idLists);
	
	/**
	 * 删除地址信息(逻辑删除)
	 * @param map (条件以及修改参数)
	 */
	public void logicDeleteAddressInfor(Map<String, Object> map);
	
	/**
	 * 验证地址编码不重复
	 * @param addressCode （新增地址编码）
	 * @return
	 */
	public List<AddressInfor> validateCode(Map<String, Object> map);
	
	
	/**
	 * 根据地址名称查询地址编码
	 * @param map
	 * @return
	 */
	public AddressInfor findDataByName(Map<String, Object> map);

}
