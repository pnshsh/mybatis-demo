package pnshsh.database.util;

import java.text.DecimalFormat;

public class StringUtil {

	/**
	 * @param n		要格式化数字
	 * @param l		位数
	 * @return
	 */
	public static String intToString(long n, int l) {  
        DecimalFormat decimalFormat = new DecimalFormat(initString(  
                '0', l));  
        return decimalFormat.format(n);  
    }  
      
    public static String initString(char ch, int length) {  
        if (length < 0)  
            return "";  
        char chars[] = new char[length];  
        for (int i = 0; i < length; i++)  
            chars[i] = ch;  
        return new String(chars);  
    }  
}
