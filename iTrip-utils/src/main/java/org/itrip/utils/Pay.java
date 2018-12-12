package org.itrip.utils;

/**
 * 支付宝业务参数封装对象
 * @author naruto
 *
 */
public class Pay {
	/**
	 * 商户订单号，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	private String out_trade_no;
	/**
	 * 销售产品码，与支付宝签约的产品码名称。 注：目前仅支持FAST_INSTANT_TRADE_PAY
	 */
	private String product_code = "FAST_INSTANT_TRADE_PAY";
	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	private Double total_amount;
	/**
	 * 订单标题
	 */
	private String subject;
	/**
	 * 订单描述
	 */
	private String body;
	/**
	 * 订单包含的商品列表信息，Json格式： 
	 * {&quot;show_url&quot;:&quot;https://或http://打头的商品的展示地址&quot;} ，
	 * 在支付时，可点击商品名称跳转到该地址
	 */
	private String goods_detail;
	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。
	 * 支付宝只会在异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝
	 */
	private String passback_params;
	/**
	 * 业务扩展参数，为一个内部类，创建在本类的底部
	 */
	private ExtendParam extend_params = new ExtendParam();
	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天
	 * （1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 * 该参数在请求到支付宝时开始计时。
	 */
	private String timeout_express;
	
	
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		if(out_trade_no != null && out_trade_no.length() <= 64)
			this.out_trade_no = out_trade_no;
	}
	public String getProduct_code() {
		return product_code;
	}
	public Double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(Double total_amount) {
		if(total_amount != null && total_amount>0.01 && total_amount <= 100000000)
			this.total_amount = total_amount;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if(subject != null && subject.length() <= 256)
			this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		if(body != null && body.length() <= 128)
			this.body = body;
	}
	public String getGoods_detail() {
		return goods_detail;
	}
	public void setGoods_detail(String goods_detail) {
		this.goods_detail = goods_detail;
	}
	public String getPassback_params() {
		return passback_params;
	}
	public void setPassback_params(String passback_params) {
		if(passback_params != null && passback_params.length() <= 512)
			this.passback_params = passback_params;
	}
	public ExtendParam getExtend_params() {
		return extend_params;
	}
	public String getTimeout_express() {
		return timeout_express;
	}
	public void setTimeout_express(String timeout_express) {
		if(timeout_express != null && timeout_express.length() <= 6)
			this.timeout_express = timeout_express;
	}
	/**
	 * 内部类，为扩展业务参数
	 * @author naruto
	 *
	 */
	public class ExtendParam{
		/**
		 * 商户收款UID对应《沙箱帐号》页面的商户UID
		 */
		public String sys_service_provider_id = "2088102175020213";
	}
	
}
