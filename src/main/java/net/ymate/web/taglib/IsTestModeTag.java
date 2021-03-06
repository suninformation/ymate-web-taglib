/*
 * Copyright 2007-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ymate.web.taglib;

import net.ymate.platform.webmvc.util.WebUtils;

import javax.servlet.jsp.JspException;

/**
 * 判断当前平台是否运行于测试模式，若为true则执行标签体
 *
 * @author 刘镇 (suninformation@163.com) on 2020/1/6 2:21 下午
 */
public class IsTestModeTag extends AbstractTagSupport {

    private static final long serialVersionUID = 8204360518278690940L;

    @Override
    protected Object doProcessTagData() throws JspException {
        return WebUtils.getOwner().getOwner().isTestEnv() ? true : null;
    }
}
