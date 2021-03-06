package com.wechat.entity.pay.res;

import com.wechat.entity.WeixinResBase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 查询订单 响应参数
 * @Author: zhengyw
 * @Date: 2017/11/27 16:49
 * @Version: 1.0
 */
public class WeixinResOrderquery extends WeixinResBase {

    //公众账号ID
    private String appid;
    //商户号
    private String mch_id;
    //随机字符串
    private String nonce_str;
    //签名
    private String sign;

    //设备号
    private String device_info;
    //用户标识
    private String openid;
    //是否关注公众账号(用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效)(非必传)
    private String is_subscribe;
    //交易类型(调用接口提交的交易类型，取值如下：JSAPI，NATIVE，APP，MICROPAY)
    private String trade_type;
    /**
     * 交易状态
     * SUCCESS—支付成功
     * REFUND—转入退款
     * NOTPAY—未支付
     * CLOSED—已关闭
     * REVOKED—已撤销（刷卡支付）
     * USERPAYING--用户支付中
     * PAYERROR--支付失败(其他原因，如银行返回失败)
    */
    private String trade_state;
    //付款银行
    private String bank_type;
    //标价金额(订单总金额，单位为分)
    private Integer total_fee;
    //应结订单金额(当订单使用了免充值型优惠券后返回该参数，应结订单金额=订单金额-免充值优惠券金额)(非必传)
    private Integer settlement_total_fee;
    //标价币种(货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY)(非必传)
    private String fee_type;
    //现金支付金额(现金支付金额订单现金支付金额)
    private Integer cash_fee;
    //现金支付币种(货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY)(非必传)
    private String cash_fee_type;
    //代金券金额(“代金券”金额<=订单金额，订单金额-“代金券”金额=现金支付金额)(非必传)
    private Integer coupon_fee;
    //代金券使用数量(非必传)
    private Integer coupon_count;
    /**
     * 代金券类型(非必传)
     * CASH--充值代金券
     * NO_CASH---非充值优惠券
     * 开通免充值券功能，并且订单使用了优惠券后有返回（取值：CASH、NO_CASH）。$n为下标,从0开始编号，举例：coupon_type_$0
     * */
    private String coupon_type_$n;
    //代金券ID(代金券ID, $n为下标，从0开始编号)(非必传)
    private String coupon_id_$n;
    //单个代金券支付金额(单个代金券支付金额, $n为下标，从0开始编号)(非必传)
    private Integer coupon_fee_$n;
    //微信支付订单号
    private String transaction_id;
    //商户订单号(商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一)
    private String out_trade_no;
    //附加数据(附加数据，原样返回)(非必传)
    private String attach;
    //支付完成时间(订单支付时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010)
    private String time_end;
    //交易状态描述(对当前查询订单状态的描述和下一步操作的指引)
    private String trade_state_desc;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getTrade_state() {
        return trade_state;
    }

    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public Integer getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Integer total_fee) {
        this.total_fee = total_fee;
    }

    public Integer getSettlement_total_fee() {
        return settlement_total_fee;
    }

    public void setSettlement_total_fee(Integer settlement_total_fee) {
        this.settlement_total_fee = settlement_total_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public Integer getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(Integer cash_fee) {
        this.cash_fee = cash_fee;
    }

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    public Integer getCoupon_fee() {
        return coupon_fee;
    }

    public void setCoupon_fee(Integer coupon_fee) {
        this.coupon_fee = coupon_fee;
    }

    public Integer getCoupon_count() {
        return coupon_count;
    }

    public void setCoupon_count(Integer coupon_count) {
        this.coupon_count = coupon_count;
    }

    public String getCoupon_type_$n() {
        return coupon_type_$n;
    }

    public void setCoupon_type_$n(String coupon_type_$n) {
        this.coupon_type_$n = coupon_type_$n;
    }

    public String getCoupon_id_$n() {
        return coupon_id_$n;
    }

    public void setCoupon_id_$n(String coupon_id_$n) {
        this.coupon_id_$n = coupon_id_$n;
    }

    public Integer getCoupon_fee_$n() {
        return coupon_fee_$n;
    }

    public void setCoupon_fee_$n(Integer coupon_fee_$n) {
        this.coupon_fee_$n = coupon_fee_$n;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public String getTrade_state_desc() {
        return trade_state_desc;
    }

    public void setTrade_state_desc(String trade_state_desc) {
        this.trade_state_desc = trade_state_desc;
    }
}
