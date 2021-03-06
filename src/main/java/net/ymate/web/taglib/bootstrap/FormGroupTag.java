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
 * 表单组容器
 *
 * @author 刘镇 (suninformation@163.com) on 16/11/13 上午2:55
 */
public class FormGroupTag extends ElementsTag {

    private String feedbackIcon;
    private boolean hasWarning;
    private boolean hasError;
    private boolean hasSuccess;

    private boolean small;
    private boolean large;

    public FormGroupTag() {
    }

    @Override
    protected StringBuilder doTagStart() {
        StringBuilder builder = new StringBuilder(StringUtils.trimToEmpty(this.get_class()));
        builder.append(" form-group");
        if (StringUtils.isNotBlank(feedbackIcon)) {
            builder.append(" has-feedback");
        }
        if (hasWarning) {
            builder.append(" has-warning");
        } else if (hasError) {
            builder.append(" has-error");
        } else if (hasSuccess) {
            builder.append(" has-success");
        }
        if (small) {
            builder.append(" form-group-sm");
        } else if (large) {
            builder.append(" form-group-lg");
        }
        //
        this.set_class(builder.toString());
        //
        return super.doTagStart();
    }

    public String getFeedbackIcon() {
        return feedbackIcon;
    }

    public void setFeedbackIcon(String feedbackIcon) {
        this.feedbackIcon = feedbackIcon;
    }

    public boolean isHasWarning() {
        return hasWarning;
    }

    public void setHasWarning(boolean hasWarning) {
        this.hasWarning = hasWarning;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public boolean isHasSuccess() {
        return hasSuccess;
    }

    public void setHasSuccess(boolean hasSuccess) {
        this.hasSuccess = hasSuccess;
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
