package pnshsh.database.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetUtil {

	public static String getURLContent(String urlStr) {
		/** 网络的url地址 */
		URL url = null;
		/**//** 输入流 */
		BufferedReader in = null;
		StringBuffer sb = new StringBuffer();
		try {
			url = new URL(urlStr);
			in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			String str = null;
			while ((str = in.readLine()) != null) {
				sb.append(str);
			}
		} catch (Exception ex) {

		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
			}
		}
		String result = sb.toString();
		System.out.println(result);
		return result;
	}
}
