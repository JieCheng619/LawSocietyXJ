package com.legal.sys.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ��֯�����
 * ����ȷ����֮֯��Ĺ����ϵ
 * @author CJ
 *
 */
@Entity
@Table(name="t_org_rule")
public class OrgRule {
	//Ĭ�Ϲ������ͣ���ʾֱ���͵Ĺ���ĳ����ְ֯�ܹ������������������֯
	public final static int DEFAULT_TYPE = 0;
	//���Թ������е���֯�����е���Ϣ
	public final static int ALL_TYPE = 1;
	//�Զ���Ĺ������ͣ�����Ǹù������ͣ���Ҫ��managerOrg����ֶ��л�ȡ���Թ�������е���֯
	public final static int DEF_TYPE = 2;
	//�����֯�Ĺ�����������-1����ʾ���߱�������
	public final static int NO_TYPE = -1;
	private int id;
	/**
	 * ��֯id
	 */
	private int orgId;
	/**
	 * ����Ĺ�����֯,����������ΪDEF_TYPEʱ���ʹӸ��ֶ����ҵ����еĿ��Թ������֯
	 * (2)(3)(2)
	 * ����洢���ǹ�����֯�ĸ���֯
	 * 55|
	 */
	private String managerOrg;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="org_id")
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	@Column(name="manager_org")
	public String getManagerOrg() {
		return managerOrg;
	}
	public void setManagerOrg(String managerOrg) {
		this.managerOrg = managerOrg;
	}
}