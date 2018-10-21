/**
 * Copyright (c) 2010 Jumbomart All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of Jumbomart. You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jumbo.
 * 
 * JUMBOMART MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. JUMBOMART SHALL NOT BE LIABLE FOR ANY
 * DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES.
 * 
 */

package com.jumbo.dao.warehouse;

import java.util.List;

import loxia.annotation.NativeQuery;
import loxia.annotation.QueryParam;
import loxia.dao.GenericEntityDao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.jumbo.wms.model.command.StaSpecialExecutedCommand;
import com.jumbo.wms.model.warehouse.StaSpecialExecute;

@Transactional
public interface StaSpecialExecutedDao extends GenericEntityDao<StaSpecialExecute, Long> {

    /**
     * 查询
     * 
     * @param staId
     * @param rowMapper
     * @return
     */
    @NativeQuery
    List<StaSpecialExecutedCommand> findStaSpecialByStaId(@QueryParam(value = "staId") Long staId, @QueryParam(value = "type") Integer type, RowMapper<StaSpecialExecutedCommand> rowMapper);
}
