package com.springboot.shiro.entity.ins;

import java.io.Serializable;

/**
 * 
 * @author ztgreat
 */
public class SingleUserRolesBoIns  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String roleName ;
	
	//同roleName
	private String label;
	
	
	private String roleId;
	
	//同roleId
	private String key;
	
	//同roleId
	private String value;
	
	
	//角色是否分配到用户，“1”：已分配，“0”：未分配
	private String allocationFlag;
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
		setLabel(roleName);
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
		setKey(roleId);
		setValue(roleId);
	}
	public String getAllocationFlag() {
		return allocationFlag;
	}
	public void setAllocationFlag(String allocationFlag) {
		this.allocationFlag = allocationFlag;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
