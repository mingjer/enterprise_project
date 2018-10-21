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
 */
package com.jumbo.wms.model.warehouse;


/**
 * 仓库配货清单自动创建规则状态
 * 
 * @author lichuan
 * 
 */
public enum AutoPickingListRoleStatus {
    NORMAL(1), // 正常
    FORBID(0); // 禁用
    private int value;

    private AutoPickingListRoleStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static AutoPickingListRoleStatus valueOf(int value) {
        switch (value) {
            case 1:
                return NORMAL;
            case 0:
                return FORBID;
            default:
                return NORMAL;
        }
    }

}
