package com.composum.sling.core.usermanagement.view;

import com.composum.sling.core.console.ConsoleSlingBean;

/**
 * Created by mzeibig on 17.11.15.
 */
public class Group extends ConsoleSlingBean {
    private String groupId;
    private String groupPath;

    public String getGroupId() {
        return groupId;
    }

    public String getGroupPath() {
        return groupPath;
    }

    public String getSuffix() {
        return getRequest().getRequestPathInfo().getSuffix();
    }


}
