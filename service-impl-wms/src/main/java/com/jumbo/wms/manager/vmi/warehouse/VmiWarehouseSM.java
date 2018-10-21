package com.jumbo.wms.manager.vmi.warehouse;

import com.jumbo.wms.model.vmi.warehouse.MsgInboundOrder;
import com.jumbo.wms.model.vmi.warehouse.MsgOutboundOrderCancel;
import com.jumbo.wms.model.warehouse.InventoryStatus;
import com.jumbo.wms.model.warehouse.WarehouseLocation;

public class VmiWarehouseSM extends AbstractVmiWarehouse {

    /**
     * 
     */
    private static final long serialVersionUID = 4867067643681163049L;


    public void inboundNotice(MsgInboundOrder msgInorder) {}

    public void inboundReturnRequestAnsToWms(MsgInboundOrder msg) {

    }

    public boolean cancelSalesOutboundSta(String staCode, MsgOutboundOrderCancel msg) {
        return false;

    }

    @Override
    public WarehouseLocation findLocByInvStatus(InventoryStatus invStatus) {
        return null;
    }

    @Override
    public boolean cancelReturnRequest(Long msgLog) {
        return true;
    }
}
