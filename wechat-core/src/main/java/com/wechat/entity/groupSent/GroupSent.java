package com.wechat.entity.groupSent;

import com.wechat.entity.base.BaseWxEntity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 根据标签进行群发 响应参数
 * @Author: zhengyw
 * @Date: 2017/11/30 9:49
 * @Version: 1.0
 */
public class GroupSent extends BaseWxEntity {

    //媒体文件类型，分别有图片（image）、语音（voice）、视频（video）和缩略图（thumb），图文消息为news
    private String type;
    //消息发送任务的ID
    private Integer msg_id;
    // 消息的数据ID，该字段只有在群发图文消息时，才会出现。可以用于在图文分析数据接口中，获取到对应的图文消息的数据，
    // 是图文分析数据接口中的msgid字段中的前半部分，详见图文分析数据接口中的msgid字段的介绍。
    private Integer msg_data_id;
    // 消息发送后的状态，SEND_SUCCESS表示发送成功，SENDING表示发送中，SEND_FAIL表示发送失败，DELETE表示已删除
    private String msg_status;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(Integer msg_id) {
        this.msg_id = msg_id;
    }

    public Integer getMsg_data_id() {
        return msg_data_id;
    }

    public void setMsg_data_id(Integer msg_data_id) {
        this.msg_data_id = msg_data_id;
    }

    public String getMsg_status() {
        return msg_status;
    }

    public void setMsg_status(String msg_status) {
        this.msg_status = msg_status;
    }
}
