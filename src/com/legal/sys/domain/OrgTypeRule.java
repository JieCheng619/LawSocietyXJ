package com.legal.sys.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ��֯�������͵Ĺ��������ȷ����֮֯��Ĺ�ϵ
 * @author KongHao
 *
 */
@Entity
@Table(name="t_org_type_rule")
public class OrgTypeRule {
	/**
	 * �����ʶ
	 */
	private int id;
	/**
	 * ����ĸ�id
	 */
	private int pid;
	/**
	 * �������id
	 */
	private int cid;
	/**
	 * ����֮������������Ϊ-1��ʾ���������޶��
	 */
	private int num;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
