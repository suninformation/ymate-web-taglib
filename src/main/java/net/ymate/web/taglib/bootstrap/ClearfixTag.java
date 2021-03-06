/*
 * Copyright 2007-2016 the original author or authors.
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
 * Clearfix
 *
 * @author ει (suninformation@163.com) on 16/11/15 δΈε5:11
 */
public class ClearfixTag extends ElementsTag {

    public ClearfixTag() {
    }

    @Override
    protected StringBuilder doTagStart() {
        this.set_class(String.format("%s clearfix", StringUtils.trimToEmpty(this.get_class())));
        //
        return super.doTagStart();
    }
}
