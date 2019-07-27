package com.wechat.wxentry.entity.res;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 图文消息详情
 * @Author: zhengyw
 * @Date: 2017/11/22 11:14
 * @Version: 1.0
 */
public class Item {

    //图文消息标题
    private String Title;
    //图文消息描述
    private String Description;
    //图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
    private String PicUrl;
    //点击图文消息跳转链接
    private String Url;

    public Item(){}

    public Item(String title, String description, String picUrl, String url) {
        Title = title;
        Description = description;
        PicUrl = picUrl;
        Url = url;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
