package com.wechat.entity.redpack.res;

import com.wechat.entity.WeixinResBase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 现金红包 响应参数
 * @Author: zhengyw
 * @Date: 2018/1/16 11:53
 * @Version: 1.0
 */
public class RedpackRes extends WeixinResBase {

    //商户订单号
    private String mch_billno;
    //商户号
    private String mch_id;
    //公众账号appid
    private String wxappid;
    //用户openid
    private String re_openid;
    //付款金额
    private Integer total_amount;
    //微信单号
    private String send_listid;

    public String getMch_billno() {
        return mch_billno;
    }

    public void setMch_billno(String mch_billno) {
        this.mch_billno = mch_billno;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getWxappid() {
        return wxappid;
    }

    public void setWxappid(String wxappid) {
        this.wxappid = wxappid;
    }

    public String getRe_openid() {
        return re_openid;
    }

    public void setRe_openid(String re_openid) {
        this.re_openid = re_openid;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Integer total_amount) {
        this.total_amount = total_amount;
    }

    public String getSend_listid() {
        return send_listid;
    }

    public void setSend_listid(String send_listid) {
        this.send_listid = send_listid;
    }
}
