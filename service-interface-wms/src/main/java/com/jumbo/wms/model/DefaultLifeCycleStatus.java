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

package com.jumbo.wms.model;

public enum DefaultLifeCycleStatus {
    CANCELED(0), // 作废
    CREATED(1); // 有效


    private int value;

    private DefaultLifeCycleStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    public static DefaultLifeCycleStatus valueOf(int value) {
        switch (value) {
            case 0:
                return CANCELED;
            case 1:
                return CREATED;
            default:
                throw new IllegalArgumentException();
        }
    }
}
