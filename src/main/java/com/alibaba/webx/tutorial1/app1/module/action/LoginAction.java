package com.alibaba.webx.tutorial1.app1.module.action;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.webx.tutorial1.app1.LoginObject;

public class LoginAction {
        		public void doCheck(@FormGroup("login") LoginObject param, Navigator nav, Context context) {
        			String name = param.getName();
        			String passwd = param.getPasswd();
        			if ("taobao".equals(name) && "hello123".equals(passwd)) {
        				nav.redirectTo("app1Link").withTarget("hello")
        				.withParameter("name", name);
        			} else {
        				context.put("errorMsg", "Name or Password is invalid.");
        			}
        		}
        }