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
package net.ymate.web.taglib.bootstrap;

/**
 * 表单控件--单选
 *
 * @author 刘镇 (suninformation@163.com) on 16/11/13 上午6:48
 */
public class RadioTag extends CheckboxTag {

    public RadioTag() {
    }

    @Override
    protected void doSetTagName() {
        this.set_tag("input");
        this.set_unclosed(true);
        this.getDynamicAttributes().put("type", "radio");
    }
}
