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
 * Blockquote
 *
 * @author ει (suninformation@163.com) on 16/11/15 δΈε5:00
 */
public class BlockquoteTag extends ElementsTag {

    private boolean reverse;

    public BlockquoteTag() {
    }

    @Override
    protected void doSetTagName() {
        this.set_tag("blockquote");
    }

    @Override
    protected StringBuilder doTagStart() {
        if (reverse) {
            this.set_class(String.format("%s blockquote-reverse", StringUtils.trimToEmpty(this.get_class())));
        } else {
            this.set_class(StringUtils.trimToEmpty(this.get_class()));
        }
        //
        return super.doTagStart();
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }
}
