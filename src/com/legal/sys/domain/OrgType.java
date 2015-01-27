package com.legal.sys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_org_type")
/**
 * 组织结构类型
 */
public class OrgType {
/*
 * 类型的id
 */
private int id;
/*
 * 类型的名字
 */
private String name;
/*
 * 类型的sn
 */
private String sn;
@Id
@GeneratedValue
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSn() {
	return sn;
}
public void setSn(String sn) {
	this.sn = sn;
}

}
