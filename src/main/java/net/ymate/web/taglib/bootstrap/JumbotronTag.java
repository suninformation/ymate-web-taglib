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


import net.ymate.web.taglib.ElementsTag;
import org.apache.commons.lang3.StringUtils;

/**
 * 巨幕
 *
 * @author 刘镇 (suninformation@163.com) on 16/11/16 上午1:45
 */
public class JumbotronTag extends ElementsTag {

    public JumbotronTag() {
    }

    @Override
    protected StringBuilder doTagStart() {
        //
        this.set_class(String.format("%s jumbotron", StringUtils.trimToEmpty(this.get_class())));
        //
        return super.doTagStart();
    }
}
