package com.jk.model;

import java.io.Serializable;

/**
 *
 */
public class Tree implements Serializable{
    private static final long serialVersionUID = 3301840090776675147L;
    private Integer id;

    private String text;

    private String url;

    private Integer pid;
    
    private Boolean checked=false;

    public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

	@Override
	public String toString() {
		return "Tree [id=" + id + ", text=" + text + ", url=" + url + ", pid="
				+ pid + ", checked=" + checked + "]";
	}
    
}