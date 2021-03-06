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
 * 分页
 *
 * @author 刘镇 (suninformation@163.com) on 16/11/15 上午1:11
 */
public class PaginationTag extends ElementsTag {

    private boolean pager;

    private boolean nonNav;

    private boolean small;
    private boolean large;

    public PaginationTag() {
    }

    @Override
    protected void doSetTagName() {
        this.set_tag(StringUtils.defaultIfBlank(this.get_tag(), "ul"));
    }

    @Override
    protected StringBuilder doTagStart() {
        StringBuilder builder = new StringBuilder(StringUtils.trimToEmpty(this.get_class()));
        if (pager) {
            builder.append(" pager");
        } else {
            builder.append(" pagination");
            if (small) {
                builder.append(" pagination-sm");
            } else if (large) {
                builder.append(" pagination-lg");
            }
        }
        //
        this.set_class(builder.toString());
        //
        return super.doTagStart();
    }

    @Override
    protected StringBuilder doTagContent(StringBuilder tagContent, StringBuilder bodyContent) {
        if (!nonNav) {
            return super.doTagContent(tagContent.insert(0, "<nav>"), bodyContent).append("</nav>");
        }
        return super.doTagContent(tagContent, bodyContent);
    }

    public boolean isPager() {
        return pager;
    }

    public void setPager(boolean pager) {
        this.pager = pager;
    }

    public boolean isNonNav() {
        return nonNav;
    }

    public void setNonNav(boolean nonNav) {
        this.nonNav = nonNav;
    }

    public boolean isSmall() {
        return small;
    }

    public void setSmall(boolean small) {
        this.small = small;
    }

    public boolean isLarge() {
        return large;
    }

    public void setLarge(boolean large) {
        this.large = large;
    }
}
