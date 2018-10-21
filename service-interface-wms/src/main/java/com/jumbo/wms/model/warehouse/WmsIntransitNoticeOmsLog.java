package com.jumbo.wms.model.warehouse;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OptimisticLockType;

import com.jumbo.wms.model.BaseModel;
import com.jumbo.wms.model.authorization.OperationUnit;

/**
 * oms出库通知日志表
 * 
 * @author xiaolong.fei
 * 
 */
@Entity
@Table(name = "T_LG_INTRANSIT_TO_OMS")
@org.hibernate.annotations.Entity(optimisticLock = OptimisticLockType.VERSION)
public class WmsIntransitNoticeOmsLog extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1930525708808051516L;
	/**
	 * PK
	 */
	private Long id;
	/**
	 * 出库作业单号
	 */
	private String staCode;
	/**
	 * 作业单ID
	 */
	private Long staId;
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 最后修改时间
	 */
	private Date finishTime;
	/**
	 * 仓库组织ID
	 */
	private OperationUnit whOuId;

	/**
	 * 渠道code
	 */
	private String owner;

	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "SEQ_LGIN_NOTI_OMS", sequenceName = "S_T_LG_INTRANSIT_TO_OMS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LGIN_NOTI_OMS")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "STA_CODE")
	public String getStaCode() {
		return staCode;
	}

	public void setStaCode(String staCode) {
		this.staCode = staCode;
	}

	@Column(name = "STA_ID")
	public Long getStaId() {
		return staId;
	}

	public void setStaId(Long staId) {
		this.staId = staId;
	}

	@Column(name = "CREATE_TIME")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "FINISH_TIME")
	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WH_OU_ID")
	public OperationUnit getWhOuId() {
		return whOuId;
	}

	public void setWhOuId(OperationUnit whOuId) {
		this.whOuId = whOuId;
	}

	@Column(name = "OWNER")
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
