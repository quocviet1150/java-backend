package com.cms.portal.common;

public class StringUtil {
    public static boolean isNullOrEmpty(String str) {
        return ((str == null) || (str.trim().length() == 0));
    }

    public static String escapeSql(String input) {
        String result = input.trim().replace("/", "//").replace("_", "/_").replace("%", "/%");
        return result;
    }
    public static String sqlStringSearch(String str,boolean isLike){
        if(isLike)
            return "%" + StringUtil.escapeSql(str.toLowerCase().trim()) + "%";
        else
            return StringUtil.escapeSql(str.toLowerCase().trim());
    }

}
