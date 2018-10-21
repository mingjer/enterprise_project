package com.jumbo.dao.vmi.defaultData;

import java.util.List;

import loxia.annotation.NativeQuery;
import loxia.annotation.QueryParam;
import loxia.dao.GenericEntityDao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.jumbo.wms.model.vmi.Default.VmiTfxLineDefault;

@Transactional
public interface VmiTfxLineDao extends GenericEntityDao<VmiTfxLineDefault, Long> {

    @NativeQuery
    List<VmiTfxLineDefault> findVmiTfxLineByTfxId(@QueryParam("tfxid") Long tfxid, RowMapper<VmiTfxLineDefault> r);
}
