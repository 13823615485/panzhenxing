//package com.zhidian.wxentry.wxinterface;
//
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//
//import javax.servlet.*;
//import java.io.IOException;
//
///**
// * Created with IntelliJ IDEA.
// *
// * @Description: DelegatingFilterProxy代理，通过代理根据配置来找到实际的Servlet
// * @Author: zhengyw
// * @Date: 2017/11/22 15:27
// * @Version: 1.0
// */
//public class DelegatingServletProxy extends GenericServlet{
//
//    private String targetBean;
//    private Servlet proxy;
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        proxy.service(req, res);
//    }
//
//    @Override
//    public void init() throws ServletException {
//        this.targetBean = getServletName();
//        getServletBean();
//        proxy.init(getServletConfig());
//    }
//
//    private void getServletBean() {
//        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
//        this.proxy = (Servlet) wac.getBean(targetBean);
//    }
//
//}
