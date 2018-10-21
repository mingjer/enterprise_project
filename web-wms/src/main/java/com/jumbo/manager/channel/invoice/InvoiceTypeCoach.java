package com.jumbo.manager.channel.invoice;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import loxia.support.excel.ExcelWriter;
import loxia.support.excel.WriteStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jumbo.wms.manager.channel.ChannelManager;
import com.jumbo.wms.model.warehouse.StaInvoiceCommand;

/**
 * COACH发票类型
 * 
 * @author jumbo
 * 
 */
@Service("invoiceTypeCoach")
public class InvoiceTypeCoach implements InvoiceTypeInterface {

	private final static String EXCEL_DATA_NAME = "data";
	private final static String EXCEL_COACH_FILE_FULL_PATH = "excel/tplt_export_coach_invoice.xls";

	@Autowired
	private ChannelManager channelManager;
	@Resource(name = "coachInvoiceExportWriter")
	private ExcelWriter coachInvoiceExportWriter;

	@Override
	public List<StaInvoiceCommand> getInvoiceData(Long plId, Long staId) {
		return channelManager.findCoachInvoice(plId, staId);
	}

	@Override
	public WriteStatus writeExcel(List<StaInvoiceCommand> data, OutputStream os) {
		Map<String, Object> beans = new HashMap<String, Object>();
		beans.put(EXCEL_DATA_NAME, data);
		return coachInvoiceExportWriter.write(EXCEL_COACH_FILE_FULL_PATH, os, beans);
	}

    @Override
    public List<StaInvoiceCommand> getReplenishInvoiceData(String batchNo, List<Long> wioIdList) {
        return channelManager.findReplenishCoachInvoice(batchNo, wioIdList);
    }

}