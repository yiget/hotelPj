package org.itrip.utils;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

/**
 * 支付宝支付工具类
 * @author naruto
 *
 */
public class AliTrade {
	//appid 对应《沙箱应用》页面的appid
	public static final String APP_ID = "2016091000480586";
	//对应工具生产的商户应用私钥
	public static final String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC90R+FyRIGIwZf+Gui1uWIfahGxCpbHb4TqfQGWi4VzBCJhdOlT33MtEjjfDWB7dabo0G7ySYzyjRHbXTxf+3sQ3s6zSljzB1YVccmLoZdtR9BzCYHgOPOtAUh03AFjQq8PFne/JaiFa9mURUjq/2r+U8IAMb0J/DmWP40XOBux9vuqwB/lkHktwi6+OeoPiMlXqr7+4nlwUzGj7FWxHL3x6hXkyEhuYE7aHD29cYbkMwmzqz3OxrYUAAE81y5XG43Yju+7FxpFz6r4Y6F4zMdHVmnIrcgnYh11wh8EW9XP06+j+8Kw86BA/5hjqZCl8HoeU6S5IEKjGKVjv35pq89AgMBAAECggEAD+vPghA4c81SRpB2rsTpocYwbCceCmB3Rfz2W+YKgYeJR4+zDeWZ/qaMipAriMdjPdC2vcKEcsmeEvOqYGtDkJKkbm0w8I75UyR2vMwgNxHvGjy+X9i+wuK0n361obGP2fQR8bMsC1JYUPOyGzjc4STbLSeriGUlPpzuTYQQyxnRNed3X9B+ebYfs7qEovTNI8dMtCXEh6EDEhyqGM+5XqD6ifcN72iQ5EPkJto8abncN/GTzltlw/BoOluGPuWpUsxaQ4xlyXYoy4hEpv6qekQfTNEu6MKUsSjDefZ4wxFcbpY3ocpN8uhpZYJXQXGn/6l7EackXz6BlMuJtalaoQKBgQD1hJqHLZhFs4zO6vTcOoiUIIf0Y26O2GD9dHszc43IVVFxJcTGlJuIxB3lBvpUYTl2QH0n4LwTS4GHCXgm6yR8ouJqfD2DTtNOtohTSHl4jYAdwkh8C58oE+K4COD/wi3JnAR3kwadwa91QgCO/O6U4k3rBOzZPvqmOaYrnLxlVQKBgQDF67uP8M4M2tdbZaNA3qtyxRv8/X6PCTTHs1UTZ4eZJ3OxZiuvtTD1HujqKYaV6kvhtus3IZ3+UDW2X6qvMjXiYGbOVMSslmEUKIboqFMqnReArpMtKPMhwcalLNKzmOGrI6HbaI9UjOx7b2PE2gopkCL42sC/S6USIOYM8JaiSQKBgQDdeIaklf6cMYE9TjkfSDXX2RiK3f7nIE0tlRtlqEEni77xoC5HK9q5np+Q76B06VcaUsYTaOh/R0dKdsJJ6Sd6vrwbboNWpY57nLCQ3/mjQ5FkRtN4AkvJrVaAyJGeZJ1FFlX5P0limUsbLTSvx324FARRkpnMxsD3nV1GThasGQKBgB1Df5YGytCHwvPWkU7UHZF4p2y+pmnLuKwWTevykNAKT0bZjngKWFTF3zZQMYAVBmc3PowGQnAJuAdhGcGRsPnpuwmi6vmBupTacSgRS0qvs3vpVAWHWnuRRSfC+txnLGa7fAEO8rJTq9uMWroOaxY+I42b+ofOTXfiuWEMaZlRAoGBAIlXzRsAtAye9nUsrLlHE/VcFT3vm/0enXUO0HEN/aN/Q9Hs7njGfINwKPPLo/LfF4Ym8NBijXHW+pggrHoXdJLVmnEdaiKIXqr8bP8VCLX7d+MlR9qsi6TH9GyAhLOAF+FeTBimLtntun2cyGKqq2Nfjo/xAJd1U7zXBVvhUhb6";
	//传输格式，只能为json
	public static final String FORMAT = "json";
	//字符编码可以根据需求修改
	public static final String CHARSET = "utf-8";
	//此处为支付宝公钥非应用公钥，注意不要搞混了，在《沙箱应用》页面点击查看支付宝公钥可以得到
	public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1Pe6r05EIOMZ/XxtzF0kIiuBkC0zAle7amt2RX+8Fzb9gWQiq/dIiMsOaR/xioYEe6zY67Vb28Xmw0a9Roy+fxgEVoHBgij433Apf3Ie/K8Vk9YU1Cz/tRa+fcnrmM28Ixm14BPXqMTx8EXD6cTfysVUQx5KU+66OE1MejadL9/IF+NGAGnM0a65bq8AOb7pEP2Ky//2H6YrNSNE4AMPD+XkSKUT5PQXsCkLfV0JQya6j1KGL/SP+6eDuGR05BJmn7oAQS7jOkU+ydX1rqvpdKtr5h1PY917/AQY98Tnx5ltlNFh2g6SXQpuHv7QYROl8S6Qux3eTP3aBGmzlKs4owIDAQAB";
	//签名算法类型，支付宝推荐使用RSA2
	public static final String SIGN_TYPE = "RSA2";
	//沙箱支付宝网关，在《沙箱应用》页面可以看到
	public static final String GATEWAY = "https://openapi.alipaydev.com/gateway.do";
	
	/**
	 * 调用支付宝支付页面
	 * @param pay 支付宝支付页面请求参数对象
	 * @return 返回支付页面表单标签字符串
	 */
	public static String pay(Pay pay) {
		//获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(GATEWAY, APP_ID, 
				APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE); 
		//创建API对应的request
	    AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	    //同步回调地址
	    alipayRequest.setReturnUrl("http://localhost:8080/itrip/return_url");
	    //异步回调地址
	    alipayRequest.setNotifyUrl("http://localhost:8080/itrip/notify_url");
	    //业务参数为json格式
	    alipayRequest.setBizContent(JSON.toJSONString(pay));
	    //页面表单标签字符串
	    String form="";
	    try {
	    	 //调用SDK生成表单
	        form = alipayClient.pageExecute(alipayRequest).getBody();
	    } catch (AlipayApiException e) {
	        e.printStackTrace();
	    }
	    return form;
	}
}
