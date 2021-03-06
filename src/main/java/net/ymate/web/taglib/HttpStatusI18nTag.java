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
 * @author ει (suninformation@163.com) on 2017/11/19 δΈε12:39
 */
public class HttpStatusI18nTag extends AbstractTagSupport {

    private int code;

    @Override
    protected Object doProcessTagData() throws JspException {
        return WebUtils.httpStatusI18n(WebUtils.getOwner(), code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
