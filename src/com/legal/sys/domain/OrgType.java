package com.legal.sys.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_org_type")
/**
 * ��֯�ṹ����
 */
public class OrgType {
/*
 * ���͵�id
 */
private int id;
/*
 * ���͵�����
 */
private String name;
/*
 * ���͵�sn
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
