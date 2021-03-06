package com.jumbo.util;

import java.io.Serializable;
import java.util.List;

public class StringUtil implements Serializable {


    /**
     * 
     */
    private static final long serialVersionUID = -6254019168299598385L;

    /**
     * 判断字符串是否为空
     * 
     * @param org
     * @return
     */
    public static Boolean isEmpty(String org) {
        Boolean flag = Boolean.FALSE;
        if (org == null || "".equals(org.trim())) {
            flag = Boolean.TRUE;
        }
        return flag;
    }

    /**
     * list转换为String
     * 
     * @param list
     * @param separator
     * @return
     */
    public static String listToString(List<?> list, char separator) {
        return "(" + org.apache.commons.lang.StringUtils.join(list.toArray(), separator) + ")";
    }

}
