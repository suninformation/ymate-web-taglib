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
 * 输入框组容器
 *
 * @author 刘镇 (suninformation@163.com) on 16/11/13 上午8:37
 */
public class InputGroupTag extends ElementsTag {

    private boolean addon;
    private boolean btn;

    private boolean small;
    private boolean large;

    public InputGroupTag() {
    }

    @Override
    protected StringBuilder doTagStart() {
        StringBuilder builder = new StringBuilder(StringUtils.trimToEmpty(this.get_class()));
        if (addon || btn) {
            if (btn) {
                builder.append(" input-group-btn");
            } else {
                builder.append(" input-group-addon");
            }
        } else {
            builder.append(" input-group");
            if (small) {
                builder.append(" input-group-sm");
            } else if (large) {
                builder.append(" input-group-lg");
            }
        }
        //
        this.set_class(builder.toString());
        //
        return super.doTagStart();
    }

    public boolean isAddon() {
        return addon;
    }

    public void setAddon(boolean addon) {
        this.addon = addon;
    }

    public boolean isBtn() {
        return btn;
    }

    public void setBtn(boolean btn) {
        this.btn = btn;
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
