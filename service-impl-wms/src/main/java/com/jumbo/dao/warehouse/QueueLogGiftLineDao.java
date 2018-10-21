package com.jumbo.dao.warehouse;

import org.springframework.transaction.annotation.Transactional;

import loxia.dao.GenericEntityDao;

import com.jumbo.wms.model.warehouse.QueueLogGiftLine;
@Transactional
public interface QueueLogGiftLineDao extends GenericEntityDao<QueueLogGiftLine, Long> {

}
