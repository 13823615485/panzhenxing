package com.wechat.entity.scan.req.product;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 商品信息
 * @Author: zhengyw
 * @Date: 2017/7/5 21:59
 * @Version: 1.0
 */
public class BrandInfo {

    //商品的基本信息
    private BaseInfo base_info;
    //商品的详细描述信息
    private DetailInfo detail_info;
    //商品的推广服务区信息
    private ActionInfo action_info;
    //商品的组件信息
    private ModuleInfo module_info;

    public BaseInfo getBase_info() {
        return base_info;
    }

    public void setBase_info(BaseInfo base_info) {
        this.base_info = base_info;
    }

    public DetailInfo getDetail_info() {
        return detail_info;
    }

    public void setDetail_info(DetailInfo detail_info) {
        this.detail_info = detail_info;
    }

    public ActionInfo getAction_info() {
        return action_info;
    }

    public void setAction_info(ActionInfo action_info) {
        this.action_info = action_info;
    }

    public ModuleInfo getModule_info() {
        return module_info;
    }

    public void setModule_info(ModuleInfo module_info) {
        this.module_info = module_info;
    }
}
